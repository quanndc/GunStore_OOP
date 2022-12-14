package Admin.ProductManagement.ProductTypeManage;

import java.util.ArrayList;

import Products.Product;

public class ViewAllProductType {
    public static void view() throws Exception{
        ReadProductType rd = new ReadProductType();
        ArrayList<Product> list = rd.readProductsInfo();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).outputDataType());
        }
    }
}
