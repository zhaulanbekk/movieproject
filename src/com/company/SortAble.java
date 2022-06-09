package com.company;

import java.util.List;

public interface SortAble {

    void sortMovieByName(List<Movie>movies);

    void sortMovieByYear(List<Movie>movies);

    void sortMovieByDirector(List<Movie>movies);

    void sortByActor(List<Movie>movies);


}
