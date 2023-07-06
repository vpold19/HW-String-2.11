package com.example.skypro.hw_spring_2_11.Service;

import java.util.List;

public interface BasketServiceInt {
    void add(List<Long> ids);

    List<Long> getAll();
}
