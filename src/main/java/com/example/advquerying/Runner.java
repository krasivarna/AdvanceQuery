package com.example.advquerying;

import com.example.advquerying.repository.IngredientRepository;
import com.example.advquerying.repository.ShampooRepository;
import com.example.advquerying.services.IngrediantService;
import com.example.advquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    private final ShampooRepository shampooRepository;
    private final IngredientRepository ingredientRepository;
    private final ShampooService shampooService;
    private final IngrediantService ingredientService;

    @Autowired
    public Runner(ShampooRepository shampooRepository, IngredientRepository ingredientRepository, ShampooService shampooService, IngrediantService ingredientService) {
        this.shampooRepository = shampooRepository;
        this.ingredientRepository = ingredientRepository;
        this.shampooService = shampooService;
        this.ingredientService = ingredientService;
    }

    @Override
    public void run(String... args) throws Exception {
        //this.shampooRepository.findByBrand("Cotton Fresh")
        //        .forEach(s -> System.out.println(s.getPrice()));
        //------------
        //Scanner sc = new Scanner(System.in);
        //String first= sc.nextLine();
        //String second=sc.nextLine();
        //Set<String> names=Set.of(first,second);
        //this.shampooRepository.findByIngredientsNames(names)
        //        .forEach(s -> System.out.println(s.getBrand()));
        //-----------------
        //this.shampooService.selectBySize(Size.MEDIUM);

        //this.ingredientService.selectInNames(List.of("Lavender"))
        //        .forEach(System.out::println);

        //this.ingredientService.deleteByName("Nettle");

        this.ingredientService.increasePriceBy(0.1);
    }
}
