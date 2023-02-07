package dev.grpc.user.appliction.repository;

import dev.grpc.user.appliction.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
