import br.com.alura.screenmatch.calc.CalcTime;
import br.com.alura.screenmatch.calc.RecomendationFilter;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        film.setName("The Godfather");
        film.setReleaseYear(1972);
        film.setIsAvailableInPlan(true);
        film.setTimeDuration(180);

        film.setRate(9.5);
        film.setRate(8.5);
        film.setRate(9.0);
        film.showTechnicalDetails();
        System.out.println("Average Rating: " + film.getAverageRating());
        System.out.println("Total Ratings: " + film.getTotalRatings());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2004);
        lost.setIsAvailableInPlan(true);
        lost.showTechnicalDetails();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration of Series: " + lost.getTimeDuration());

        Film film2 = new Film();
        film2.setName("Avatar");
        film2.setReleaseYear(2009);
        film2.setTimeDuration(200);


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
    }
}
