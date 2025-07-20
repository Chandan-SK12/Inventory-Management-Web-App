package com.example.inventory.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final List<String> items = new ArrayList<>();

    @GetMapping
    public List<String> getItems() {
        return items;
    }

    @PostMapping
    public String addItem(@RequestBody String item) {
        items.add(item);
        return "Item added: " + item;
    }
}
