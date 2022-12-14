package Admin.ProductManagement.ProductManage;

import java.util.ArrayList;
import java.util.Scanner;

import Products.Product;

public class ViewProductByCode {
    private static Scanner sc = new Scanner(System.in);
    
    public static void viewByCode(String code) throws Exception{
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list2 = rd.readProductsInfo();
        System.out.print("Input product code you want to view: ");
        code = sc.nextLine();
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).getProductCode().equalsIgnoreCase(code)){
                System.out.println(list2.get(i).outpuProductData());
            }
        }
    }
}
