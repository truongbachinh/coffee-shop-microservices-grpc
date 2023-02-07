package dev.grpc.api.user.application.mapper;

import dev.grpc.api.user.application.model.User;
import dev.grpc.user.Resources.GetUserResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-08T01:02:55+0700",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.4.1.jar, environment: Java 11.0.17 (Amazon.com Inc.)"
)
public class UserMapperImpl extends UserMapper {

    @Override
    public User userMapper(GetUserResponse getUserResponse) {
        if ( getUserResponse == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( getUserResponse.getUserId() );
        user.setFullName( getUserResponse.getFullName() );
        user.setAddress( getUserResponse.getAddress() );
        user.setEmail( getUserResponse.getEmail() );
        user.setPhoneNumber( getUserResponse.getPhoneNumber() );

        return user;
    }
}
