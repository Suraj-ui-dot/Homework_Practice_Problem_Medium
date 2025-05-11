public class Movie {
    private String name;
    private String language;
    private double rating;

    public Movie(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    public void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        Movie movie1 = new Movie("Avenger The End Game", "English", 4.8);
        Movie movie2 = new Movie("Parasite", "Korean", 4.6);
        Movie movie3 = new Movie("Dabang", "Hindi", 4.5);
        Movie movie4 = new Movie("Oon ko Sweater", "Nepalese", 4.7);

        // Display movie
        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }
}