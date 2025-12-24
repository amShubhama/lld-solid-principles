package Lesson4_InterfaceSegregationPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Admin> admins = new ArrayList<>();
        admins.add(new Admin());

        for(Admin admin: admins)
        {
            admin.approveProducts();
        }

        List<Buyer> buyers = new ArrayList<>();
        buyers.add(new Buyer());

        for(Buyer buyer:buyers)
        {
            buyer.buyProducts();
        }
    }
}
