package HomeWork7.FriendsLists;

import java.util.ArrayList;

public class Friend {

    private String familia;
    private String phoneNumber;

    Friend(String familia){
        this.familia = familia;
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

}
