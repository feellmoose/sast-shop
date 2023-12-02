package fun.sast.sast_shop.controller;

import fun.sast.sast_shop.pojo.entity.Product;
import org.springframework.web.bind.annotation.*;


@ResponseBody
@RequestMapping("/product")
public interface ProductController {

    /**
     * Create
     *
     * @param product 商品信息
     * @return ok
     */
    @PostMapping("/add")
    String addProduct(@RequestBody Product product);

    /**
     * Read
     *
     * @param id 商品id
     * @return product 商品信息
     */
    @GetMapping("/get")
    Product getProduct(long id);

    /**
     * Update
     *
     * @param product 商品信息
     * @return ok
     */
    @PutMapping("/update")
    String updateProduct(Product product);

    /**
     * Delete
     *
     * @param id 商品id
     * @return ok
     */
    @DeleteMapping("/delete")
    String deleteProduct(long id);

}
