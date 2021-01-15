package com.mycompany.springsecuritypractice.rest;

import com.mycompany.springsecuritypractice.model.Friend;
import com.mycompany.springsecuritypractice.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ivan Kotielnikov
 */
@RestController
@RequestMapping("/api/v1/friends")
public class FriendRestControllerV1 {

    @Autowired
    private FriendService friendService;

    @GetMapping("/{friendId}")
    public Friend getFriend(@PathVariable Long friendId) {
        return friendService.getFriend(friendId);
    }

    @GetMapping
    public List<Friend> getFriends() {
        return friendService.getFriends();
    }
}
