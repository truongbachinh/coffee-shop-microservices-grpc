package dev.grpc.user.api;

import com.google.protobuf.Empty;
import dev.grpc.user.Resources;
import dev.grpc.user.api.mapper.UserMapper;
import dev.grpc.user.appliction.dto.UserDto;
import dev.grpc.user.appliction.service.UserService;
import dev.grpc.user.resource.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@GrpcService
public class UserApiService extends UserServiceGrpc.UserServiceImplBase {

    @Autowired
    private UserService userService;

    @Override
    public void createUser(Resources.CreateUserRequest request, StreamObserver<Resources.CreateUserResponse> responseObserver) {

        log.info("Call User service ...");

        var userDto = UserMapper.MAPPER.createMapping(request);

        var userId = userService.saveUser(userDto);

        var createUserResponse = Resources.CreateUserResponse.newBuilder().setUserId(String.valueOf(userId)).build();

        responseObserver.onNext(createUserResponse);
        responseObserver.onCompleted();

        log.info("Save user, id {} ..", userId);
    }

    @Override
    public void createListUser(Resources.CreateListUserRequest request, StreamObserver<Resources.CreateListUserResponse> responseObserver) {

        log.info("Call User service ...");
        List<UserDto> userDtoList = new LinkedList<>();
        request.getCreateUserRequestList().forEach(
                userRequest -> userDtoList.add(UserMapper.MAPPER.createMapping(userRequest))
        );
        var userIdList = userService.saveUserList(userDtoList);
        List<Resources.CreateUserResponse> userResponseList = new LinkedList<>();
        userIdList.forEach(
                userId -> userResponseList.add(Resources.CreateUserResponse.newBuilder().setUserId(userId.toString()).build())
        );
        var createUserResponse = Resources.CreateListUserResponse.newBuilder().addAllCreateUserResponse(userResponseList).build();

        responseObserver.onNext(createUserResponse);
        responseObserver.onCompleted();

        log.info("Save user, id {} ..", userIdList);
    }

    @Override
    public void getUser(Resources.GetUserRequest request, StreamObserver<Resources.GetUserResponse> responseObserver) {

        log.info("Calling User service ...");

        var userId = request.getUserId();

        UserDto userDto = userService.getUser(userId);

        var response = Resources.GetUserResponse
                .newBuilder()
                .setFullName(userDto.getFullName())
                .setAddress(userDto.getAddress())
                .setEmail(userDto.getEmail())
                .setUserId(userDto.getUserId())
                .setPhoneNumber(userDto.getPhoneNumber())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

        log.info("Finished call user service api ...");
    }

    @Override
    public void getListUser(Empty request, StreamObserver<Resources.GetListUserResponse> responseObserver) {

        log.info("Calling User service ...");

        List<UserDto> userDto = userService.getUserList();
        List<Resources.GetUserResponse> getUserResponseList =
                new ArrayList<>();
        userDto.forEach(user -> {
            var response = Resources.GetUserResponse
                    .newBuilder()
                    .setFullName(user.getFullName())
                    .setAddress(user.getAddress())
                    .setEmail(user.getEmail())
                    .setPhoneNumber(user.getPhoneNumber())
                    .setUserId(user.getUserId())
                    .build();
            getUserResponseList.add(response);
        });

        var response = Resources.GetListUserResponse
                .newBuilder()
                .addAllGetUserResponse(getUserResponseList)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("Finished call user service api ...");
    }

    @Override
    public void updateUser(Resources.UpdateUserRequest request, StreamObserver<Resources.UpdateUserResponse> responseObserver) {

        log.info("Calling User service ...");

        UserDto userDto = UserDto
                .builder()
                .userId(request.getUserId())
                .fullName(request.getFullName())
                .address(request.getAddress())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .build();
        Long userId = userService.updateUser(userDto);
        var response = Resources.UpdateUserResponse
                .newBuilder()
                .setUserId(userId)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("Finished call user service api ...");
    }

    @Override
    public void deleteUser(Resources.DeleteUserRequest request, StreamObserver<Resources.DeleteUserResponse> responseObserver) {

        log.info("Calling User service ...");

        Long userId = userService.deleteUser(request.getUserId());
        var response = Resources.DeleteUserResponse
                .newBuilder()
                .setUserId(userId)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("Finished call user service api ...");
    }

    @Override
    public void deleteListUser(Resources.DeleteListUserRequest request, StreamObserver<Resources.DeleteListUserResponse> responseObserver) {

        log.info("Calling User service ...");

        List<Long> userIdList = new LinkedList<>();
        request.getDeleteUserRequestList().forEach(
                deleteUserRequest -> {
                    userIdList.add(deleteUserRequest.getUserId());
                }
        );

        List<Resources.DeleteUserResponse> deleteUserResponseList =
                new ArrayList<>();
        List<Long> userIdDeleteList = userService.deleteListUser(userIdList);
        userIdDeleteList.forEach(
                userId -> {
                    var response = Resources.DeleteUserResponse
                            .newBuilder()
                            .setUserId(userId)
                            .build();
                    deleteUserResponseList.add(response);
                }
        );

        var response = Resources.DeleteListUserResponse
                .newBuilder()
                .addAllDeleteUserResponse(deleteUserResponseList)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("Finished call user service api ...");
    }
}
