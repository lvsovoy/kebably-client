package me.lesovoy.kebably.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Item {

    @JsonProperty("name")
    private String name;

    @JsonProperty("property")
    private List<Property> property;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}
