public class FilmRepisitory {
    private FilmItem[] items = new FilmItem[0];


    public void save(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    //findAll — возвращает массив всех хранящихся в массиве объектов.
    public FilmItem[] findAll() {
        return items;
    }

    //findById — возвращает объект по идентификатору, либо null, если такого объекта нет.
    public FilmItem findById(int id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i].getId() == id) {
                    return items[i];
                }
            }
        }
        return null;
    }

    //removeById — удаляет объект по идентификатору, если объекта нет, то пусть будет исключение, как на лекции.
    public void removeById(int id) {

        for (int i = 0; i < items.length; i++) {
            if (items[i].getId() == id) {
                items[i] = null;
            }
        }

    }
    //        removeAll -полностью вычищает репозиторий, для удаления всех элементов достаточно в поле items положить пустой массив.

    public void removeAll() {
        items = new FilmItem[0];
    }

}