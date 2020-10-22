package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;

@RestController
public class RegionsController {
    private final RegionsServiceImpl regionsServiceImpl;

    public RegionsController(RegionsServiceImpl regionsServiceImpl) {
        this.regionsServiceImpl = regionsServiceImpl;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the program!";
    }

    @GetMapping("/get")
    public ConcurrentHashMap<Long, Region> getAll() {
        return regionsServiceImpl.findAll();
    }

    @GetMapping("/get/{id}")
    public Region getById(@PathVariable Long id) {
        return regionsServiceImpl.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        regionsServiceImpl.deleteById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Region region) {
        regionsServiceImpl.add(region);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Region region) {
        regionsServiceImpl.update(region);
    }
}
