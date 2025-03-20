package stock.com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.com.stock.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
