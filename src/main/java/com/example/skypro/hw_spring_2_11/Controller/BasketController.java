package com.example.skypro.hw_spring_2_11.Controller;

import com.example.skypro.hw_spring_2_11.Service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Long> id) {
        basketService.add(id);
    }


    @GetMapping("/get")
    public List<Long> get() {
        return basketService.getAll();
    }
}
