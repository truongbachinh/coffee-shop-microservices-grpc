package dev.grpc.api.user.application.mapper;

import dev.grpc.api.user.application.model.User;
import dev.grpc.user.Resources;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class UserMapper {

    public static final UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    public abstract User userMapper(Resources.GetUserResponse getUserResponse);

  //  public abstract List<User> userListMapper(Resources.GetListUserResponse getListUserResponse);

}
