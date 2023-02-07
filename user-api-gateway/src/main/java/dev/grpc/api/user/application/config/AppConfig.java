package dev.grpc.api.user.application.config;

import dev.grpc.api.user.application.service.UserService;
import dev.grpc.api.user.application.service.impl.UserServiceImpl;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public ManagedChannel managedChannel() {
    return ManagedChannelBuilder.forAddress(
            applicationProperties().getHost(), applicationProperties().getPort())
        .usePlaintext()
        .build();
  }

  @Bean
  public UserService userService() {
    return new UserServiceImpl(managedChannel());
  }

  @Bean
  public ApplicationProperties applicationProperties() {
    return new ApplicationProperties();
  }
}
