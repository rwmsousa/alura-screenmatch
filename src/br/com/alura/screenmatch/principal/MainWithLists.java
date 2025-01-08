package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import java.util.ArrayList;
import java.util.Collections;

public class MainWithLists {

    public static void main(String[] args) {

        Film film = new Film("The Godfather", 1972, true, 180, 9.5, "Francis Ford Coppola");
        Film film2 = new Film("Avatar", 2009, true, 200, 8.5, "James Cameron");
        Film film3 = new Film("Rambo", 1982, true, 200, 10, "Sylvester Stallone");
        Series lost = new Series("Lost", 2004);
        ArrayList<Title> whatchedList = new ArrayList<>();
        whatchedList.add(film);
        film.setRate(9.0);
        whatchedList.add(film2);
        film2.setRate(6);
        whatchedList.add(film3);
        film3.setRate(10);
        whatchedList.add(lost);
        // whatchedList.forEach(System.out::println);
        for (Title item : whatchedList) {
          System.out.println(item.getName());

          if (item instanceof Film filmItem && filmItem.getClassification() > 3) {
            System.out.println("Classification: " + filmItem.getClassification());
          }
        }

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Sylvester Stallone");
        artistas.add("James Cameron");
        artistas.add("Francis Ford Coppola");

        Collections.sort(artistas);
        System.out.println(artistas);

        Collections.sort(whatchedList);
        System.out.println(whatchedList);
    }

}
