package dev.grpc.user.appliction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private long userId;
    private String fullName;
    private String email;
    private String address;
    private String phoneNumber;
}
