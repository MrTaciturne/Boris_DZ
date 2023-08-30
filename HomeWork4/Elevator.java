package HomeWork4;

public class Elevator {

    int currentFloor = 1;
    int minFloor;
    int maxFloor;
//   boolean access = false;

    Elevator() {
    }

    Elevator(int min, int max) {
        minFloor = min;
        maxFloor = max;
    }

    public void setMinFloor(int min){
        minFloor = min;
    }
    public void setMaxFloor(int max){
        maxFloor = max;
    }

//    public String getAccess(){
//        access = true;
//        return ("Access received");
//    }
//
//    public String blockAccess(){
//        access = false;
//        return ("Access blocked");
//    }

    public int getCurrentFloor (){
        return currentFloor;
    }

    public String moveDown(){
        if (currentFloor > minFloor) {
            currentFloor--;
            if (currentFloor == 0) {
                currentFloor--;
            }
            return ("Floor: " + currentFloor);
        } else {
            return ("Movement is impossible");
        }
    }

    public String moveUp () {
        if (currentFloor < maxFloor){
            currentFloor++;
            if (currentFloor == 0) {
                currentFloor++;
            }
            return ("Floor: " + currentFloor);
        } else {
            return ("Movement is impossible");
        }
    }

    public String move(int floor){
        if (floor >= minFloor && floor >= maxFloor){
            currentFloor = floor;
            return ("Floor: " + currentFloor);
        }   else {
            return ("Needed floor doesn't exist");
        }
    }

}
