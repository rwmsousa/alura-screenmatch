package br.com.alura.screenmatch.calc;
import br.com.alura.screenmatch.models.Title;

public class CalcTime {
    private int totalTime;

    public int getTotalTime(){
        return totalTime;
    }

    public void include(Title t){
        System.out.println("Adding time of: " + t.getName());
        this.totalTime += t.getTimeDuration();
    }
}
