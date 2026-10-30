package academy.devdojo.maratonajava.javacore.ZZBlambdas.dominio;

public class Anime {
    private String title;
    private int epsodes;

    public Anime(String title, int epsodes) {
        this.title = title;
        this.epsodes = epsodes;
    }

    public String getTitle() {
        return title;
    }

    public int getEpsodes() {
        return epsodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", epsodes=" + epsodes +
                '}';
    }
}
