import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String title = askForFilmTitle();
        String directorName = askForDirectorName();
        boolean isThriller = askIfIsThriller();
        Film film = new Film(title, directorName, isThriller);
        printFilm(film);
    }

    private static void printFilm(Film film) {
        System.out.println("Film: " + film.getTitle()
                + " Director: " + film.getDirectorName()
                + " isThriller: " + printBoolean(film.isThriller()))
    }

    private static String printBoolean(boolean value) {
        if (value) return " si ";
        return " No ";
    }

    private static boolean askIfIsThriller() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Is Thriller: (S/N)");
        String text = sc.nextLine();
        return text.equalsIgnoreCase( "S");
    }

    private static String askForDirectorName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Director: ");
        return sc.nextLine();
    }

    private static String askForFilmTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title: ");
        return sc.nextLine();
    }
}