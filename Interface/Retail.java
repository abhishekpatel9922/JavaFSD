package Interface;

public interface Retail {
    float getTotalCost(float tax, float cost, float number);
    float getTotalExtendCost(float cosmetics, float perfume, float clothes);
    void getDiscountedCost(float totalcost);
}
