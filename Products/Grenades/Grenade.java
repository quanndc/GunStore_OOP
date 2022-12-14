package Products.Grenades;

import ProductType.GrenadeType;
import Products.Product;

public class Grenade extends Product{
    public static int totalRemaining = 0;

    public Grenade(){
        productTypeCode = GrenadeType.productTypeCode;
        productTypeName = GrenadeType.productTypeName;
        this.productCode = "GRENADE";
    }

    public Grenade(String productName, float productPrice, int remaining){
        productTypeCode = "GR";
        productTypeName = "Grenade";
        this.productCode = "GRENADE";
        this.productName = productName;
        this.productPrice = productPrice;
        this.remaining = remaining;
        Grenade.totalRemaining+=this.remaining;
    }
}
