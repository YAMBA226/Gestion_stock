package stock.com.stock.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;
    private String contact;
    private String address;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
