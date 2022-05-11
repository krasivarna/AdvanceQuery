package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class IngrediantServiceImpl implements IngrediantService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngrediantServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> selectInNames(List<String> names) {
        return this.ingredientRepository.findByNameInOrderByPriceAsc(names);
    }

    @Override
    @Transactional
    public int deleteByName(String name) {
        return this.ingredientRepository.deleteByName(name);
    }

    @Transactional
    @Override
    public void increasePriceBy(double percent) {
        BigDecimal actualPercent= BigDecimal.valueOf(percent);
        this.ingredientRepository.increasePriceByPercent(actualPercent);
    }
}
