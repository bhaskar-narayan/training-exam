/**
Suppose a class VegetableBill keeps track of a list of vegetables being purchased at a market:

Method/Constructor    Description

public VegetableBill(Employee clerk)    constructs a VegetableBill object for the given clerk

public void add(Item i)    adds i to this bill's total

public double getTotal()    returns the cost of these items

public void printReceipt()    prints a list of items

VegetableBill objects interact with Item objects. An Item has the following public methods:

Method/Constructor    Description

public double getPrice()    returns the price for this item

public double getDiscount()    returns the discount for this item

For example, Onion item might cost 1.35 with a discount of 0.25 for preferred customers, meaning that preferred customers get it for 1.10. 

(Some items will have no discount, 0.0.) Currently the above classes do not consider discounts. Every item in a bill is charged full price, and item discounts

 are ignored.

Define a class DiscountBill that extends VegetableBill to compute discounts for preferred customers. The constructor for DiscountBill accepts a parameter for

 whether the customer should get the discount.

Your class should adjust the amount reported by getTotal for preferred customers. For example, if the total would have been $80 but a preferred customer is getting $20 in discounts, then getTotal should report the total as $60 for that customer. You should also keep track of how many items a customer is getting a non-zero discount for and the overall discount, both as a total amount and as a percentage of the original bill. Include the extra methods below that allow a client to ask about the discount:

Method/Constructor    Description

public DiscountBill(Employee clerk, boolean preferred)    constructs bill for given clerk

public int getDiscountCount()    returns the number of items that were discounted, if any

public double getDiscountAmount()    returns the total discount for this list of items, if any

public double getDiscountPercent()    returns the percent of the total discount as a percent of what the total would have been otherwise

If the customer is not a preferred customer the DiscountBill behaves at all times as if there is a total discount of 0.0 and no items have been discounted. 
*/

import java.util.ArrayList;
import java.util.List;

class Item {
    double  itemPrice, itemDiscount;
    String itemName;
    Item(String itemName, double itemPrice, double itemDiscount) {
        this.itemDiscount = itemDiscount;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    double getPrice() {
        return itemPrice;
    }
    double getDiscount() {
        return itemDiscount;
    }
}

class Employee {
    String clerkName;
    Employee(String clerkName) {
        this.clerkName = clerkName;
    }
}

class VegetableBill {
    Employee clerk;
    double totalAmount = 0;
    List<Item> itemList = new ArrayList<Item>();
    void setClerk(Employee clerk) {
        this.clerk = clerk;
    }
    void add(Item item) {
        itemList.add(item);
    }
    double getTotal() {
        for (Item item : itemList) {
            totalAmount += item.itemPrice;
        }
        return totalAmount;
    }
    void printReceipt() {
        for (Item item : itemList) {
            System.out.print(item.itemName + " : " + item.itemPrice);
            System.out.println("");
        }
    }
}
class DiscountBill extends VegetableBill {
    boolean preferred;
    DiscountBill(boolean preferred) {
        this.preferred = preferred;
    }
    int getDiscountCount() {
        //  returns the number of items that were discounted, if any
    }
    double getDiscountAmount() {
        //  returns the total discount for this list or items, if any
    }
    double getDiscountPercent() {
        //  returns the percent of the total discount as a percent of what the total would have been otherwise discount will be 0.0
    }
}

public class Main1 {
    public static void main(String[] args) {

    }
}
