package stock.com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.com.stock.entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem ,Long> {
}
