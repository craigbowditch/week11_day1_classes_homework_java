public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }
    public int drink() {
        return this.volume -= 10;
    }

    public int emptyBottle(){
       return this.volume = 0;
    }

    public int fillBottle(){
        return this.volume = 100;
    }
}
