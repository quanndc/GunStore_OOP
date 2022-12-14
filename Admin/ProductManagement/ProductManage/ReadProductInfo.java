package Admin.ProductManagement.ProductManage;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Products.Product;

public class ReadProductInfo {
    public ReadProductInfo(){};

    private ArrayList<Product> productTypeList = new ArrayList<>();

    public ArrayList<Product> readProductsInfo() throws Exception{
        try{
            File file = new File("GunStore\\Data\\ProductFile\\ProductFile.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                String arr[] = line.split("\\s+");
                Product prd = new Product();
                prd.setProductTypeName(arr[0]);
                prd.setProductCode(arr[1]);
                prd.setProductName(arr[2]);
                prd.setProductPrice(Float.parseFloat(arr[3]));
                prd.setRemaining(Integer.parseInt(arr[4]));
                this.productTypeList.add(prd);
            }
            br.close();
            fr.close();
        }
        catch(EOFException e){

        }
        catch(Exception e){
            System.out.println("Failed: " + e.getMessage());
        }
        return this.productTypeList;
    }
}
