package com.sidgs.controller;

import com.sidgs.service.ProductService;
import com.sidgs.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Vytlasai on 2/23/2017.
 */
public class ProductController {

    private static final Logger logger = Logger.getLogger("ProductController.class");
    public ProductController(){
        System.out.println("ProductController()");
    }

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/")
    public ModelAndView listProduct(ModelAndView model) throws IOException {
        List<Product> listProduct = productService.getAllProducts();
        model.addObject("listProduct", listProduct);
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = "/newProduct", method = RequestMethod.GET)
    public ModelAndView newProduct(ModelAndView model){
        Product product = new Product();
        model.addObject("product", product);
        model.setViewName("ProductForm");
        return model;
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.GET)
    public ModelAndView saveProduct(@ModelAttribute Product product) {

        if(product.getId()==0) {
            // if product id = 0 then creating the
            productService.addProduct(product);
        } else {
            productService.updateEmployee(product);
        }
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editProduct", method = RequestMethod.GET)
    public ModelAndView editProduct(HttpServletRequest request){
        int productId = Integer.parseInt(request.getParameter("id"));
        Product product = productService.getProduct(productId);
        ModelAndView model = new ModelAndView("ProductForm");
        model.addObject("product", product);
        return model;
    }

}


