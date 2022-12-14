package Products.Guns.Pistols;

import Products.Guns.*;


public class Pistol extends Gun {
    public Pistol() {
        this.productCode = "PISTOL";
    }

    public Pistol(String productName, float productPrice, int remaining) {
        this.productCode = "PISTOL";
        this.productName = productName;
        this.productPrice = productPrice;
        this.remaining = remaining;
    }
}
