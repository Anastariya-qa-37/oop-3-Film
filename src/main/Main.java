public class Main {
    public  static void main (String[] args){
        FilmManager filmManager = new FilmManager(5);

        FilmItem filmItem = new FilmItem(1, "dexter", "eeee");
        filmManager.save(filmItem);
        FilmItem filmItem2 = new FilmItem(2, "Eolla", "eeee");
        filmManager.save(filmItem2);
        FilmItem filmItem3 = new FilmItem(3, "Encanto", "eeee");
        filmManager.save(filmItem3);
        FilmItem filmItem4 = new FilmItem(4, "Zootopiya", "eeee");
        filmManager.save(filmItem4);
        FilmItem filmItem5 = new FilmItem(5, "Volt", "eeee");
        filmManager.save(filmItem5);
        FilmItem filmItem6 = new FilmItem(6, "Sea song", "eeee");
        filmManager.save(filmItem6);
        FilmItem filmItem7 = new FilmItem(7, "Wensday", "eeee");
        filmManager.save(filmItem7);
        FilmItem filmItem8 = new FilmItem(8, "Grinsh", "eeee");
        filmManager.save(filmItem8);
        FilmItem filmItem9 = new FilmItem(9, "Ralf", "eeee");
        filmManager.save(filmItem9);
        FilmItem filmItem10 = new FilmItem(10, "Ratatyi", "eeee");
        filmManager.save(filmItem10);
        FilmItem filmItem11 = new FilmItem(11, "Garfild", "eeee");
        filmManager.save(filmItem11);




        //filmManager.findAll();
        System.out.println("");

        //filmManager.findLast();
       // System.out.println("");

        filmManager.findFirst();

        FilmRepisitory rep = new FilmRepisitory();
        rep.save(filmItem);
        rep.save(filmItem3);
        rep.save(filmItem5);

        rep.removeById(1);
        rep.findById(2);

    }




}
