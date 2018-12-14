package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void setString() {
		stringRedisTemplate.opsForValue().set("name","apple");
	}

	@Test
	public void getString() {
		String name = stringRedisTemplate.opsForValue().get("name");
		System.out.println(name);
	}

	@Test
	public void contextLoads() {
	}

}

