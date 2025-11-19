package Homework4.Task2;

public class RAM {
    private final int GBstorage;
    private final int frequency;
    public RAM(int GBstorage,int frequency){
        this.frequency=frequency;
        this.GBstorage=GBstorage;
    }
    public int getGBstorage() {
        return GBstorage;
    }
    public int getFrequency() {
        return frequency;
    }
    public String toString(){
        return (GBstorage+" GB, "+frequency+" Hrz");
    }
}
