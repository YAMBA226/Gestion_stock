package stock.com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.com.stock.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
