package dev.grpc.api.user.application.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private long userId;
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;
}
