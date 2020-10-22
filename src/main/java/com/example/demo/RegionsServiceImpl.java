package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RegionsServiceImpl implements RegionsService {

    private ConcurrentHashMap<Long, Region> regions = new ConcurrentHashMap<>() {{
        put(1L, new Region(1L, "Кабардино-Балкарская республика", "07"));
        put(2L, new Region(2L, "Ленинградская область", "78"));
    }};

    @Override
    public ConcurrentHashMap<Long, Region> findAll() {
        return regions;
    }

    @Override
    public Region findById(Long id) {
        for (Map.Entry<Long, Region> element : regions.entrySet()) {
            if (element.getKey().equals(id)) return element.getValue();
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        regions.remove(id);
    }

    @Override
    public void add(Region region) {
        if (!regions.contains(region)) {
            regions.put((long) (regions.size() + 1), region);
        }
    }

    @Override
    public void update(Region region) {
        Region r =  regions.get(region.getId());
        regions.put(region.getId(), region);
    }
}
