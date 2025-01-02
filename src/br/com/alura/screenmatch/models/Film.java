package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calc.Classification;

public class Film extends Title implements Classification {

    private  String director;

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
}
