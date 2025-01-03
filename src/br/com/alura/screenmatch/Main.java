package br.com.alura.screenmatch;
import br.com.alura.screenmatch.calc.CalcTime;
import br.com.alura.screenmatch.calc.RecomendationFilter;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("The Godfather", 1972, true, 180, 9.5, "Francis Ford Coppola");
        film.setRate(9.5);
        film.showTechnicalDetails();

        System.out.println("Average Rating: " + film.getAverageRating());
        System.out.println("Total Ratings: " + film.getTotalRatings());

        Series lost = new Series("Lost", 2004);
        lost.setIsAvailableInPlan(true);
        lost.showTechnicalDetails();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration of Series: " + lost.getTimeDuration());

        Film film2 = new Film("Avatar", 2009, true, 200, 8.5, "James Cameron");


        CalcTime calc = new CalcTime();
        calc.include(film);
        calc.include(film2);
        calc.include(lost);
        System.out.println("Total Time: " + calc.getTotalTime());

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setTotalViewers(300);

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(film);
        filter.filter(film2);
        filter.filter(episode);

        Film film3 = new Film("Rambo", 1982, true, 200, 10, "Sylvester Stallone");


        ArrayList<Film> films = new ArrayList<>();
        films.add(film);
        films.add(film2);
        films.add(film3);
        System.out.println("Total Films: " + films.size());
        System.out.println("First Film: " + films.get(0).getName());
        System.out.println(films.toString());
    }
}
