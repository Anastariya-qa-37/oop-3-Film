public class Main {

    public static void main(String[] args) {
        FilmRepisitory repisitory = new FilmRepisitory();


        FilmItem filmItem = new FilmItem(1, "dexter", "eeee");
        repisitory.save(filmItem);
        FilmItem filmItem2 = new FilmItem(2, "Eolla", "eeee");
        repisitory.save(filmItem2);
        FilmItem filmItem3 = new FilmItem(3, "Encanto", "eeee");
        repisitory.save(filmItem3);
        FilmItem filmItem4 = new FilmItem(4, "Zootopiya", "eeee");
        repisitory.save(filmItem4);
        FilmItem filmItem5 = new FilmItem(5, "Volt", "eeee");
        repisitory.save(filmItem5);
        FilmItem filmItem6 = new FilmItem(6, "Sea song", "eeee");
        repisitory.save(filmItem6);
        FilmItem filmItem7 = new FilmItem(7, "Wensday", "eeee");
        repisitory.save(filmItem7);
        FilmItem filmItem8 = new FilmItem(8, "Grinsh", "eeee");
        repisitory.save(filmItem8);
        FilmItem filmItem9 = new FilmItem(9, "Ralf", "eeee");
        repisitory.save(filmItem9);
        FilmItem filmItem10 = new FilmItem(10, "Ratatyi", "eeee");
        repisitory.save(filmItem10);
        FilmItem filmItem11 = new FilmItem(11, "Garfild", "eeee");
        repisitory.save(filmItem11);

        FilmManager filmManager = new FilmManager(repisitory, 5);


        //filmManager.findAll();
        System.out.println("");

        //filmManager.findLast();
        // System.out.println("");

//        filmManager.findFirst();

        FilmRepisitory rep = new FilmRepisitory();
        rep.save(filmItem);
        rep.save(filmItem3);
        rep.save(filmItem5);

        rep.removeById(1);
        rep.findById(2);

    }


}
