package Products.Amors;

import ProductType.ArmorType;
import Products.Product;

public class Amor extends Product{
    public static int totalRemaining = 0;

    public Amor(){
        productTypeCode = ArmorType.productTypeCode;
        productTypeName = ArmorType.productTypeName;
        this.productCode = "AMOR";
    }

    public Amor(String productName, float productPrice, int remaining){
        productTypeCode = ArmorType.productTypeCode;
        productTypeName = ArmorType.productTypeName;
        this.productCode = "AMOR";
        this.productName = productName;
        this.productPrice = productPrice;
        this.remaining = remaining;
        Amor.totalRemaining+=this.remaining;
     }
}
