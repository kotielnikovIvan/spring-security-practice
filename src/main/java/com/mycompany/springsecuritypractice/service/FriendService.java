package com.mycompany.springsecuritypractice.service;

import com.mycompany.springsecuritypractice.model.Friend;

import java.util.List;

public interface FriendService {

    Friend getFriend(Long friendId);

    List<Friend> getFriends();

    Friend createFriend(Friend friend);

    void deleteFriend(Long friendId);
}
