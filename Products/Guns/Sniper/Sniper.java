package Products.Guns.Sniper;


import Products.Guns.*;

public class Sniper extends Gun{
    public Sniper(){
        this.productCode = "SNIPER";
    }

    public Sniper(String productName, float productPrice, int remaining){
        this.productCode = "SNIPER";
        this.productName = productName;
        this.productPrice = productPrice;
        this.remaining = remaining;
     }
}
