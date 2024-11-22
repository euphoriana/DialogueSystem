package com.CQU.CQUChat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.CQU.CQUChat.mapper")
public class CQUChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CQUChatApplication.class, args);
	}

}
