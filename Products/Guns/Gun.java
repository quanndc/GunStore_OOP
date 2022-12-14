package Products.Guns;

import ProductType.GunType;
import Products.Product;

public class Gun extends Product{
    public Gun(){
        productTypeCode = GunType.productTypeCode;
        productTypeName = GunType.productTypeName;
    }
}
