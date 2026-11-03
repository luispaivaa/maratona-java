package academy.devdojo.maratonajava.javacore.ZZCoptional.domain;

public class Manga {
    private Integer id;
    private String title;
    private int chapter;

    public Manga(Integer id, String title, int chapter) {
        this.id = id;
        this.title = title;
        this.chapter = chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapter() {
        return chapter;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapter=" + chapter +
                '}';
    }
}
