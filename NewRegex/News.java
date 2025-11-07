package NewRegex;

public class News {
    private String title;
    private String link;

    public News(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return title + "\n   ➤ " + link;
    }
}
