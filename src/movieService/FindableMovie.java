package movieService;

import movies.Genre;

import java.time.LocalDate;
import java.time.Year;

public interface FindableMovie {
    void getAllMovies();
   void findMovieByNameOrPartName(String name);
   void findMovieByActorName(String actorName);
   void findMovieByYear(LocalDate localDate);
   void findMovieByProducer(String producerName);
   void findMovieByGenre(Genre genre);
   void findMovieByRole(String role);
}
