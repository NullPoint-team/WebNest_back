package com.app.webnest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.app.webnest.mapper")
public class WebnestApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebnestApplication.class, args);
  }

}
