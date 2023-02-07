package dev.grpc.api.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"dev.grpc.api.user", "dev.grpc.commons"})
public class UserGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserGatewayApplication.class, args);
  }
}
