package board.service;

import org.springframework.stereotype.Service;

import board.dao.OrderDao;
import board.domain.OrderVO;

@Service
public class OrderServiceImpl implements OrderService{
	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
}
