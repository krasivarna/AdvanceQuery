package com.example.advquerying.repository;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Repository
public interface ShampooRepository extends JpaRepository <Shampoo,Long> {
    List<Shampoo> findByBrand(String brand);

    @Query("Select s from Shampoo s " +
            " join s.ingredients as i"+
            " Where i.name in :ingredientNames")
    List<Shampoo> findByIngredientsNames(Set<String> ingredientNames);

    List<Shampoo> findBySize(Size size);

    List<Shampoo> findBySizeOrLabelIdOrderByPriceAsc(Size size,long labelId);

    List<Shampoo> findByPriceGreaterThanOrderByPriceDesc(BigDecimal price);
}
