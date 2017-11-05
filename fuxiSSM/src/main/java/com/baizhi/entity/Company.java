package com.baizhi.entity;

import java.io.Serializable;

/**
 * create by LiangS
 * on 2017/10/23
 */
public class Company implements Serializable {
    private String id;
    private String name;
    private String type;

    public Company(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Company(String id, String name, String type) {

        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Company() {

    }
}
