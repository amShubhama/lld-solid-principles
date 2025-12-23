package Lesson2_OpenClosePrinciple.Example4.ProblematicCode;
enum ProductType
{
    ELECTRONICS,
    CLOTHING;
}
class Product
{
    ProductType type;
    double price;

    double getPrice()
    {
        return this.price;
    }

    ProductType getType()
    {
        return this.type;
    }
}
public class DiscountEvaluator
{
    public double calculateDiscount(Product product)
    {
        if(product.getType() == ProductType.ELECTRONICS)
            return product.getPrice() * 0.10;
        else if(product.getType() == ProductType.CLOTHING)
            return product.getPrice() * 0.25;
        return 0;
    }
}