package com.example.mongo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {
    private Integer id;
    private String name;
    private String teamName;
    private long salary;

    public Users(int id, String name, String teamName, long salary) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
