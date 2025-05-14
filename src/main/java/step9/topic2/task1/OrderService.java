package step9.topic2.task1;

public class OrderService {
    private InventoryService inventoryService;
    private OrderRepository orderRepository;

    public OrderService(InventoryService inventoryService, OrderRepository orderRepository) {
        this.inventoryService = inventoryService;
        this.orderRepository = orderRepository;
    }

    public boolean processOrder(Order order) {
        if (inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())) {
            orderRepository.saveOrder(order);
            return true;
        }
        return false;
    }
}
