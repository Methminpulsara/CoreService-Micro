package edu.icet.ecom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Product {

    private String titel;
    private Double price;
    private String discription;
    private String category;

}
