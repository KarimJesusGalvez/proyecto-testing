package com.example.proyectotesting.service;

import com.example.proyectotesting.entities.Category;
import com.example.proyectotesting.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findOne(Long id) {
        if (id == null || id <= 0)
            return Optional.empty();

        return categoryRepository.findById(id);

    }

    @Override
    public Category save(Category category) {
        if (category == null)
            return null;

        return categoryRepository.save(category);

    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public boolean deleteById(Long id) {
        if (id == null || !categoryRepository.existsById(id)) {
            System.out.println("No existe id a eliminar");
            return false;
        } else {
            categoryRepository.deleteById(id);
        }
        return true;

    }
}
