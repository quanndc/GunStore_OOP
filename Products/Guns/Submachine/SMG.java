package Products.Guns.Submachine;

import Products.Guns.Gun;


public class SMG extends Gun{
   public SMG(){
      this.productCode = "SMG";
   }

   public SMG(String productName, float productPrice, int remaining){
      this.productCode = "SMG";
      this.productName = productName;
      this.productPrice = productPrice;
      this.remaining = remaining;
   }
}
