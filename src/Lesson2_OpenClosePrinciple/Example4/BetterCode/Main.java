package Lesson2_OpenClosePrinciple.Example4.BetterCode;

public class Main
{
    public static void main(String[] args) {
        Product electronic = new Product(10000, new ElectronicsDiscount());
        Product clothing = new Product(15000, new ClothingDiscount());
        Product grocery = new Product(2000, new GroceryDiscount());
        System.out.println(DiscountEvaluator.calculateDiscount(electronic));
        System.out.println(DiscountEvaluator.calculateDiscount(grocery));
    }
}