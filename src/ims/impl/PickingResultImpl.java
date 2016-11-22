package ims.impl;

import ims.interfaces.PickingResult;
import ims.interfaces.Product;

/**
 * Created by k on 11/21/16.
 */
public class PickingResultImpl extends InventoryManagementSystemImpl implements PickingResult{

    String productId;
    int level;
    int amountPicked;
    String location;
    public synchronized PickingResult pickProduct(String productId, int amountToPick) {

        Product product = findProduct(productId);
        PickingResult pickingResult = new PickingResultImpl();
        if (product != null) {
                pickingResult.setAmountPicked(amountToPick);
                pickingResult.setProductId(productId);
                pickingResult.setLevel(product.getLevel());
                pickingResult.setLocation(product.getLocation());
                return pickingResult;
        }
        return null;
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
    public int getAmountPicked() {
        return amountPicked;
    }

    @Override
    public void setAmountPicked(int amountPicked) {
        this.amountPicked = amountPicked;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }


}
