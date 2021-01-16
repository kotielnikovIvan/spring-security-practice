package com.mycompany.springsecuritypractice.rest;

import com.mycompany.springsecuritypractice.model.Friend;
import com.mycompany.springsecuritypractice.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PreAuthorize("hasAuthority('friends:read')")
    public Friend getFriend(@PathVariable Long friendId) {
        return friendService.getFriend(friendId);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('friends:read')")
    public List<Friend> getFriends() {
        return friendService.getFriends();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('friends:write')")
    public Friend createFriend(@RequestBody Friend friend) {
        return friendService.createFriend(friend);
    }

    @DeleteMapping("/{friendId}")
    @PreAuthorize("hasAuthority('friends:delete')")
    public void deleteFriend(@PathVariable Long friendId) {
        friendService.deleteFriend(friendId);
    }
}
