
package fun.sast.sast_shop;

import com.fasterxml.jackson.databind.ObjectMapper;
import fun.sast.sast_shop.pojo.entity.Product;
import fun.sast.sast_shop.repository.ProductRepository;
import lombok.SneakyThrows;
import lombok.extern.java.Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.net.URI;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
@Log
public class ProductControllerTest {

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private MockMvc mockMvc;

    Product product = new Product(1, "test product", "this is a test product", BigDecimal.valueOf(10000));

    @BeforeEach
    void setUp() {
        when(productRepository.selectById((long) 1))
                .thenReturn(product);
        when(productRepository.insert(any(Product.class)))
                .thenReturn(1);
        when(productRepository.updateById(any(Product.class)))
                .thenReturn(1);
        when(productRepository.deleteById((long) 1))
                .thenReturn(1);
    }

    @SneakyThrows
    @Test
    void testController() {
        System.out.println("testing get product");
        mockMvc.perform(MockMvcRequestBuilders
                        .get(URI.create("http://localhost:8080/product/get"))
                        .param("id", "1"))
                .andDo(result -> System.out.println("result: " + result.getResponse().getContentAsString()));

        System.out.println("testing insert product");
        mockMvc.perform(MockMvcRequestBuilders
                        .post(URI.create("http://localhost:8080/product/add"))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(product)))
                .andDo(result -> System.out.println("result: " + result.getResponse().getContentAsString()));

        System.out.println("testing update product");
        mockMvc.perform(MockMvcRequestBuilders
                        .put(URI.create("http://localhost:8080/product/update"))
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(product)))
                .andDo(result -> System.out.println("result: " + result.getResponse().getContentAsString()));

        System.out.println("testing delete product");
        mockMvc.perform(MockMvcRequestBuilders
                        .delete(URI.create("http://localhost:8080/product/delete"))
                        .param("id", "1"))
                .andDo(result -> System.out.println("result: " + result.getResponse().getContentAsString()));
    }
}
