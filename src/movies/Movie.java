package movies;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie> {

    private int id;
    private String nameMovie;
    private LocalDate localDateMovie;
    private Genre genre;
    public Producer producer;
    public ArrayList<Actor> actorArrayList ;

    public Movie(int id, String nameMovie, LocalDate localDateMovie, Genre genre, Producer producer, ArrayList<Actor> actorArrayList) {
        this.id = id;
        this.nameMovie = nameMovie;
        this.localDateMovie = localDateMovie;
        this.genre = genre;
        this.producer = producer;
        this.actorArrayList = actorArrayList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public LocalDate getLocalDateMovie() {
        return localDateMovie;
    }

    public void setLocalDateMovie(LocalDate localDateMovie) {
        this.localDateMovie = localDateMovie;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public ArrayList<Actor> getActorArrayList() {
        return actorArrayList;
    }

    public void setActorArrayList(ArrayList<Actor> actorArrayList) {
        this.actorArrayList = actorArrayList;
    }



    @Override
    public String toString() {
        return   "              Movie      " +
                "id=" + id +
                "📽️ nameMovie -->> " + nameMovie + "\n" +
                " localDateMovie -->> " + localDateMovie + "\n"+
                " genre -->> " + genre + "\n" +
                " producer -->> " + producer + "\n" +
                " actorArrayList -->> " + actorArrayList +
                ']';
    }

    @Override
    public int compareTo(Movie o) {
        return this.nameMovie.compareTo(o.getNameMovie());
    }


    public static Comparator<Movie> comparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.localDateMovie.compareTo(o2.localDateMovie);
        }
    };

    public static Comparator<Movie> producerComparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.producer.getProducerName().compareTo(o2.producer.getProducerName());
        }
    };
}
