package pl.coderslab.dao;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {

    public List<Product> getList(){
        List<Product> list = new ArrayList<>();
        list.add(new Product("komputer", 10_000, 1));
        list.add(new Product("laptop", 2_000, 2));
        list.add(new Product("myszka", 100, 3));
        list.add(new Product("monitor", 1000, 1));
        list.add(new Product("klawiatura", 300, 1));
        return list;
    }
}
