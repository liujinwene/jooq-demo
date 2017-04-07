package com.gogo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gogo.base.resp.RestResp;
import com.gogo.order.cmd.ListOrderByCdCmd;
import com.gogo.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/listByCd")
	public Object listByCd(ListOrderByCdCmd cmd) {
		return new RestResp(orderService.listByCd(cmd));
	}
	
	@RequestMapping("/listByCd3")
	public Object listByCd3(ListOrderByCdCmd cmd) {
		return new RestResp(orderService.listByCd(cmd));
	}
}
