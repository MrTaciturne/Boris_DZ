package HomeWork7.FriendsLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapRunner {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Friend> friendList = new ArrayList<>();
    static HashMap<String, String> friendHashList = null;
    public static void main(String[] args) {


        System.out.println("Сколько у вас друзей?");
        int friendNum = in.nextInt();
        friendList = makeFriends(friendNum);
        friendHashList = insertData(friendList);
        friendHashList.forEach((key, value) -> System.out.println(value + ": номер телефона " + key));

        changeNumber();

    }

    private static ArrayList<Friend> makeFriends(int i){
        String friend;
        ArrayList<Friend> newFriends = new ArrayList<>();
        System.out.println("Назовите фамилии " + i + " своих друзей:");
        for (int j = 0; j <= i; j++) {
            friend = in.nextLine();
            newFriends.add(new Friend(friend));
        }
        newFriends.remove(0);
        return newFriends;
    }
    private static HashMap<String,String> insertData(ArrayList<Friend> friends){
        HashMap<String,String> friendsList = new HashMap<>();
        for (Friend friend : friends) {
            System.out.println("Введите номер телефона для контакта " + friend.getFamilia());
            friend.setPhoneNumber(in.nextLine());
            friendsList.put(friend.getPhoneNumber(), friend.getFamilia());
        }
        return friendsList;
    }
    private static void changeNumber(){
        System.out.print("Чей номер телефона желаете сменить? (");
        friendHashList.forEach((key, value) -> System.out.print(value + " "));
        System.out.println(")");
        String familia = null;
        while (!friendHashList.containsValue(familia)){
            familia = in.nextLine();
            if (!friendHashList.containsValue(familia)) {
                System.out.println("Друг не найден, повторите попытку ввода");
            } else {
                System.out.println("Введите номер телефона для контакта " + familia);
                System.out.println("решение данной задачи в разработке");
            }
        }
    }
}
