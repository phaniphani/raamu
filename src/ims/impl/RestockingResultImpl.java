package ims.impl;

import ims.interfaces.RestockingResult;

/**
 * Created by k on 11/21/16.
 */
public class RestockingResultImpl extends InventoryManagementSystemImpl implements RestockingResult{

    public RestockingResult restockProduct(String productId, int amountToRestock) {

        RestockingResult restockingResult = new RestockingResultImpl();
        return restockingResult;
    }
}
