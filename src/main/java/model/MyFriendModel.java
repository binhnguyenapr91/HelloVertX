package model;

/**
 * @author: Binh Nguyen
 * Dec 03, 2021
 */

public class MyFriendModel {
    private String name;
    private String address;

    public MyFriendModel() {
    }

    public MyFriendModel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
