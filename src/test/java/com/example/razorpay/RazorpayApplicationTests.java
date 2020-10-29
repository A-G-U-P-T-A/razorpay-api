package com.example.razorpay;

import com.example.razorpay.controller.RazorpayController;
import com.example.razorpay.services.MongoService;
import com.example.razorpay.services.RazorpayService;
import com.mongodb.MongoException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RazorpayApplicationTests {

	@Autowired
	RazorpayService razorpayService;

	@Autowired
	MongoService mongoService;

	@Test
	void contextLoads() { }

	@Test
	void RazorpayServiceTest() throws Exception {
		if(razorpayService==null)
			throw new Exception();
	}

	@Test
	void MongoServiceTest() throws MongoException {
		if(mongoService==null||mongoService.mongoClient==null)
			throw new MongoException("ERROR");
	}

}
