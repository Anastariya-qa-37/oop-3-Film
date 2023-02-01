import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {


    @Test
    void save() {
        FilmManager filmManager = new FilmManager(11);

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

// подготавливаем данные:
        FilmItem[] expected = {
                                new FilmItem(1, "dexter", "eeee"),
                                new FilmItem(2, "Eolla", "eeee"),
                                new FilmItem(3, "Encanto", "eeee"),
                                new FilmItem(4, "Zootopiya", "eeee"),
                                new FilmItem(5, "Volt", "eeee"),
                                new FilmItem(6, "Sea song", "eeee"),
                                new FilmItem(7, "Wensday", "eeee"),
                                new FilmItem(8, "Grinsh", "eeee"),
                                new FilmItem(9, "Ralf", "eeee"),
                                new FilmItem(10, "Ratatyi", "eeee"),
                                new FilmItem(11, "Garfild", "eeee")};

        FilmItem[] actual = filmManager.findAll();

        // вызываем целевой метод:
        filmManager.save(filmItem11);

        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }


    @Test
    void findAll() {
        FilmManager filmManager = new FilmManager(11);

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

        filmManager.save(filmItem);
        filmManager.save(filmItem2);
        filmManager.save(filmItem3);
        filmManager.save(filmItem4);
        filmManager.save(filmItem5);
        filmManager.save(filmItem6);
        filmManager.save(filmItem7);
        filmManager.save(filmItem8);
        filmManager.save(filmItem9);
        filmManager.save(filmItem10);
        filmManager.save(filmItem11);

    // подготавливаем данные:
        FilmItem[] expected = {
                new FilmItem(1, "dexter", "eeee"),
                new FilmItem(2, "Eolla", "eeee"),
                new FilmItem(3, "Encanto", "eeee"),
                new FilmItem(4, "Zootopiya", "eeee"),
                new FilmItem(5, "Volt", "eeee"),
                new FilmItem(6, "Sea song", "eeee"),
                new FilmItem(7, "Wensday", "eeee"),
                new FilmItem(8, "Grinsh", "eeee"),
                new FilmItem(9, "Ralf", "eeee"),
                new FilmItem(10, "Ratatyi", "eeee"),
                new FilmItem(11, "Garfild", "eeee")};


        // вызываем целевой метод:
        FilmItem[] actual = filmManager.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        FilmManager filmManager = new FilmManager(4);

        FilmItem filmItem = new FilmItem(1, "dexter", "eeee");
        FilmItem filmItem2 = new FilmItem(2, "Eolla", "eeee");
        FilmItem filmItem3 = new FilmItem(3, "Encanto", "eeee");
        FilmItem filmItem4 = new FilmItem(4, "Zootopiya", "eeee");

        filmManager.save(filmItem);
        filmManager.save(filmItem2);
        filmManager.save(filmItem3);
        filmManager.save(filmItem4);

        // подготавливаем данные:
        FilmItem[] expected = {
                new FilmItem(4, "Zootopiya", "eeee"),
                new FilmItem(3, "Encanto", "eeee"),
                new FilmItem(2, "Eolla", "eeee"),
                new FilmItem(1, "dexter", "eeee"),
                };

        // вызываем целевой метод:
        FilmItem[] actual = filmManager.findLast();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);

    }
}

