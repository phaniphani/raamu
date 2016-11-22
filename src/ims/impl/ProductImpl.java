package ims.impl;


import ims.interfaces.Product;

/**
 * Created by k on 11/21/16.
 */
public class ProductImpl implements Product{

    String prodcutId;
    int amountLeft;
    int level;

    public String getProdcutId() {
        return prodcutId;
    }

    public void setProdcutId(String prodcutId) {
        this.prodcutId = prodcutId;
    }

    public int getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(int amountLeft) {
        this.amountLeft = amountLeft;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
