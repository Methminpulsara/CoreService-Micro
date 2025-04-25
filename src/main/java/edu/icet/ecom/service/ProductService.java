package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;
@Service
@Slf4j
public class ProductService {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> getAll (String category){

        Product [] response =
         restTemplate.getForObject("https://fakestoreapi.com/products",Product [].class);
        return  Arrays.stream(response)
                .filter(product -> category.equalsIgnoreCase((product.getCategory())))
                .toList();
    }


    @Scheduled(cron = "*/5 * * * * *")
    public void sendSeasonalGreeting(){
        log.info("sent");
    }


}
