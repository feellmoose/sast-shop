package fun.sast.sast_shop.controller.impl;

import fun.sast.sast_shop.controller.ProductController;
import fun.sast.sast_shop.pojo.entity.Product;
import fun.sast.sast_shop.service.ProductService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class ProductControllerImpl implements ProductController {
    @Resource
    private ProductService productService;

    @Override
    public String addProduct(Product product) {
        return productService.addProduct(product);
    }

    @Override
    public Product getProduct(long id) {
        return productService.getProduct(id);
    }

    @Override
    public String updateProduct(Product product) {
        return productService.updateProduct(product);
    }

    @Override
    public String deleteProduct(long id) {
        return productService.deleteProduct(id);
    }
}
