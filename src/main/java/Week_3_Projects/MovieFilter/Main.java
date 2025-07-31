package Week_3_Projects.MovieFilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MovieF> filmList = new ArrayList<>();
        filmList.add(new MovieF("Inception",2010,"Sci-Fi",8.8));
        filmList.add(new MovieF("Interstellar",2014,"Sci-fi", 8.6));
        filmList.add(new MovieF("The Matrix", 1999,"Action", 8.7));
        filmList.add(new MovieF("The Dark Knight",2008,"Action",9.0));
        filmList.add(new MovieF("Avatar",2009,"Adventure/Fantasy",7.8));

       // filmList.sort((f1,f2) ->Integer.compare(f1.getYear(), f2.getYear())); //sorted from bigger to smaller for year
      //  filmList.sort((f2,f1)->Double.compare(f2.getIMDb(),f1.getIMDb())); //sorted from smaller than bigger fo IMDB
        //It is not sorted together.
        //We need to use comparator like below:
        filmList.sort(
                Comparator.comparingInt(MovieF::getYear).thenComparing(MovieF::getIMDb).reversed()
        );


        for(MovieF s: filmList){ //write it to console
            System.out.println(s);

        }

        System.out.println("Here is your movies----------------");
        List<MovieF> result = filterMovie(filmList);
        for(MovieF a: result){ //write it to console
            System.out.println(a);

        }


        }


    public static List<MovieF> filterMovie(List<MovieF> b){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your category: ");
        String inputcategory = scanner.nextLine();
        String lowerinput = inputcategory.toLowerCase();
        List<MovieF> filteredCategory = new ArrayList<>();

        return b.stream()
                .filter(f->f.getTypeOf().toLowerCase().contains(lowerinput)).toList();
    }
}



