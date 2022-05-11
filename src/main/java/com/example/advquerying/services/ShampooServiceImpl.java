package com.example.advquerying.services;

import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import com.example.advquerying.repository.ShampooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShampooServiceImpl implements ShampooService {
    private final ShampooRepository shampooRepositoty;

    @Autowired
    public ShampooServiceImpl(ShampooRepository shampooRepositoty) {
        this.shampooRepositoty = shampooRepositoty;
    }

    @Override
    public List<Shampoo> selectBySize(Size size) {
        return this.shampooRepositoty.findBySize(size);
    }
}
