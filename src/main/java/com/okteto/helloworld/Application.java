package com.okteto.items;

import com.okteto.items.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Application {

	@Bean
	public RedisTemplate<String, Item> deliveryRedisTemplate(RedisConnectionFactory connectionFactory) {
    	RedisTemplate<String, Item> template = new RedisTemplate<String, Item>();
    	template.setConnectionFactory(connectionFactory);
    	return template;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
