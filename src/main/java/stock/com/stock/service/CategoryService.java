package stock.com.stock.service;

import aj.org.objectweb.asm.ConstantDynamic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.com.stock.entity.Category;
import stock.com.stock.exception.AlreadyExist;
import stock.com.stock.exception.RequiredValue;
import stock.com.stock.repository.CategoryRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category saveCategry(Category category) throws IOException {
        if(category.getName() == null || category.getName().isEmpty()) {
            throw new RequiredValue("name is required");
        }

        Optional<Category> existingCategory = categoryRepository.findByName(category.getName());
        if(existingCategory.isPresent()) {
            throw new AlreadyExist("This category is already existing");
        }
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategory() throws IOException{
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()) {
            throw new FileNotFoundException("Not category find");
        }
        return categories;
    }

}
