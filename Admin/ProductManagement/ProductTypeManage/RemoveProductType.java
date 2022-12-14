package Admin.ProductManagement.ProductTypeManage;

import java.util.ArrayList;
import java.util.Scanner;

import Products.Product;

public class RemoveProductType {
    private static Scanner sc = new Scanner(System.in);
    public static void remove(int index) throws Exception{
        ReadProductType rd = new ReadProductType();
        ArrayList<Product> list2 = rd.readProductsInfo();
        for(int i = 0; i < list2.size(); i++){
            System.out.println((i+1)+"."+list2.get(i).outputDataType());
        }
        System.out.println("Input index of product type you want to remove: ");
        index = Integer.parseInt(sc.nextLine());
        list2.remove(index - 1);
        WriteProductType wr = new WriteProductType(false);
        for (int i = 0; i < list2.size(); i++) {
            wr.write(list2.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }
}
