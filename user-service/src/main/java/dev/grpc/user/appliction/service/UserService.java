package dev.grpc.user.appliction.service;

import dev.grpc.user.appliction.dto.UserDto;
import dev.grpc.user.appliction.entity.UserEntity;
import dev.grpc.user.appliction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public long saveUser(UserDto userDto) {
        UserEntity userEntity = toUserEntity(userDto);
        UserEntity userEntityResult = userRepository.save(userEntity);
        return userEntityResult.getId();
    }

    public List<Long> saveUserList(List<UserDto> userDtoList) {
        List<UserEntity> userEntityList = userDtoList.stream().map(this::toUserEntity).collect(Collectors.toList());
        List<UserEntity> userEntityListResult = userRepository.saveAll(userEntityList);
        return userEntityListResult.stream().map(UserEntity::getId).collect(Collectors.toList());
    }

    public UserDto getUser(long userId) {

        Optional<UserEntity> userEntity = userRepository.findById(userId);
        return toUserDto(userEntity.get());
    }

    public List<UserDto> getUserList() {
        List<UserEntity> userEntityList = userRepository.findAll();

        return userEntityList.stream().map(this::toUserDto).collect(Collectors.toList());
    }

    public Long updateUser(UserDto userDto) {
        System.out.println(userDto);
        UserEntity userEntity = toUserEntityUpdate(userDto);
        var checkIsExitsBeforeUpdate = false;
        checkIsExitsBeforeUpdate = optimisticLookingResult(userEntity.getId());
        if (checkIsExitsBeforeUpdate) return 0L;
        userRepository.save(userEntity);
        return userEntity.getId();
    }

    public Long deleteUser(Long userId) {
        var checkIsExitsBeforeUpdate = false;
        checkIsExitsBeforeUpdate = optimisticLookingResult(userId);
        if (checkIsExitsBeforeUpdate)
            return 0L;
        userRepository.deleteById(userId);
        return userId;
    }

    public List<Long> deleteListUser(List<Long> userIdList) {
        List<Long> userIdDelete = new LinkedList<>();
        userIdList.forEach(userId -> {
            var checkIsExitsBeforeUpdate = false;
            checkIsExitsBeforeUpdate = optimisticLookingResult(userId);
            if (checkIsExitsBeforeUpdate)
                return;
            userRepository.deleteById(userId);
            userIdDelete.add(userId);
        });
        return userIdDelete;
    }

    private UserEntity toUserEntity(UserDto userDto) {

        return UserEntity
                .builder()
                .fullName(userDto.getFullName())
                .address(userDto.getAddress())
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .build();
    }

    private UserEntity toUserEntityUpdate(UserDto userDto) {

        return UserEntity
                .builder()
                .id(userDto.getUserId())
                .fullName(userDto.getFullName())
                .address(userDto.getAddress())
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .build();
    }
    private UserDto toUserDto(UserEntity userEntity) {

        return UserDto
                .builder()
                .fullName(userEntity.getFullName())
                .address(userEntity.getAddress())
                .email(userEntity.getEmail())
                .phoneNumber(userEntity.getPhoneNumber())
                .userId(userEntity.getId())
                .build();
    }

    private boolean optimisticLookingResult(Long userId) {
        var user = userRepository.findById(userId);
        return Objects.isNull(user);
    }
}
