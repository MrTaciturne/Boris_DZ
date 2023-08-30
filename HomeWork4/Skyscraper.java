package HomeWork4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Skyscraper {

    int lowerFloor;
    int upperFloor;
//    int access;

    Skyscraper (int lowFloor, int upFloor){
        if (upFloor > 0) {
            lowerFloor = lowFloor;
            upperFloor = upFloor;
        }
    }

    public void plusFloor(){
        upperFloor++;
    }
    public void minusFloor(){
        if (upperFloor - 1 > 0 && upperFloor - 1 >= lowerFloor) {
            upperFloor--;
        }
    }
    public void lowerUpp() {
        if ((lowerFloor + 1) < upperFloor && (lowerFloor + 1) <= 1) {
            lowerFloor++;
            if (lowerFloor == 0) {
                lowerFloor++;
            }
        }
    }
    public void lowerDawn(){
        lowerFloor--;
        if (lowerFloor == 0) {
            lowerFloor--;
        }
    }
    public String getDattaList(){
        if (lowerFloor < 0){
            return ("Skyscraper has " + (upperFloor - lowerFloor) + " floors");
        } else {
            return ("Skyscraper has " + (upperFloor + lowerFloor - 1) + " floors");
        }
    }
    public int getFloorsNumber(){
        if (lowerFloor < 0){
            return (upperFloor - lowerFloor);
        } else {
            return (upperFloor + lowerFloor - 1);
        }
    }
//    public void setAccess(int i){
//        access = i;
//    }
}
