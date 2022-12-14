package Admin.ProductManagement.ProductManage;

import java.util.ArrayList;

import Products.Product;

public class ViewGunByCode {
    
    public static void viewByCode(String code) throws Exception{
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list2 = rd.readProductsInfo("GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).getProductCode().equalsIgnoreCase(code)){
                System.out.println(list2.get(i).outpuProductData());
            }
        }
    }
}
