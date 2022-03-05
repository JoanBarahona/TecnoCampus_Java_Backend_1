import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String title=askForBookTitle();
        int numPages=askForNumPages();
        Book book = new Book(title,numPages);
        printBook(book);
    }

    private static void printBook(Book book) {
        System.out.println("Book created: " +book.getTitle()
                + " pàgines: " + book.getNumPages());
    }

    private static String askForBookTitle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Title: ");
        return sc.nextLine();
    }

    private static int askForNumPages() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pages: ");
        return sc.nextInt();
    }



}
