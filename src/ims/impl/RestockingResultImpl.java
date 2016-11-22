package ims.impl;

import ims.interfaces.Product;
import ims.interfaces.RestockingResult;

/**
 * Created by k on 11/21/16.
 */
public class RestockingResultImpl extends InventoryManagementSystemImpl implements RestockingResult{


    String productId;
    int level;
    int amountAdded;
    String location;
    String defaultLocation = "";
    int defaultLevel = 0;

    public RestockingResult restockProduct(RestockingResult restockingResult, String productId, int amountToRestock) {
        Product product = findProduct(productId);
        if (product != null) {
            restockingResult.setAmountAdded(amountToRestock);
            restockingResult.setProductId(productId);
            restockingResult.setLevel(product.getLevel());
            return restockingResult;
        } else {
            product = new ProductImpl(productId, defaultLocation, defaultLevel);
        }
        addProduct(product, amountToRestock);
        return null;
    }


    public void addProduct(Product product, int amount) {
        if (productCount.get(product.getProductId()) == null) {
            products.add(product);
            productCount.put(product.getProductId(), productCount.get(product.getProductId()) + amount);
        }
        else {
            productCount.put(product.getProductId(), amount);
        }
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setAmountAdded(int amountAdded) {
        this.amountAdded = amountAdded;
    }

    @Override
    public int getAmountAdded() {
        return this.amountAdded;
    }
}
