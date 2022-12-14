package Admin.ProductManagement.ProductManage;

import Products.Product;
import java.util.*;

public class AddProduct {
    public static void add(Product product) throws Exception {
        ReadProductInfo rd = new ReadProductInfo();
        ArrayList<Product> list = rd.readProductsInfo();
        boolean added = true;
        for(int i=0;i<list.size();i++){
            if((list.get(i).getProductCode().equalsIgnoreCase(product.getProductCode()) == true) && (list.get(i).getProductName().equalsIgnoreCase(product.getProductName())) == true){
                System.out.println("Product is already exist!");
                System.out.println("Added " + product.getRemaining() + " to the old remaining");
                list.get(i).setRemaining(list.get(i).getRemaining() + product.getRemaining());
                added = false;
                break;
            }
        }
        if(added == true){
            list.add(product);
        }

        WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list.size(); i++) {
            wr.write(list.get(i));
        }
        wr.bw.close();
        wr.fw.close();
    }

    
}
