package ims.impl;

import ims.interfaces.PickingResult;
import ims.interfaces.Product;
import ims.interfaces.RestockingResult;

/**
 * Created by k on 11/21/16.
 */
public class PickingResultImpl extends InventoryManagementSystemImpl implements PickingResult{

    Product product;

    public PickingResult pickProduct(String productId, int amountToPick) {

        this.product = findProduct(productId);

        if (product != null) {
            int amountLeft = product.getAmountLeft();
            product.setAmountLeft(amountLeft - amountToPick);
        }

        return null;
    }

}
