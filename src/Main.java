import db.DataBase;
import movieService.FindableMovie;
import movieService.Sortable;
import movieService.impl.FindableMovieimpl;
import movieService.impl.Sortableimpl;
import movies.Actor;
import movies.Genre;
import movies.Movie;
import movies.Producer;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Actor> actorArrayList = new ArrayList<>(List.of(
                new Actor(1,"Aliaskar","Supermen"),
                new Actor(2,"Jigit","Batman"),
                new Actor(3,"Mirlan","Hulk")
        ));
        ArrayList<Actor> actorArrayList2 = new ArrayList<>(List.of(
                new Actor(1,"Argen","SuperMario"),
                new Actor(2,"Adis","Ralph"),
                new Actor(3,"Duulat","Flash")
        ));
        ArrayList<Actor> actorArrayList3 = new ArrayList<>(List.of(
                new Actor(1,"Ali","Eran"),
                new Actor(2,"Adi","Mikasa"),
                new Actor(3,"Urmat","Levi")
        ));
        Producer producer = new Producer(1,"Nurbek","Aibashov");
        Producer producer2 = new Producer(2,"Ruslan","Akun");
        Producer producer3 = new Producer(3,"Aliaskar","Temirbekov");

         ArrayList<Movie> movieArrayList = new ArrayList<>(List.of(
                 new Movie(1,"Salam New-York", LocalDate.of(2015,5,5), Genre.TRILLER,producer,actorArrayList),
                 new Movie(2,"TOR", LocalDate.of(2020,4,20), Genre.TRILLER,producer2,actorArrayList2),
                 new Movie(3,"Attack Titans", LocalDate.of(2019,1,5), Genre.ClASSIK,producer3,actorArrayList3)
         ));

         DataBase.arrayListMovie.addAll(movieArrayList);

         while (true){
             System.out.println(""" 
                   <<<<<<<<     Movie Info   >>>>>>>>>>
                          1.Findable Movie
                          2.Sortable Movie 
                          3.Exit        
                     
                     """);
             switch (new Scanner(System.in).nextLine()){
                 case "1" ->findAble();
                 case "2" ->sortAble();
                 case "3" -> {
                     return;
                 }
             }
         }
    }

    public static void findAble(){
        FindableMovie findableMovie = new FindableMovieimpl();
        while (true){
            System.out.println("""
                            Movie
                    1.getAllMovies
                    2.findMovieByNameOrPartName    
                    3.findMovieByActorName
                    4.findMovieByYear
                    5.findMovieByProducer
                    6.findMovieByGenre
                    7.findMovieByRole    
                    0. Exit 
                  
                    """);

            switch (new Scanner(System.in).nextLine()){
                case "1" -> findableMovie.getAllMovies();
                case "2" -> findableMovie.findMovieByNameOrPartName("TOR");
                case "3" -> findableMovie.findMovieByActorName("Ali");
                case "4" -> findableMovie.findMovieByYear(LocalDate.of(2020,4,20));
                case "5" -> findableMovie.findMovieByProducer("Nurbek");
                case "6" -> findableMovie.findMovieByGenre(Genre.TRILLER);
                case "7" -> findableMovie.findMovieByRole("SuperMario");
                case "0" -> {
                    return;
                }
            }
        }
    }

    public static void sortAble(){
        Sortable sortable = new Sortableimpl();
        while (true){
            System.out.println("""
                               Sort
                    1. sortByMovieName
                    2. sortByYear
                    3. sortByProducer          
                    """);

            switch (new Scanner(System.in).nextLine()){
                case "1" -> sortable.sortByMovieName("desc");
                case "2" -> sortable.sortByYear("desc");
                case "3" -> sortable.sortByProducer();

            }
        }
    }
}