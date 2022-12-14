package Admin.ProductManagement.ProductManage;

import java.util.ArrayList;
import java.util.Scanner;

import Products.Product;

public class UpdateProduct {
    private static Scanner sc = new Scanner(System.in);
    public static void updateName(String name, int index) throws Exception{
        ViewAllProduct.view();
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list = rd.readProductsInfo();
        System.out.print("Enter index of product you want to update: ");
        index = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new name of product: ");
        name = sc.nextLine();
        boolean update = true;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getProductName().equalsIgnoreCase(name)){
                System.out.println("Product name is already exist!");
                update = false;
                break;
            }
        }
        if(update == true){
            list.get(index - 1).setProductName(name);
        }
        WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list.size(); i++) {
            wr.write(list.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }

    public static void updatePrice(float price, int index) throws Exception{
        ViewAllProduct.view();
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list = rd.readProductsInfo();
        System.out.print("Enter index of product you want to update: ");
        index = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new price of product: ");
        price = Float.parseFloat(sc.nextLine());
        list.get(index - 1).setProductPrice(price);
        WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list.size(); i++) {
            wr.write(list.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }

    public static void updateRemaining(int remaining, int index) throws Exception{
        ViewAllProduct.view();
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list = rd.readProductsInfo();
        System.out.print("Enter index of product you want to update: ");
        index = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new remaining of product: ");
        remaining = Integer.parseInt(sc.nextLine());
        list.get(index - 1).setRemaining(remaining);
        WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list.size(); i++) {
            wr.write(list.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }
}
