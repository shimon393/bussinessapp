package org.example;

public class Computediscount {


    public double Getdiscount(double discountrate, double quantity, double unitprice)

    {
        double discount = 0;
        if(quantity >= 500) {
            return (quantity * unitprice * discountrate);
        } else{
            System.out.println( "You do not qualify for a discount");
           return 0;

        }

    }
}

