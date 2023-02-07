package dev.grpc.user.api.mapper;

import dev.grpc.user.Resources;
import dev.grpc.user.appliction.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class UserMapper {

    public static final UserMapper MAPPER =
            Mappers.getMapper(UserMapper.class);

    public abstract UserDto createMapping(Resources.CreateUserRequest createUserRequest);
}
