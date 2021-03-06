package com.dumb.adminpanel_alim.models;

public class model_wazaif_of_alim {
    String heading,description;

    public model_wazaif_of_alim(String heading, String description) {
        this.heading = heading;
        this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
