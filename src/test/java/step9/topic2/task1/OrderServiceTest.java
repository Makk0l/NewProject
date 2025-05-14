package step9.topic2.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @InjectMocks
    private OrderService orderService;
    @Mock
    private InventoryService inventoryService;
    @Mock
    private OrderRepository orderRepository;

    Order order;

    @BeforeEach
    void setUp() {
        order = new Order("pl12", 5, 15.5);
    }

    @Test
    void processOrderTest_true() {
        Mockito.when(inventoryService.isProductAvailable("pl12", 5)).thenReturn(true);

        boolean result = orderService.processOrder(order);
        Assertions.assertTrue(result);

        Mockito.verify(inventoryService, Mockito.times(1)).isProductAvailable("pl12", 5);
        Mockito.verify(orderRepository, Mockito.times(1)).saveOrder(order);
    }

    @Test
    void processOrderTest_false() {
        Mockito.when(inventoryService.isProductAvailable("pl12", 5)).thenReturn(false);

        boolean result = orderService.processOrder(order);
        Assertions.assertFalse(result);

        Mockito.verify(inventoryService, Mockito.times(1)).isProductAvailable("pl12", 5);
        Mockito.verify(orderRepository, Mockito.never()).saveOrder(order);
    }
}
