package dev.grpc.api.user.resource;

import dev.grpc.api.user.application.model.User;
import dev.grpc.api.user.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserGatewayController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody User user) {

        var userId = userService.createUser(user);
        var userResponse = new UserResponse(userId);
        return new ResponseEntity<>("Create user success", HttpStatus.CREATED);
    }

    @PostMapping("/create-list-user")
    public ResponseEntity<String> createListUser(@RequestBody List<User> userList) {

        System.out.println(userList);
        var userIdList = userService.createListUser(userList);
        List<UserResponse> listUserResponse = new LinkedList<>();
        userIdList.forEach(userId -> listUserResponse.add(new UserResponse(userId)));
        return new ResponseEntity<>("Create list users success", HttpStatus.CREATED);
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable @NotBlank long userId) {
        var user = userService.getUser(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        var userList = userService.getListUser();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @PostMapping("/find-user-by-username")
    public ResponseEntity<List<User>> getUserByUserName(@RequestBody String userName) {
        var userList = userService.searchUserByFullName(userName);
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @PutMapping("/update-user")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        var userId = userService.updateUser(user);
        var userResponse = new UserResponse(userId);
        return new ResponseEntity<>("Update Success", HttpStatus.OK);
    }

    @DeleteMapping("/delete-user/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable @NotBlank Long userId) {
        var userIdDelete = userService.deleteUser(userId);
        var userResponse = new UserResponse(userIdDelete);
        return new ResponseEntity<>("Delete user success", HttpStatus.OK);
    }

    @DeleteMapping("/delete-list-users")
    public ResponseEntity<String> deleteListUser(@RequestBody List<Long> userIdList) {
        var userIdDeleteList = userService.deleteListUser(userIdList);
        List<UserResponse> userResponseList = new LinkedList<>();
        userIdDeleteList.forEach(
                userIdDelete -> {
                    var userResponse = new UserResponse(userIdDelete);
                    userResponseList.add(userResponse);
                }
        );
        return new ResponseEntity<>("Delete users success", HttpStatus.OK);
    }
}
