package com.example.springapi.service;

import com.example.springapi.api.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private List<Item> itemList;

    public ItemService() {
        itemList = new ArrayList<>();

        Item item1 = new Item(1, "Appel", 3);
        Item item2 = new Item(2, "Peer", 2);

        itemList.addAll(Arrays.asList(item1, item2));
    }

    public Optional<Item> getItem(Integer id) {
        Optional optional = Optional.empty();

        for (Item item: itemList) {
            if (id == item.getId()) {
                optional = Optional.of(item);
                return optional;
            }
        }
        return optional;
    }
}
