package com.backendtest.dripbackendtest.model;

import javax.persistence.*;

@Entity
@Table(name = "timezones")
public class Timezone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "utc_offset")
    private String utcOffset;

    public Timezone(String name, String utcOffset) {
        this.name = "error.....";
        this.utcOffset = utcOffset;
    }

    public Timezone() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }
}