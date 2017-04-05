package com.gogo.order.service;

import java.util.List;

import com.gogo.order.cmd.ListOrderByCdCmd;
import com.gogo.order.resp.OrderResp;

public interface OrderService {
	List<OrderResp> listByCd(ListOrderByCdCmd cmd);
}
