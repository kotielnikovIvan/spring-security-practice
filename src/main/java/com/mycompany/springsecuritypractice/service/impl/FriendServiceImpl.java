package com.mycompany.springsecuritypractice.service.impl;

import com.mycompany.springsecuritypractice.model.Friend;
import com.mycompany.springsecuritypractice.service.FriendService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ivan Kotielnikov
 */
@Service
public class FriendServiceImpl implements FriendService {

    List<Friend> friends = Stream.of(new Friend(1L, "Joey", "Tribbiani"),
            new Friend(2L, "Chandler", "Bing"),
            new Friend(3L, "Ross", "Geller"))
            .collect(Collectors.toList());

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

    @Override
    public Friend createFriend(Friend friend) {
        friends.add(friend);
        return friend;
    }

    @Override
    public void deleteFriend(Long friendId) {
        friends.removeIf(friend -> friend.getId().equals(friendId));
    }
}
