package fun.sast.sast_shop.service;

import fun.sast.sast_shop.pojo.entity.Product;

public interface ProductService {
    String addProduct(Product product);
    String deleteProduct(long id);
    String updateProduct(Product product);
    Product getProduct(long id);
}
