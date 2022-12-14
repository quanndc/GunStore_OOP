package Admin.ProductManagement.ProductManage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import Products.Product;

public class WriteProductInfo {
    public String path;
    public File file;
    public FileWriter fw;
    public BufferedWriter bw;
    public boolean append;

    public WriteProductInfo(boolean append, String path) throws Exception{
        try{
            this.file = new File(path);
            this.fw = new FileWriter(file,append);
            this.bw = new BufferedWriter(fw);
        }catch(Exception e){

        }
    }

    public void write(Product product) throws Exception{
        try{
            this.bw.write(product.outpuProductData()+"\n");
        }catch(Exception ex){
            System.out.println("Ghi thất bại");
        }
    }
}
