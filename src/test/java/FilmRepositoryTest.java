import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

public class FilmRepositoryTest {

    FilmRepisitory repo = new FilmRepisitory();

    FilmItem filmItem = new FilmItem(1, "dexter", "eeee");
    FilmItem filmItem2 = new FilmItem(2, "Eolla", "eeee");
    FilmItem filmItem3 = new FilmItem(3, "Encanto", "eeee");
    FilmItem filmItem4 = new FilmItem(4, "Zootopiya", "eeee");
    FilmItem filmItem5 = new FilmItem(5, "Volt", "eeee");
    FilmItem filmItem6 = new FilmItem(6, "Sea song", "eeee");
    FilmItem filmItem7 = new FilmItem(7, "Wensday", "eeee");
    FilmItem filmItem8 = new FilmItem(8, "Grinsh", "eeee");
    FilmItem filmItem9 = new FilmItem(9, "Ralf", "eeee");
    FilmItem filmItem10 = new FilmItem(10, "Ratatyi", "eeee");
    FilmItem filmItem11 = new FilmItem(11, "Garfild", "eeee");

    @BeforeEach
    void setup(){
        repo.removeAll();
        repo.save(filmItem);
    }


    @Test
    void save() {
        repo.save(filmItem2);
        FilmItem[] expected = {filmItem,filmItem2};


        // вызываем целевой метод:
        FilmItem[] actual = repo.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {

        FilmItem[] expected = {filmItem};


        // вызываем целевой метод:
        FilmItem[] actual = repo.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findByI() {
        FilmItem expected = filmItem;

        // вызываем целевой метод:
        FilmItem actual = repo.findById(1);
        assertEquals(expected, actual);
    }

    @Test
    void  removeById() {
        FilmItem[] expected = {null};

        // вызываем целевой метод:
        repo.removeById(1);
        FilmItem[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void  removeAll() {
        FilmItem[] expected = {};

        // вызываем целевой метод:
         repo.removeAll();
        FilmItem[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }


}
