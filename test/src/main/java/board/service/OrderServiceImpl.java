package board.service;

import java.util.List;
import java.util.Map;

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
	public List<Map<String, Object>> orderlist() throws Exception {
		
		return orderDao.orderlist();
	}
}
