package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	@Test
	public void calculatorsum() {
		calculatorservice  ms = new calculatorservice();
		System.out.println("hello");
		Assertions.assertEquals(ms.sum(), 14);
	}
	@Test
	public void calculatorsub() {
		calculatorservice  ms = new calculatorservice();
		
		Assertions.assertEquals(ms.substraction(), 50);
		
	}
	@Test
	public void calculatormul() {
		calculatorservice  ms = new calculatorservice();
		
		Assertions.assertEquals(ms.multiply(), 5000);
		
	}
	@Test
	public void calculatordiv() {
		calculatorservice  ms = new calculatorservice();
		
		Assertions.assertEquals(ms.division(), 40);
	}
	
}
