package Admin.ProductManagement.ProductManage;

import java.util.ArrayList;
import java.util.Scanner;

import Products.Product;

public class ViewGunByPrice{
    private static Scanner sc = new Scanner(System.in);
    public static void viewByPrice(float price) throws Exception{
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list2 = rd.readProductsInfo("GunStore\\Data\\ProductFile\\ProductFile.txt");
        System.out.print("Input gun price you want to view: ");
        price = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i).getProductPrice() <= price && list2.get(i).getProductTypeName().equalsIgnoreCase("Gun")){
                System.out.println(list2.get(i).outpuProductData());
            }
        }
    }
}
        