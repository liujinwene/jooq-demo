package com.gogo.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gogo.base.core.CoreServerApp;
import com.gogo.order.cmd.ListOrderByCdCmd;
import com.gogo.order.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreServerApp.class)
@WebAppConfiguration
public class OrderTest {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void test() {
		ListOrderByCdCmd cmd = new ListOrderByCdCmd();
		orderService.listByCd(cmd);
		System.out.println("success");
	}

}
