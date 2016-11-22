package ims;

import ims.impl.InventoryManagementSystemImpl;
import ims.interfaces.InventoryManagementSystem;
import ims.interfaces.PickingResult;
import ims.interfaces.RestockingResult;

/**
 * Created by k on 11/21/16.
 */
public class Main {

    public static void main(String args[])throws Exception{

        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystemImpl();

        RestockingResult restockingResult = inventoryManagementSystem.restockProduct("ABC", 10);
        PickingResult pickingResult = inventoryManagementSystem.pickProduct("ABC", 10);

    }
}
