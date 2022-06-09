package com.company;

import java.util.List;

public class SortClass implements SortAble {

    @Override
    public void sortMovieByName(List<Movie> movies) {
        ComparatorByName movieComparatorByName = new ComparatorByName();
        movies.sort(movieComparatorByName);
        for (Movie movie : movies) {
            System.out.println("Film: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Description: " + movie.getDescription());
            System.out.println("Director: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("|~~~~~> Cast <~~~~~|");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
            System.out.println("____________________________________");
        }

    }

    @Override
    public void sortMovieByYear(List<Movie> movies) {
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        movies.sort(comparatorByYear);
        for (Movie movie : movies) {
            System.out.println("Year: " + movie.getYear());
            System.out.println("Film: " + movie.getName());
            System.out.println("Description: " + movie.getDescription());
            System.out.println("Director: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("|~~~~~> Cast <~~~~~|");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
            System.out.println("____________________________________");
        }
    }

    @Override
    public void sortMovieByDirector(List<Movie> movies) {
        ComparatorByDirector comparatorByDirector = new ComparatorByDirector();
        movies.sort(comparatorByDirector);
        for (Movie movie : movies) {
            System.out.println("Director: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("Film: " + movie.getName());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Description: " + movie.getDescription());
            System.out.println("|~~~~~> Cast <~~~~~|");
            for (Cast cast : movie.getCast()) {
                System.out.println("Actor: " + cast.getActor());
                System.out.println("Role: " + cast.getRole());
            }
            System.out.println("____________________________________");
        }
    }

    @Override
    public void sortByActor(List<Movie> movies) {

    }
}
