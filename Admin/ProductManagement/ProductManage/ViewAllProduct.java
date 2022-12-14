package Admin.ProductManagement.ProductManage;

import java.util.ArrayList;

import Products.Product;


public class ViewAllProduct {
    public static void view() throws Exception{
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list2 = rd.readProductsInfo();
        for (int i = 0; i < list2.size(); i++) {
            System.out.println((i+1)+"."+list2.get(i).outpuProductData());
        }
    }
}
