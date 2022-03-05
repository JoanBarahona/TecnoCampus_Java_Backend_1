public class Film {
    private String title;
    private String directorName;
    private boolean thriller;

    public Film(String title, String directorName, boolean isThriller) {
        this.title = title;
        this.directorName = directorName;
        this.thriller = isThriller;
    }

    public String getTitle(){
        return title;
    }

    public String getDirectorName(){
        return directorName;
    }

    public boolean isThriller(){
        return thriller;
    }
}
