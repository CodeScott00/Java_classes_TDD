public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    //drink function takes 10
    public int drink(){
        this.volume = this.volume - 10;
        return this.volume;
    }
    //empty function empties to 0
    public int empty(){
        return this.volume = 0;
    }
    //fill function to 100
    public int full(){
        return this.volume = 100;
    }
}



