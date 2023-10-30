package br.com.war.war_ecommerce.service;

import br.com.war.war_ecommerce.dto.CategoryDto;
import br.com.war.war_ecommerce.exception.GenericException;
import br.com.war.war_ecommerce.model.Categories;
import br.com.war.war_ecommerce.repositories.CategoryRepository;
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
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public Page<CategoryDto> findAllPage(PageRequest pageRequest){
        Page<Categories> list = categoryRepository.findAll(pageRequest);
        return list.map(x -> new CategoryDto(x));
    }

    @Transactional(readOnly = true)
    public CategoryDto findbyId(Integer id) throws GenericException {
        Optional<Categories> obj = categoryRepository.findById(id);
        Categories entity = obj.orElseThrow(() -> new GenericException("entidade categoria não encontrada"));

        return new CategoryDto(entity);
    }

    @Transactional
    public CategoryDto insert(CategoryDto dto){
        Categories entity = new Categories();
        entity.setName(dto.getName());
        entity = categoryRepository.save(entity);
        return new CategoryDto(entity);
    }

    @Transactional
    public CategoryDto update(Integer id, CategoryDto dto) throws GenericException {
        try {
            Categories entity = categoryRepository.getById(id.intValue());
            entity.setName(dto.getName());
            entity = categoryRepository.save(entity);
            return new CategoryDto(entity);
        }catch (EntityNotFoundException e){
            throw new GenericException("Id: "+ id +" não encontrado" );
        }


    }

    public void delete(Integer id) throws GenericException {
        try {
            categoryRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new GenericException("Id não encontrado: "+id);
        } catch (DataIntegrityViolationException e){
            throw new GenericException("Ação executada violação da integridade dos dados");
        }
    }



}
