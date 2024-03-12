package com.example.springapi.api.controller;

import com.example.springapi.api.model.Item;
import com.example.springapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/item")
    public Item getItem(@RequestParam Integer id) {
        Optional item = itemService.getItem(id);

        if(item.isPresent()) {
            return (Item) item.get();
        }
        return null;
    }
}
