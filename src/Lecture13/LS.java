package Lecture13;

import java.io.File;

/**
 * Created by ≈вгений on 18.08.2015.
 */
public class LS extends CommandResolver{
    String url;

    @Override
    public boolean isWork(String a) {
        this.url = a.substring(3);
        return (a.substring(0,2) == "ls");
    }
//    ≈сли запрос на удаление директории и она не пуста€ - вернуть текст
//    с тем что удаление не пустых директорий не поддердиваетс€
//    (ѕлюсом будет удалить и не пустую, тобиш пройтись
//    рекурсией по всему содержимому и удалить все начина€ с самого верха
//    и заканчива€ переданной директорией). ≈сли переданный файл
//    не найден - вывести что файл не найден. ≈сли метод на удаление вернул true - вывести что файл\папка успешно удаленны
    @Override
    public String work() {
        File file = new File(url);
        if (file.isFile() && file.exists()){
            file.deleteOnExit();
            return "File is deleted";
        }

    }
}