package com.example.demo;

import java.util.concurrent.ConcurrentHashMap;

public interface RegionsService {
    ConcurrentHashMap<Long, Region> findAll();
    Region findById(Long id);
    void deleteById(Long id);
    void add(Region region);
    void update (Region region);
}
