import java.util.Objects;

public class FilmItem {

    private int id;
    private String name;
    private String genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmItem filmItem = (FilmItem) o;
        return id == filmItem.id && name.equals(filmItem.name) && genre.equals(filmItem.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre);
    }

    @Override
    public String toString() {
        return "FilmItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public FilmItem(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}