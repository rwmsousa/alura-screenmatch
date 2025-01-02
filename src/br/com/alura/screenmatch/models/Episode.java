package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calc.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Series series;
    private int totalViewers;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getTotalViewers() {
        return totalViewers;
    }

    public void setTotalViewers(int totalViewers) {
        this.totalViewers = totalViewers;
    }

    @Override
    public int getClassification() {
        if(totalViewers>100){
            return 4;
        }else {
            return 2;
        }
    }
}
