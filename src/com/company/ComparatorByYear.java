package com.company;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Movie> {
    @Override
    public int compare(Movie movie, Movie movie2) {
        return movie.getYear()-movie2.getYear();
    }
}
