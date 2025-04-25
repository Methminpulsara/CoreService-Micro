package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {


    private final ProductService service;

    @GetMapping("/all/{category}")
    public List<Product> getAll (@PathVariable String category){
        return service.getAll(category);
    }
}
