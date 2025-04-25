package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller+@Component+@Responsbody = @RestController
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@ResponseBody
public class ProductController {


    private final ProductService service;

    @GetMapping("/all/{category}")
    public List<Product> getAll (@PathVariable String category){
        return service.getAll(category);
    }
}
