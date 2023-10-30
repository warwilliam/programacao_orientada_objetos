package br.com.war.war_ecommerce.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;
    private Double price;
    private String image;

    //Temestamps automaticos
    @Column(columnDefinition = "TIMESTAMP")
    private Instant created;
    @Column(columnDefinition = "TIMESTAMP")
    private Instant updated;

    @PrePersist
    public void BeforeSave(){
        created = Instant.now();
    }

    @PreUpdate
    public void BeforeUpdate(){
        updated =  Instant.now();
    }
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "products_categories",
                    joinColumns = @JoinColumn(name = "product_id"),
                    inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Categories> categories = new HashSet<>();
    //Conceito de conjunto sem repetição


    public Products(Integer id, String title, String description, Double price, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public Products() {
    }

    public Set<Categories> getCategories() {
        return categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getUpdated() {
        return updated;
    }


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
