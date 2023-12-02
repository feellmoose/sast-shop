package fun.sast.sast_shop.service.impl;

import fun.sast.sast_shop.pojo.entity.Product;
import fun.sast.sast_shop.repository.ProductRepository;
import fun.sast.sast_shop.service.ProductService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductRepository productRepository;

    @Override
    public String addProduct(Product product) {
        productRepository.insert(product);
        return "ok";
    }

    @Override
    public String deleteProduct(long id) {
        productRepository.deleteById(id);
        return "ok";
    }

    @Override
    public String updateProduct(Product product) {
        productRepository.updateById(product);
        return "ok";
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.selectById(id);
    }
}
