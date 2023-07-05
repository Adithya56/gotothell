package eStoreProduct.DAO;

import java.sql.Timestamp;
import java.util.List;

import eStoreProduct.model.admin.entities.orderModel;
import eStoreProduct.model.customer.entities.OrderProducts;
import eStoreProduct.utility.ProductStockPrice;

public interface OrderDAO {
	void insertOrder(orderModel order);

	List<orderModel> getAllOrders();

	List<orderModel> loadOrdersByDate(Timestamp startDate, Timestamp endDate);

	void updateOrderProcessedBy(Long orderId, Integer processedBy);

	void updateOrderShipmentStatus(int orderId, String status);

//	void insertIntoOrders(orderModel or, List<ProductStockPrice> al);

	void insertIntoOrders(orderModel order, List<OrderProducts> orderProductsList);
	
}