package movieService.impl;

import db.DataBase;
import movieService.FindableMovie;
import movies.Genre;

import java.time.LocalDate;
import java.time.Year;

public class FindableMovieimpl implements FindableMovie {


    @Override
    public void getAllMovies() {
        System.out.println(DataBase.arrayListMovie);
        System.out.println("Все фильмы !");
    }

    @Override
    public void findMovieByNameOrPartName(String name) {
        for (int i = 0; i < DataBase.arrayListMovie.size(); i++) {
            if (DataBase.arrayListMovie.get(i).getNameMovie().equalsIgnoreCase(name)){
                System.out.println(DataBase.arrayListMovie.get(i));
                System.out.println("Фильмы и именем названия фильмы !");
            }
        }
    }
    @Override
    public void findMovieByActorName(String actorName) {
        for (int i = 0; i < DataBase.arrayListMovie.size(); i++) {
            for (int j = 0; j < DataBase.arrayListMovie.get(i).actorArrayList.size(); j++) {
                if (DataBase.arrayListMovie.get(i).actorArrayList.get(j).getFullName().equalsIgnoreCase(actorName)){
                    System.out.println(DataBase.arrayListMovie.get(i));
                    System.out.println("Фильмы с именем актеров !");
                }
            }
        }
    }
    @Override
    public void findMovieByYear(LocalDate localDate) {
        for (int i = 0; i < DataBase.arrayListMovie.size(); i++) {
            if (DataBase.arrayListMovie.get(i).getLocalDateMovie().equals(localDate)){
                System.out.println(DataBase.arrayListMovie.get(i));
                System.out.println("Фильмы с датами !");
            }
        }

    }

    @Override
    public void findMovieByProducer(String producerName) {
        for (int i = 0; i < DataBase.arrayListMovie.size(); i++) {
            if (DataBase.arrayListMovie.get(i).producer.getProducerName().equalsIgnoreCase(producerName)){
                System.out.println(DataBase.arrayListMovie.get(i));
                System.out.println("Фильмы с именем продюсер !");
            }
        }

    }

    @Override
    public void findMovieByGenre(Genre genre) {
        for (int i = 0; i < DataBase.arrayListMovie.size(); i++) {
            if (DataBase.arrayListMovie.get(i).getGenre().equals(genre)){
                System.out.println(DataBase.arrayListMovie.get(i));
                System.out.println("Фильмы по жанрам");
            }
        }
    }

    @Override
    public void findMovieByRole(String role) {
        for (int i = 0; i < DataBase.arrayListMovie.size(); i++) {
            for (int l = 0; l < DataBase.arrayListMovie.get(i).actorArrayList.size(); l++) {
                if (DataBase.arrayListMovie.get(i).actorArrayList.get(l).getRole().equalsIgnoreCase(role)){
                    System.out.println(DataBase.arrayListMovie.get(i));
                    System.out.println("Фильмы с ролями !");
                }
            }
        }

    }
}
