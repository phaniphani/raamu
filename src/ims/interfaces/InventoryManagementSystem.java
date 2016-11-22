package ims.interfaces;

/**
 * Created by k on 11/21/16.
 */
public interface InventoryManagementSystem {

    PickingResult pickProduct(String productId, int amountToPick);

    RestockingResult restockProduct(String productId, int amountToRestock);

}
