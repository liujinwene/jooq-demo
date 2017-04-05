package com.gogo.order.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gogo.order.cmd.ListOrderByCdCmd;
import com.gogo.order.resp.OrderResp;

@Service
public class OrderServiceImpl implements OrderService {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);


	@Override
	public List<OrderResp> listByCd(ListOrderByCdCmd cmd) {
		List<OrderResp> list = new ArrayList<OrderResp>();
		return list;
	}
}
