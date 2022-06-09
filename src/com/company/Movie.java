package com.company;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDescription() {
        return this.description;
    }

    public Director getDirector() {
        return this.director;
    }

    public List<Cast> getCast() {
        return this.cast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public String toString() {
        return "\nMovie: " + this.getName() +
                "\nyear: " + this.getYear() +
                "\ndescription: " + this.getDescription() +
                "\ndirector: " + this.getDirector() +
                "\ncast: " + this.getCast() + ")";
    }
}
