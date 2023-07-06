package com.example.skypro.hw_spring_2_11.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
@SessionScope
public class BasketService implements BasketServiceInt {
    private final List<Long> id;
    public BasketService(){
        id = new ArrayList<>();
    }
    @Override
    public void add(List<Long> ids){
        this.id.addAll(ids);
    }
    @Override
    public List<Long> getAll(){
        return Collections.unmodifiableList(id);
    }
}
