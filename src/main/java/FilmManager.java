public class FilmManager {

    private FilmRepisitory repo;

    private int limit;

    public FilmManager(FilmRepisitory repos) {
        this.repo = repos;
        this.limit = 10;
    }

    public FilmManager(FilmRepisitory repos, int limit) {
        this.repo = repos;
        this.limit = limit;
    }

    public void save(FilmItem item) {
        repo.save(item);
    }


    public FilmItem[] findAll() {  //Вывод всех фильмов в порядке добавления
        return repo.findAll();
    }

    public FilmItem[] findLast() {
        int lastInd =  repo.findAll().length-limit;
        if (lastInd < 0) {
            lastInd = 0;
        }
        FilmItem[] tmp = new FilmItem[limit];
        int g = 0;
        for (int i = repo.findAll().length - 1; i >= lastInd; i--) {
            //System.out.println(items[i]);
            tmp[g]= repo.findAll()[i];
            g++;
        }
        return tmp;
    }

    //public FilmItem[] findFirst() {
        //int firstInd =  limit;
        //if (firstInd > items.length) {
         //   firstInd = items.length;
       // }
        //for (int i = 0; i < firstInd; i++) {
           // System.out.println(items[i]);

       // }
        //return new FilmItem[0];
    //}


}

