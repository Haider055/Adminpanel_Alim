package com.dumb.adminpanel_alim.models;

public class model_all_alims {
    String name,description,email;

    public model_all_alims(String name, String description,String email) {
        this.name = name;
        this.description = description;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
