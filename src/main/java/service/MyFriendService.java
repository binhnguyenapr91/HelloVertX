package service;

import model.MyFriendModel;

import java.util.HashMap;

/**
 * @author: Binh Nguyen
 * Dec 03, 2021
 */

public interface MyFriendService {
    void createFriendList();
    HashMap<Integer, MyFriendModel> getFriendMap();
}
