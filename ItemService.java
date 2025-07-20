package com.example.inventory.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ItemService {

    private final List<String> items = new ArrayList<>();

    public List<String> getAllItems() {
        return items;
    }

    public void addItem(String item) {
        items.add(item);
    }
}
