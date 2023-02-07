package dev.grpc.api.user.application.service;

import dev.grpc.api.user.application.model.User;

import java.util.List;

public interface UserService {

    long createUser(User user);

    List<Long> createListUser(List<User> users);
    User getUser(long userId);

    List<User> getListUser();

    List<User> searchUserByFullName(String fullName);

    Long updateUser(User user);

    Long deleteUser(Long userId);

    List<Long> deleteListUser(List<Long> userList);

}
