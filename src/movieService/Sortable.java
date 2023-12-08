package movieService;

public interface Sortable {

   void sortByMovieName(String ascOrDesc);
//-from A to Z
//-from Z to A
   void sortByYear(String ascOrDesc);
//-Ascending
//-Descending
   void sortByProducer();

}
