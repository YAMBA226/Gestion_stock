package stock.com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.com.stock.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
