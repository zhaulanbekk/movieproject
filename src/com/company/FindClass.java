package com.company;

import java.util.List;
import java.util.Scanner;

public class FindClass implements FindAble {
    Scanner sc = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Enter the name of film: ");
        String movieName = sc.nextLine();
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
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
    }

    @Override
    public void findMovieByActor(List<Movie> movies) {
        System.out.println("Enter the Actor name: ");
        String actorName = sc.nextLine();

        for (Movie movie : movies) {
            for (Cast cast: movie.getCast()) {
                if (cast.getActor().equals(actorName)) {
                    System.out.println("Actor: "+cast.getActor());
                    System.out.println("Role: "+cast.getRole());
                    System.out.println("Movie: " + movie.getName());
                    System.out.println("Year: " + movie.getYear());
                    System.out.println("Description: " + movie.getDescription());
                    System.out.println("Director: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
                    System.out.println();

                }
            }

        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Enter the year fo find film: ");
        int year = sc.nextInt();
        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                System.out.println("Year: " + movie.getYear());
                System.out.println("Movie: " + movie.getName());
                System.out.println("Description: " + movie.getDescription());
                System.out.println("Director: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
                for (Cast cast : movie.getCast()) {
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: " + cast.getRole());
                }
                System.out.println("____________________________________");

            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Enter the Director name: ");
        String directorName=sc.nextLine();
        for (Movie movie : movies) {
            if (movie.getDirector().getName().equals(directorName)) {
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
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Enter the Type Of Film: ");
        String description=sc.nextLine();
        for (Movie movie : movies) {
            if (movie.getDescription().equals(description)) {
                System.out.println("Description: " + movie.getDescription());
                System.out.println("Film: " + movie.getName());
                System.out.println("Year: " + movie.getYear());
                System.out.println("Director: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
                System.out.println("|~~~~~> Cast <~~~~~|");
                for (Cast cast : movie.getCast()) {
                    System.out.println("Actor: " + cast.getActor());
                    System.out.println("Role: " + cast.getRole());
                }
                System.out.println("____________________________________");
            }
        }
    }
}
