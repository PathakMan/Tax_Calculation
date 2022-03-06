package com.company;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {

        double PriceWithoutVAT = 9.99;

        System.out.println("Price Without VAT: " + PriceWithoutVAT);

        double PriceWithVAT = PriceWithoutVAT * 1.23;
        System.out.println("Price With VAT: " + PriceWithVAT);

        double ValueWithVAT = PriceWithVAT * 10000;
        System.out.println("Value With VAT: " + ValueWithVAT);

        double PriceWithoutVAT2 = ValueWithVAT / 1.23;
        System.out.println("Value Without VAT: " + PriceWithoutVAT2);

        //Now here we are using The BigDeciaml Class

        System.out.println("");
        System.out.println("Same thing after using Big Decimal");


        BigDecimal dbPriceWIthoutVAT = new BigDecimal("9.99");
        System.out.println("Price without VAT: " + dbPriceWIthoutVAT);

        BigDecimal dbPriceWithVAT = dbPriceWIthoutVAT.multiply(
                new BigDecimal("1.23"));

        dbPriceWithVAT = dbPriceWithVAT.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price With VAT rounded: " + dbPriceWithVAT);

        BigDecimal dbValueWithVAT = dbPriceWithVAT.multiply(
                new BigDecimal(10000));
        System.out.println("Value With VAT: " + dbValueWithVAT);

        BigDecimal dbPriceWithoutVAT2 = dbValueWithVAT.divide(
                new BigDecimal("1.23"),
        BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Value Without VAT: " + dbPriceWithoutVAT2);





    }
}
