package dev.grpc.user.api.mapper;

import dev.grpc.user.Resources.CreateUserRequest;
import dev.grpc.user.appliction.dto.UserDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-07T23:55:41+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.4.1.jar, environment: Java 11.0.17 (Amazon.com Inc.)"
)
public class UserMapperImpl extends UserMapper {

    @Override
    public UserDto createMapping(CreateUserRequest createUserRequest) {
        if ( createUserRequest == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setFullName( createUserRequest.getFullName() );
        userDto.setEmail( createUserRequest.getEmail() );
        userDto.setAddress( createUserRequest.getAddress() );
        userDto.setPhoneNumber( createUserRequest.getPhoneNumber() );

        return userDto;
    }
}
