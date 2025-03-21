package stock.com.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.com.stock.entity.Product;
import stock.com.stock.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // recuperer tout les produits
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Récuperer un produit par son ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Ajouter un nouveau produit
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Mettre à jour un produit
    public Product updateProduct(Long id, Product updatedProduct) {
        if (productRepository.existsById(id)) {
            updatedProduct.setId(id);
            return productRepository.save(updatedProduct);
        }
        return null; // Ou lancer une exception
    }

    // Supprimer un produit
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
