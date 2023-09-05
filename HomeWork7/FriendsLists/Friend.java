package HomeWork7.FriendsLists;

import java.util.ArrayList;

public class Friend {

    private String familia;
    private String phoneNumber;

    private static int friendQuantity = 0;

    Friend(String familia){
        this.familia = familia;
        friendQuantity++;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFamilia() {
        return familia;
    }

    public static int getFriendQuantity() {
        return friendQuantity;
    }
}
