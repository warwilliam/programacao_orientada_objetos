package org.example.model;

public class Medicine {

    private Integer id;
    private String name;
    private String laboratory;

    private Integer quantity;
    private double price;

    public Medicine() {
    }

    public Medicine(Integer id, String name, String laboratory, Integer quantity, double price) {
        this.id = id;
        this.name = name;
        this.laboratory = laboratory;
        this.quantity = quantity;
        this.price = price;
    }

    public Medicine(String name, String laboratory, Integer quantity, double price) {
        this.name = name;
        this.laboratory = laboratory;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", laboratory='" + laboratory + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
