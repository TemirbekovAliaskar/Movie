package movieService.impl;

import db.DataBase;
import movieService.Sortable;
import movies.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sortableimpl implements Sortable {
    @Override
    public void sortByMovieName(String ascOrDesc) {
        LinkedList<Movie> sorted = new LinkedList<>(DataBase.arrayListMovie);
        if ("asc".equalsIgnoreCase(ascOrDesc)) {
            Collections.reverse(sorted);
        }
        DataBase.arrayListMovie = sorted;
        System.out.println(sorted);
    }
    @Override
    public void sortByYear(String ascOrDesc) {
        LinkedList<Movie> movieLinkedListSort = new LinkedList<>(DataBase.arrayListMovie);
        if ("desc".equalsIgnoreCase(ascOrDesc)){
           Movie.comparator = Movie.comparator.reversed();
        }
        movieLinkedListSort.sort(Movie.comparator);
        DataBase.arrayListMovie = movieLinkedListSort;
        System.out.println(movieLinkedListSort);
    }

    @Override
    public void sortByProducer() {
        LinkedList<Movie> movieLinkedListSortProducer = new LinkedList<>();
        System.out.println("Sort by producer !");
        DataBase.arrayListMovie.sort(Movie.producerComparator);
        System.out.println(DataBase.arrayListMovie);
    }
}
