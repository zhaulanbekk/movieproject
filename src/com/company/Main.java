package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Press 1 to find movies by name:
                Press 2 to find movies by year:
                Press 3 to find movies by description:
                Press 4 to find movies by actor:
                Press 5 to see all movies:
                Press 6 to see sorted movies by name:
                Press 7 to see sorted movies by year:
                Press 8 to see sorted movies by director:
                Press 9 to find movie by director:
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
        FindAble findAble = new FindClass();
        SortAble sortAble = new SortClass();

        Director director6 = new Director("Robbi", "Brenner");
        List<Cast> casts6 = new ArrayList<>();
        casts6.add(new Cast("Arnold", "Victor"));


        Director director5 = new Director("Emre", "Kabakuşak");
        List<Cast> casts5 = new ArrayList<>();
        casts5.add(new Cast("Neslihan", "Nare"));
        casts5.add(new Cast("Engin", "Sancar"));


        Director director4 = new Director("Volkan ", "Kocaturk");
        List<Cast> casts4 = new ArrayList<>();
        casts4.add(new Cast("Neslihan", "Nihan"));
        casts4.add(new Cast("Burak", "Kemal"));

        Director director3 = new Director("Sam", "Raimi");
        List<Cast> casts3 = new ArrayList<>();
        casts3.add(new Cast("Tobey", "spider-man"));
        casts3.add(new Cast("Rosemary", "model"));

        Director director = new Director("Jaulanbek", "Nurkamal uulu");
        List<Cast> casts = new ArrayList<>();
        casts.add(new Cast("Nurdin", "Cowboy"));
        casts.add(new Cast("Dastan", "Badboy"));

        Director director2 = new Director("Nurmuhammed", "Nurbekov");
        List<Cast> casts2 = new ArrayList<>();
        casts2.add(new Cast("Nurtilek", "Student"));
        casts2.add(new Cast("Nurbek", "Hacker"));

        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Java-6", 2022, "Fantastic", director, casts));
        list.add(new Movie("PeakSoft", 2020, "Future IT", director2, casts2));
        list.add(new Movie("Go back home", 2007, "Action", director3, casts3));
        list.add(new Movie("Blind Love", 2015, "Serial", director4, casts4));
        list.add(new Movie("Daughter of the Ambassador", 2019, "Drama", director5, casts5));
        list.add(new Movie("Escape Plan", 2013, "Action", director6, casts6));
        while (true) {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    findAble.findMovieByName(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director:
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 2:
                    findAble.findMovieByYear(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director:
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 3:
                    findAble.findMovieByDescription(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director:
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 4:
                    findAble.findMovieByActor(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director:
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 5:
                    for (Movie m : list) {
                        System.out.println(m + "\n");

                    }
//                    movies(list);
//                    System.out.println(list);
                    break;
                case 6:
                    sortAble.sortMovieByName(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director:
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 7:
                    sortAble.sortMovieByYear(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director: 
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 8:
                    sortAble.sortMovieByDirector(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor:
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director: 
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                    break;
                case 9:
                    findAble.findMovieByDirector(list);
                    System.out.println("""
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                            Press 1 to find movies by name:
                            Press 2 to find movies by year:
                            Press 3 to find movies by description:
                            Press 4 to find movies by actor: 
                            Press 5 to see all movies:
                            Press 6 to see sorted movies by name:
                            Press 7 to see sorted movies by year:
                            Press 8 to see sorted movies by director: 
                            Press 9 to find movie by director:
                            ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
                default:
                    System.err.println("kechirip koi a " +
                            "kiyinki jolu");
//                    System.out.println("""
//                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                Press 1 to find movies by name:
//                Press 2 to find movies by year:
//                Press 3 to find movies by description:
//                Press 4 to find movies by actor:
//                Press 5 to see all movies:
//                Press 6 to see sorted movies by name:
//                Press 7 to see sorted movies by year:
//                Press 8 to see sorted movies by director:
//                Press 9 to find movie by director:
//                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
//            }
            }
        }
    }

//    public static void movies(List<Movie> movie1) {
//        System.out.println("Film: "+movie1.getName());
//        System.out.println("Year: "+movie1.getYear());
//        System.out.println("Description: "+movie1.getDescription());
//        System.out.println("Director: "+movie1.getDirector().getName()+" "+movie1.getDirector().getLastName());
//        for (Cast cast : movie1.getCast()) {
//            System.out.println("Actor: "+cast.getActor());
//            System.out.println("Role: "+ cast.getRole());


}
