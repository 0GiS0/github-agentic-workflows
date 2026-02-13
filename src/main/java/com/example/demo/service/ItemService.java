package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public ItemService() {
        // Datos de ejemplo
        items.add(new Item(counter.incrementAndGet(), "Item 1", "Descripción del item 1"));
        items.add(new Item(counter.incrementAndGet(), "Item 2", "Descripción del item 2"));
    }

    public List<Item> findAll() {
        return new ArrayList<>(items);
    }

    public Optional<Item> findById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public Item save(Item item) {
        if (item.getId() == null) {
            item.setId(counter.incrementAndGet());
            items.add(item);
        } else {
            deleteById(item.getId());
            items.add(item);
        }
        return item;
    }

    public boolean deleteById(Long id) {
        return items.removeIf(item -> item.getId().equals(id));
    }
}
