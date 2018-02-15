package ru.limtu.myexample1;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> getGenre (String spinner) {
        List<String> genre = new ArrayList<>();

        if(spinner.equals("Комедия")) {
            genre.add("Друзья");
        }
        if(spinner.equals("Фэнтези")) {
            genre.add("Игра престолов");
        }
        if(spinner.equals("Ужасы")) {
            genre.add("Ходячие мертвецы");
        }
        if(spinner.equals("Фантастика")) {
            genre.add("Футурама");
        }
        if(spinner.equals("Криминал")) {
            genre.add("Во все тяжкие");
            genre.add("Менталист");
        }

        return genre;
    }
}
