package service;

import model.MyFriendModel;

import java.util.HashMap;

/**
 * @author: Binh Nguyen
 * Dec 03, 2021
 */

public class MyFriendServiceImpl implements MyFriendService{
    private HashMap<Integer, MyFriendModel> friendMap = new HashMap<>();

    @Override
    public void createFriendList() {
        friendMap.put(1, new MyFriendModel("Tim","HaNoi"));
        friendMap.put(2, new MyFriendModel("Black","ThanhHoa"));
        friendMap.put(3, new MyFriendModel("Kevin","HaNam"));
        friendMap.put(4, new MyFriendModel("Daisy","ThaiBinh"));
        friendMap.put(5, new MyFriendModel("Jessica","HaNoi"));
    }

    @Override
    public HashMap<Integer, MyFriendModel> getFriendMap() {
        return friendMap;
    }
}
