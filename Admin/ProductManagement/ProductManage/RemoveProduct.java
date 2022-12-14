package Admin.ProductManagement.ProductManage;

import java.util.*;

import Products.Product;

public class RemoveProduct {
    private static Scanner sc = new Scanner(System.in);

    public static void remove(int index) throws Exception {
        ViewAllProduct.view();
        System.out.print("Enter index of product you want to remove: ");
        index = sc.nextInt();
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list = rd.readProductsInfo("GunStore\\Data\\ProductFile\\ProductFile.txt");
        list.remove(index - 1);
        WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list.size(); i++) {
            wr.write(list.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }
}
