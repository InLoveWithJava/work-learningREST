package com.example.demo;

public class Region {

    private Long id;
    private String name;
    private String abbreviate;

    public Region() {}

    public Region(Long id, String name, String abbreviate) {
        this.id = id;
        this.name = name;
        this.abbreviate = abbreviate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public void setAbbreviate(String abbreviate) {
        this.abbreviate = abbreviate;
    }

}
