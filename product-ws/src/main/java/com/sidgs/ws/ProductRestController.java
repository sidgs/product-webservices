package com.sidgs.ws;

import com.sidgs.product.ProductService;
import com.sidgs.product.error.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vytlasai on 2/19/2017.
 */

@RestController
@RequestMapping("product")
public class ProductRestController {

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<com.sidgs.product.model.Product> getProducts() throws ProductException {
        return productService.getProducts();
    }
}