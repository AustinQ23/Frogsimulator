import java.util.Random;

public class Frogsimulator{
    private int goalDistance;
    private int maxHops;

public Frogsimulator(int goalDistance, int maxHops) {
        this.goalDistance = goalDistance;
        this.maxHops = maxHops;
    }

    private int hopDistance(){
        Random ran = new Random();

        // generating integer
        int randint = ran.nextInt(30-10) + 10;
        return randint;
    }

public boolean simulate(){
    int totaldistance = 0;
    for(int i = 0; i < maxHops; i++){
        totaldistance += hopDistance();
        if( totaldistance < 0){return false;}
        if(totaldistance >= goalDistance){
            return true;}
    }
    return false;
}

public double runSimulations(int num){
    double totaltrue = 0;
    for(int i = 0; i < num; i++){
        if( simulate() == true){
            totaltrue++;
        }
    } 
    return totaltrue / num; //simulation over total
}
}
