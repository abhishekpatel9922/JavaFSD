package Interface;

import java.util.Scanner;

public class RetailShop implements Retail {
    public float getTotalCost(float tax, float cost, float number){
        float totalCost = (cost*(1+(tax/100)))*number;
        return totalCost;
    }
    public float getTotalExtendCost(float cosmetics, float perfume, float clothes){
        float totalExtendCost = cosmetics+perfume+clothes;
        System.out.println("Toptal cost all item:" +totalExtendCost);
        return totalExtendCost;
    }
    public void getDiscountedCost(float totalcost){
        double discountedcost = (totalcost*(0.98));
        System.out.println("discounted price is :" +discountedcost);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to retailshop");
        System.out.println("Enter quantity of cosmetics");
        float cosmetics = sc.nextFloat();
        System.out.println("Enter quantity of perfume");
        float perfume = sc.nextFloat();
        System.out.println("Enter quantity of clothes");
        float clothes = sc.nextFloat();

        RetailShop obj1 = new RetailShop();
        float amount = obj1.getTotalCost(7,10000,cosmetics);
        System.out.println("Total cost of costmetics" +amount);
        float amount1 = obj1.getTotalCost(12,5000,perfume);
        System.out.println("Total cost of perfume" +amount1);
        float amount2 = obj1.getTotalCost(4,7000,clothes);
        System.out.println("Total cost of clothes" +amount2);

        float totalcost = obj1.getTotalExtendCost(amount,amount1,amount2);
        obj1.getDiscountedCost(totalcost);

    }





}
