package com.sidgs.product.error;

import com.sidgs.product.model.Product;

/**
 * Created by Vytlasai on 2/22/2017.
 */
    public class ProductException extends Exception{

    public ProductException(){
    }

    public ProductException(String message){super(message);}

    public ProductException(String message, Throwable cause){super(message,cause);}

    public ProductException(Throwable cause) {super(cause);}

    public ProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
