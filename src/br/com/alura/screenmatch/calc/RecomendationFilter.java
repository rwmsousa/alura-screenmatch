package br.com.alura.screenmatch.calc;

public class RecomendationFilter {

    public void filter(Classification c){
        if(c.getClassification() >= 4){
            System.out.println("Watch it!");
        }else if(c.getClassification() >= 2){
            System.out.println("Good classification!");
        }else{
            System.out.println("Put it on the list!");
        }

    }
}
