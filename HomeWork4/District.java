package HomeWork4;

import java.util.Scanner;

public class District {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int uFloor = 0;
        int lFloor = 2;
        String command;
        command = "zero";
        int floor;
        int max = 0;
        int min = 0;
//        boolean acces;

//        Создание дома

        System.out.println("\nSet the parameters of the skyscraper:");

        while (lFloor > 1) {
            System.out.print("Lower floor: ");
            lFloor = in.nextInt();
            if (lFloor > 1 || lFloor == 0) {
                System.out.println("The lower floor should not be upper then ground");
            }
        }

        while (uFloor < 1) {
            System.out.print("Upper floor: ");
            uFloor = in.nextInt();
            if (uFloor < 1) {
                System.out.println("The upper floor should not be lower than the first and lower");
            }
        }

        Skyscraper hous = new Skyscraper(lFloor, uFloor);
        System.out.println(hous.getDattaList());
        System.out.println("""
                                
                Commands list:
                Stop, Redact, Data, Help, Elevator
                """);

//        Редактирование дома и создание лифта

        while (true) {
            System.out.print("Waiting for command: "); //На данном этапе есть ошибка:
            command = in.nextLine();                   //строка "Waiting for command" дублируется ((
            if (command.equals("Stop")) {
                System.out.println("Ending");
                break;
            } else if (command.equals("Redact")) {
                System.out.println("Commands: Lower or Upper || Plus or Minus, Back");
                while (true) {
                    System.out.print("Command: ");
                    command = in.nextLine();
                    if (command.equals("Lower Plus")) {
                        hous.lowerUpp();
                        System.out.println("Current lower floor: " + hous.lowerFloor);
                    } else if (command.equals("Upper Plus")) {
                        hous.plusFloor();
                        System.out.println("Current upper floor: " + hous.upperFloor);
                    } else if (command.equals("Lower Minus")) {
                        hous.lowerDawn();
                        System.out.println("Current lower floor: " + hous.lowerFloor);
                    } else if (command.equals("Upper Minus")) {
                        hous.minusFloor();
                        System.out.println("Current upper floor: " + hous.upperFloor);
                    } else if (command.equals("Back")) {
                        System.out.println("""
                                                
                                Commands list:
                                Stop, Redact, Data, Help, Elevator
                                """);
                        break;
                    }
                }

            } else if (command.equals("Data")) {
                System.out.println("The parameters of the skyscraper at the moment:");
                System.out.println("Current lower floor: " + hous.lowerFloor);
                System.out.println("Current upper floor: " + hous.upperFloor);
                System.out.println("Elevator doesn't create yet\n");

            } else if (command.equals("Help")) {
                System.out.println("""
                                        
                        Commands list:
                        Stop, Redact, Data, Help, Elevator
                        """);
            } else if (command.equals("Elevator")) {
                System.out.print("""
                                                
                        Lets create Elevator!
                        U needed to set Up and Low floors, and level of access:
                        """);

                while (true) {
                    System.out.print("Lower floor for elevator: ");
                    min = in.nextInt();
                    if (min < hous.lowerFloor || min >= hous.upperFloor || min == 0) {
                        System.out.println("Lift mast be inside the current Skyscraper");
                    } else {
                        System.out.println("");
                        break;
                    }
                }
                while (true) {
                    System.out.print("Upper floor for elevator: ");
                    max = in.nextInt();
                    if (max > hous.upperFloor || max <= hous.lowerFloor || max <= min) {
                        System.out.println("Incorrect data");
                    } else {
                        System.out.println();
                        break;
                    }
                }


//                System.out.println("Lets set floors with special access needed: ");
//                System.out.print("How much special floors in your skyscraper: ");
//                int specialNum = -1;
//                while (specialNum < 0) {
//                    specialNum = in.nextInt();
//                    if (specialNum < 0) {
//                        System.out.println("It's must be a positive number or zero");
//                        System.out.print("How much special floors in your skyscraper: ");
//                    } else if (specialNum > hous.getFloorsNumber()) {
//                        System.out.println("The number of special floors cannot be equal to or exceed the total number of floors");
//                        System.out.print("How much special floors in your skyscraper: ");
//                    } else {
//                        hous.setAccess(specialNum);
//                        System.out.println();
//                    }
//                }
                System.out.println("The elevator is created, editing of the house now impossible");
                System.out.println("Let's take an elevator ride around the house\n");
                break;
            }
        }

        Elevator elevator = new Elevator(min, max);
        System.out.println("Operation commands: Up, Down, Floor, Image, End");

        while (true) {
            System.out.print("\nWaiting for command: ");
            command = in.nextLine();
            if (command.equals("Up")) {
                if (elevator.currentFloor == elevator.maxFloor) {
                    System.out.print("Selected floor outside elevator access");
                } else {
                    elevator.moveUp();
                    System.out.println("Current floor: " + elevator.currentFloor);
                }
            } else if (command.equals("Down")) {
                if (elevator.currentFloor == elevator.minFloor) {
                    System.out.print("Selected floor outside elevator access");
                } else {
                    elevator.moveDown();
                    System.out.println("Current floor: " + elevator.currentFloor);
                }
            } else if (command.equals("Floor")) {
                System.out.print("With floor: ");
                floor = in.nextInt();
                elevator.move(floor);
                if (floor != elevator.currentFloor) {
                    System.out.print("Selected floor outside elevator access");
                }
                System.out.println("Current floor: " + elevator.currentFloor);
            } else if (command.equals("Image")) {
                System.out.println("_____");
                for (int b = hous.upperFloor; b >= hous.lowerFloor; b--) {
                    if (b == 0) {
                        System.out.println("-----");
                    } else if (b == elevator.currentFloor) {
                        System.out.println("|{0}| : Floor " + b);
                    } else if (b != elevator.currentFloor) {
                        System.out.println("|   | : Floor " + b);
                    }
                }
                System.out.println("-----");
                System.out.println("Operation commands: Up, Down, Floor, Image, End");
            } else if (command.equals("End")) {
                System.out.println("Thank you and goodbye");
                break;
            }
        }
    }
}
