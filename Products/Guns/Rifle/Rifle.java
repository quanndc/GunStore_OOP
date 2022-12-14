package Products.Guns.Rifle;

import Products.Guns.Gun;


public class Rifle extends Gun{
    public Rifle(){
        this.productCode = "RIFLE";
    }

    public Rifle(String productName, float productPrice, int remaining){
        this.productCode = "RIFLE";
        this.productName = productName;
        this.productPrice = productPrice;
        this.remaining = remaining;
    }
}
