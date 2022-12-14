package Products.Guns.Shotgun;

import Products.Guns.Gun;


public class Shotgun extends Gun{
    public Shotgun(){
        this.productCode = "SHOTGUN";
    }

    public Shotgun(String productName, float productPrice, int remaining){
        this.productCode = "SHOTGUN";
        this.productName = productName;
        this.productPrice = productPrice;
        this.remaining = remaining;
    }
}
