package br.com.war.war_ecommerce.service;

import br.com.war.war_ecommerce.dto.CategoryDto;
import br.com.war.war_ecommerce.dto.ProductDto;
import br.com.war.war_ecommerce.exception.GenericException;
import br.com.war.war_ecommerce.model.Categories;
import br.com.war.war_ecommerce.model.Products;
import br.com.war.war_ecommerce.repositories.CategoryRepository;
import br.com.war.war_ecommerce.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<ProductDto> searchAll(PageRequest pageRequest){
        Page<Products> list = productRepository.findAll(pageRequest);
        return list.map(x -> new ProductDto(x));
    }

    @Transactional(readOnly = true)
    public ProductDto findById(Integer id) throws GenericException {
        Optional<Products> obj = productRepository.findById(id);
        //Products entity = obj.get();
        Products entity =obj.orElseThrow(() -> new GenericException("recurso nao encontrado"));
        return new ProductDto(entity, entity.getCategories());
    }

    @Transactional
    public ProductDto insert(ProductDto dto){
        Products entity = new Products();
        copyToEntity(dto, entity);
        entity = productRepository.save(entity);
        return new ProductDto(entity);

    }

    @Transactional
    public ProductDto update(Integer id, ProductDto dto) throws GenericException {
        try {
            Products entity = productRepository.getReferenceById(id.intValue());
            copyToEntity(dto, entity);
            entity = productRepository.save(entity);
            return new ProductDto(entity);
        }catch (EntityNotFoundException e){
            throw new GenericException("Id: "+ id +" nao encontrado");
        }

    }

    public void delete(Integer id) throws GenericException {
        try {
            productRepository.deleteById(id);

        }catch (EmptyResultDataAccessException e){
            throw new GenericException("Id nao encontrado");
        }catch (DataIntegrityViolationException e){
            throw new GenericException("Violação de integridade");
        }
    }

    private void copyToEntity(ProductDto dto, Products entity) {
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        entity.getCategories().clear();
        for (CategoryDto catDto : dto.getCategories()){
            Categories categories = categoryRepository.getById(catDto.getId());
            entity.getCategories().add(categories);
        }
    }

}
