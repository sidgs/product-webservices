package com.sidgs.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Vytlasai on 2/23/2017.
 */

@Entity
@Table(name ="product")
public class Product implements Serializable{

    private static final long serialVersionUID = -3453356565566655L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int product_id;

    @Column
    private String product_name;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public String getProduct_style() {
        return product_style;
    }

    public void setProduct_style(String product_style) {
        this.product_style = product_style;
    }

    @Column

    private String description;

    @Column
    private String product_image;

    @Column
    private String product_brand;

    @Column
    private String product_style;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;


        if (id != product.id) return false;
        if (product_id != product.product_id) return false;
        if (product_name != null ? !product_name.equals(product.product_name) : product.product_name != null)
            return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (product_image != null ? !product_image.equals(product.product_image) : product.product_image != null)
            return false;
        if (product_brand != null ? !product_brand.equals(product.product_brand) : product.product_brand != null)
            return false;
        return product_style != null ? product_style.equals(product.product_style) : product.product_style == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + product_id;
        result = 31 * result + (product_name != null ? product_name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (product_image != null ? product_image.hashCode() : 0);
        result = 31 * result + (product_brand != null ? product_brand.hashCode() : 0);
        result = 31 * result + (product_style != null ? product_style.hashCode() : 0);
        return result;
    }
}
