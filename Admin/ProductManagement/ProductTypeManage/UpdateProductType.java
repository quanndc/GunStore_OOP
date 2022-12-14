package Admin.ProductManagement.ProductTypeManage;

import java.util.ArrayList;
import java.util.Scanner;

import Products.Product;

public class UpdateProductType {
    private static Scanner sc = new Scanner(System.in);
    public static void update(int index, String name) throws Exception{
        ReadProductType rd = new ReadProductType();
        ArrayList<Product> list2 = rd.readProductsInfo();
        for(int i = 0; i < list2.size(); i++){
            System.out.println((i+1)+"."+list2.get(i).outputDataType());
        }
        System.out.println("Input index of product type you want to update: ");
        index = Integer.parseInt(sc.nextLine());
        System.out.println("Input new name of product type: ");
        name = sc.nextLine();
        list2.get(index - 1).setProductTypeName(name);
        WriteProductType wr = new WriteProductType(false);
        for (int i = 0; i < list2.size(); i++) {
            wr.write(list2.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }
}
