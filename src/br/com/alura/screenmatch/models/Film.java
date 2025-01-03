package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calc.Classification;

public class Film extends Title implements Classification {

    private  String director;

     public Film(String name, int year, boolean avaliable, int duration, double rate, String director) {
        super(name, year);
        setIsAvailableInPlan(avaliable);
        setSumRatings(rate);
        setTotalRatings(1);
        setTimeDuration(duration);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverageRating()/2;
    }

    @Override
    public String toString() {
        return "Film: " + getName() + " - " + getReleaseYear();
    }


}
