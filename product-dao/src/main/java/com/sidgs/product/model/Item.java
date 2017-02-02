package com.sidgs.product.model;

public class Item {

    Number productId; // optional
    Number styleId; //required
    Number itemId; // required ; but generated
    Number itemQty; // optional
    Float itemPrice; // optional

    public Item() {
    }

    public Item(Number productId, Number styleId, Number itemId, Number itemQty, Float itemPrice) {
        super();
        this.productId = productId;
        this.styleId = styleId;
        this.itemId = itemId;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
    }

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public Number getStyleId() {
        return styleId;
    }

    public void setStyleId(Number styleId) {
        this.styleId = styleId;
    }

    public Number getItemId() {
        return itemId;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public Number getItemQty() {
        return itemQty;
    }

    public void setItemQty(Number itemQty) {
        this.itemQty = itemQty;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }


}
