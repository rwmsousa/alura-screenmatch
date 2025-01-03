package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean isAvailableInPlan;
    private double sumRatings;
    private int totalRatings=0;
    private int timeDuration;

    public Title(String name, int year) {
        this.name = name;
        this.releaseYear = year;
    }

    public void showTechnicalDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean getIsAvailableInPlan() {
        return isAvailableInPlan;
    }

    public void setIsAvailableInPlan(boolean isAvailableInPlan) {
        this.isAvailableInPlan = isAvailableInPlan;
    }

    public double getAverageRating() {
        return sumRatings / totalRatings;
    }

    public double getSumRatings() {
        return sumRatings;
    }

    public void setSumRatings(double sumRatings) {
        this.sumRatings = sumRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getTimeDuration() {
        return this.timeDuration;
    }

   public void setTimeDuration(int timeDuration) {
        if (timeDuration < 0) {
            throw new IllegalArgumentException("Duration cannot be negative");
        }
        this.timeDuration = timeDuration;
    }

    public void setRate(double rating) {
        sumRatings += rating;
        totalRatings++;
    }
}
