package Admin.ProductManagement.ProductTypeManage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import Products.Product;

public class WriteProductType{
    public String path = "GunStore\\Data\\ProductTypeFile\\ProductTypeFile.txt";
    public File file;
    public FileWriter fw;
    public BufferedWriter bw;
    public boolean append;

    public WriteProductType(boolean append) throws Exception{
        try{
            this.file = new File(this.path);
            this.fw = new FileWriter(file,append);
            this.bw = new BufferedWriter(fw);
        }catch(Exception e){

        }
    }

    public void write(Product product) throws Exception{
        try{
            this.bw.write(product.outputDataType()+"\n");
        }catch(Exception ex){
            System.out.println("Ghi thất bại");
        }
    }
}
