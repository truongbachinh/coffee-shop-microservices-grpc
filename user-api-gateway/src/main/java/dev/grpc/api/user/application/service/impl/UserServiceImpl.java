package dev.grpc.api.user.application.service.impl;

import com.google.protobuf.Empty;
import dev.grpc.api.user.application.error.ServiceExceptionMapper;
import dev.grpc.api.user.application.mapper.UserMapper;
import dev.grpc.api.user.application.model.User;
import dev.grpc.api.user.application.service.UserService;
import dev.grpc.user.Resources;
import dev.grpc.user.resource.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class UserServiceImpl implements UserService {

    private ManagedChannel managedChannel;

    public UserServiceImpl(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
    }

    @Override
    public long createUser(User user) {

        log.info(" Calling User service server...");

        var createUserRequest =
                Resources.CreateUserRequest
                        .newBuilder()
                        .setFullName(user.getFullName())
                        .setAddress(user.getAddress())
                        .setEmail(user.getEmail())
                        .setPhoneNumber(user.getPhoneNumber())
                        .build();

        var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);

        userApiServiceBlockingStub.createUser(createUserRequest);
        log.info("Receive user information from user service, info {} ", user);
        return user.getUserId();
    }

    @Override
    public List<Long> createListUser(List<User> userList) {
        log.info(" Calling User service server...");
        List<Resources.CreateUserRequest> createUserRequestList = new LinkedList<>();

        userList.forEach(user -> {
            Resources.CreateUserRequest userRequest =
                    Resources.CreateUserRequest.newBuilder()
                            .setFullName(user.getFullName())
                            .setPhoneNumber(user.getPhoneNumber())
                            .setEmail(user.getEmail())
                            .setAddress(user.getAddress())
                            .build();
            createUserRequestList.add(userRequest);
        });

        Resources.CreateListUserRequest createListUserRequest =
                Resources.CreateListUserRequest.newBuilder()
                        .addAllCreateUserRequest(createUserRequestList)
                        .build();

        var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);

        var response = userApiServiceBlockingStub.createListUser(createListUserRequest);

        response.getCreateUserResponseList().stream().map(Resources.CreateUserResponse::getUserId).collect(Collectors.toList());

        return userList.stream().map(User::getUserId).collect(Collectors.toList());
    }

    @Override
    public User getUser(long userId) {
        log.info("Calling user service server ...");

        User user;
        try {
            var request = Resources.GetUserRequest
                    .newBuilder()
                    .setUserId(userId)
                    .build();

            var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);
            var response = userApiServiceBlockingStub.getUser(request);
            user = UserMapper.MAPPER.userMapper(response);
            log.info("Receive User information from user service, info {} ...", user);
        } catch (StatusRuntimeException error) {
            log.info("Error while calling user service");
            throw ServiceExceptionMapper.map(error);
        }
        return user;
    }

    @Override
    public List<User> getListUser() {
        log.info("Calling user service server ...");

        List<User> userList = new ArrayList<>();
        var request = Empty.newBuilder().build();
        try {
            var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);
            var response = userApiServiceBlockingStub.getListUser(request);

            response.getGetUserResponseList().forEach(
                    userResponse -> {
                        User user = UserMapper.MAPPER.userMapper(userResponse);
                        userList.add(user);
                    }
            );
            log.info("Receive User information from user service, info {} ...", userList);
        } catch (StatusRuntimeException error) {
            log.info("Error while calling user service");
            throw ServiceExceptionMapper.map(error);
        }
        return userList;
    }

    @Override
    public List<User> searchUserByFullName(String fullName) {
        log.info("Calling user service server ...");

        List<User> userList = new ArrayList<>();
        var request = Resources.SearchUserByFullNameRequest
                .newBuilder()
                .setFullName(fullName)
                .build();
        try {
            var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);
            var response = userApiServiceBlockingStub.searchUserByFullName(request);

            response.getGetUserResponseList().forEach(
                    userResponse -> {
                        User user = UserMapper.MAPPER.userMapper(userResponse);
                        userList.add(user);
                    }
            );
            log.info("Receive User information from user service, info {} ...", userList);
        } catch (StatusRuntimeException error) {
            log.info("Error while calling user service");
            throw ServiceExceptionMapper.map(error);
        }
        return userList;
    }

    @Override
    public Long updateUser(User user) {
        log.info(" Calling User service server...");

        var updateUserRequest =
                Resources.UpdateUserRequest
                        .newBuilder()
                        .setUserId(user.getUserId())
                        .setFullName(user.getFullName())
                        .setAddress(user.getAddress())
                        .setEmail(user.getEmail())
                        .setPhoneNumber(user.getPhoneNumber())
                        .build();

        var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);

        var response = userApiServiceBlockingStub.updateUser(updateUserRequest);

        log.info("Receive user information from user service, info {} ", user);
        return user.getUserId();
    }

    @Override
    public Long deleteUser(Long userId) {
        log.info(" Calling User service server...");

        var deleteUserRequest =
                Resources.DeleteUserRequest
                        .newBuilder()
                        .setUserId(userId)
                        .build();

        var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);

        var response = userApiServiceBlockingStub.deleteUser(deleteUserRequest);

        var userIdDelete = response.getUserId();

        log.info("Receive user information from user service, info {} ", userIdDelete);
        return userId;
    }

    @Override
    public List<Long> deleteListUser(List<Long> userIdList) {

        log.info(" Calling User service server...");
        List<Resources.DeleteUserRequest> deleteUserRequestList = new LinkedList<>();

        userIdList.forEach(userId -> {
            Resources.DeleteUserRequest userRequest =
                    Resources.DeleteUserRequest.newBuilder()
                            .setUserId(userId)
                            .build();
            deleteUserRequestList.add(userRequest);
        });

        Resources.DeleteListUserRequest deleteListUserRequest =
                Resources.DeleteListUserRequest.newBuilder()
                        .addAllDeleteUserRequest(deleteUserRequestList)
                        .build();

        var userApiServiceBlockingStub = UserServiceGrpc.newBlockingStub(managedChannel);

        var response = userApiServiceBlockingStub.deleteListUser(deleteListUserRequest);

        var userIdDeleteList = response.getDeleteUserResponseList().stream().map(Resources.DeleteUserResponse::getUserId).collect(Collectors.toList());
        return userIdDeleteList;
    }

}
