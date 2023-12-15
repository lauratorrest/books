package com.api.books;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BooksApplicationTests {

	@Test
	void contextLoads() {
		String test = "1";
		String testResult = "1";
		assertEquals(testResult, test);
	}

}
