package br.com.war.war_ecommerce.repositories;

import br.com.war.war_ecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

   // @Query("SELECT obj FROM Products obj JOIN FETCH obj.categorie WHERE ob IN :product")
    ///List<Products> searchAll(List<Products> products);
}
