package com.mycompany.springsecuritypractice.service.impl;

import com.mycompany.springsecuritypractice.model.Friend;
import com.mycompany.springsecuritypractice.service.FriendService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ivan Kotielnikov
 */
@Service
public class FriendServiceImpl implements FriendService {

    List<Friend> friends = List.of(new Friend(1L, "Joey", "Tribbiani"),
            new Friend(2L, "Chandler", "Bing"),
            new Friend(3L, "Ross", "Geller"));

    @Override
    public Friend getFriend(Long friendId) {
        return friends.stream().filter(friend -> friend.getId().equals(friendId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Friend> getFriends() {
        return friends;
    }
}
