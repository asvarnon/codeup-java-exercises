package movies;
import jdk.jfr.Category;
import util.Input;

public class MoviesApplication {

    public static void selectedMovies(Movie[] movieList){
        for(Movie movie: movieList){
            String SelectedMovieName = movie.getName();
            String SelectedMovieCategory = movie.getCategory();
            System.out.printf("%s -- %s\n", SelectedMovieName, SelectedMovieCategory);
        }
    }

    public static void selectedMovies(Movie[] movieList, String category){
        for(Movie movie: movieList){
            String selectedMovieCategory = movie.getCategory();
            if(selectedMovieCategory.equalsIgnoreCase(category))
            System.out.printf("%s -- %s \n", movie.getName(), movie.getCategory());
        }
    }


    public static void main(String[] args) {
        System.out.println(
                "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n"
        );

        System.out.println("Enter your choice: ");
        Input userInput = new Input(); //make into integer for switch to work
        int selectedInput = userInput.getInt();
        Movie[] movieList = MoviesArray.findAll();

        switch (selectedInput){
            case 0:
                System.exit(0);
                break;
            case 1:
                selectedMovies(movieList);
                break;
            case 2:
                selectedMovies(movieList, "animated");
                break;
            case 3:
                selectedMovies(movieList, "drama");
                break;
            case 4:
                selectedMovies(movieList, "horror");
                break;
            case 5:
                selectedMovies(movieList, "scifi");
                break;
            case 6:
                selectedMovies(movieList, "musical");
                break;
        }
    }
}
