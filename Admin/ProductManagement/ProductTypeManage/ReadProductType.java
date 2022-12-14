package Admin.ProductManagement.ProductTypeManage;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import Products.Product;

public class ReadProductType{
    
    public ReadProductType(){};

    private ArrayList<Product> productTypeList = new ArrayList<>();

    public ArrayList<Product> readProductsInfo() throws Exception{
        try{
            File file = new File("GunStore\\Data\\ProductTypeFile\\ProductTypeFile.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                String arr[] = line.split("\t\t");
                Product prd = new Product();
                prd.setProductTypeCode(arr[0]);
                prd.setProductTypeName(arr[1]);
                prd.setProductCode(arr[2]);
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
