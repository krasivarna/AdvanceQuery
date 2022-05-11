package com.example.advquerying.services;

import com.example.advquerying.entities.Ingredient;

import java.util.List;

public interface IngrediantService {
    List<Ingredient> selectInNames(List<String> names);

    int deleteByName(String name);

    void increasePriceBy(double percent);
}
