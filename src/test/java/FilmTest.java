import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {
    FilmRepisitory repo = Mockito.mock(FilmRepisitory.class);
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


    @Test
    void save() {
       FilmManager filmManager = new FilmManager(repo,11);


// подготавливаем данные:
        // вызываем целевой метод:
        filmManager.save(filmItem11);
        verify(repo).save(any());

        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);

    }


    @Test
    void findAll() {
        FilmManager filmManager = new FilmManager(repo,11);

        FilmItem[] expected = {filmItem, filmItem2, filmItem3, filmItem4, filmItem5,
                filmItem6, filmItem7, filmItem8, filmItem9, filmItem10, filmItem11};
        FilmItem[] items = {filmItem, filmItem2, filmItem3, filmItem4, filmItem5,
                filmItem6, filmItem7, filmItem8, filmItem9, filmItem10, filmItem11};
        doReturn(items).when(repo).findAll();


        // вызываем целевой метод:
        FilmItem[] actual = filmManager.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        FilmManager filmManager = new FilmManager(repo,4);

        FilmItem[] items = {filmItem, filmItem2, filmItem3, filmItem4, filmItem5,
                filmItem6, filmItem7, filmItem8, filmItem9, filmItem10, filmItem11};
        doReturn(items).when(repo).findAll();

        // подготавливаем данные:
        FilmItem[] expected = {filmItem11, filmItem10, filmItem9, filmItem8};


        // вызываем целевой метод:
        FilmItem[] actual = filmManager.findLast();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);

    }
}

