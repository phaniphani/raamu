package ims.impl;

import ims.interfaces.InventoryManagementSystem;
import ims.interfaces.PickingResult;
import ims.interfaces.Product;
import ims.interfaces.RestockingResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k on 11/21/16.
 */
public abstract class InventoryManagementSystemImpl implements InventoryManagementSystem{


    List<Product> products = new ArrayList<Product>();

    public PickingResult pickProduct(String productId, int amountToPick){
        return null;
    }

    public RestockingResult restockProduct(String productId, int amountToRestock) {
        return null;
    }

    public Product findProduct(String productId) {
            for (Product product : products) {
                if (product.getProdcutId().equals(productId)) {
                    return product;
                }
            }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

}
