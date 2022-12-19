package Admin.Billmanagement;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import Admin.ProductManagement.ProductManage.ReadProductInfo;
import Admin.ProductManagement.ProductManage.WriteProductInfo;
import Products.Product;

public class Bill {

    public static ArrayList<Product> bill = new ArrayList<Product>();


    public static void printOneBill(ArrayList<Product> list,long billCode, LocalDate createdAt) throws Exception{
        float total = 0;
        if (list.size() == 0) {
            System.out.println("NOTHING TO PRINT!!!");
            return;
        }
        System.out.println("====BILL====");
        System.out.println("[Created at: " + createdAt + "]" + "  " + "[Bill code: " + billCode + "]");
        for (int i = 0; i < list.size(); i++) {
            total += (list.get(i).getRemaining() * list.get(i).getProductPrice());
            System.out.println((i+1)+". "+list.get(i).outpuProductData());
        }
        System.out.println("Total: " + total);
        System.out.println("==========END BILL==========");
    }

    public static void exportBill(ArrayList<Product> list,long billCode, LocalDate createdAt, float total) throws Exception {
        if (list.size() == 0) {
            System.out.println("NOTHING TO EXPORT!!!");
            return;
        }
        WriteProductInfo wr = new WriteProductInfo(true, "GunStore\\Data\\BillFile\\BillFile.txt");
        wr.bw.write("[Created at: " + createdAt + "]" + "  " + "[Bill code: " + billCode + "]"+"\n");
        for(int i = 0; i < list.size(); i++) {
            wr.bw.write((i+1)+". "+list.get(i).outpuProductData()+"\n");
        }
        wr.bw.write("Total: " + total + "\n");
        wr.bw.write("====================END BILL====================\n\n");
        wr.bw.close();
        wr.fw.close();
        System.out.println("Export bill successfully!");
    }

    public static void printDailyBill() throws Exception{
        //ArrayList<Product> dailyBill = new ArrayList<Product>();
        float total = 0;
        try{
            File file = new File("GunStore\\Data\\BillFile\\BillFile.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            boolean check = false;
            String line = null;
            while((line = br.readLine()) != null){
                if(line.contains("Created at: " + LocalDate.now())){
                    check = true;
                    System.out.println(line);
                    while((line = br.readLine()) != null){
                        if(line.contains("Total: ")){
                            System.out.println(line);
                            break;
                        }
                        System.out.println(line);
                    }
                    return;
                }else{
                    check = false;
                }
            }
            if(check == false){
                System.out.println("NOTHING TO PRINT!!!");
            }
            br.close();
            fr.close();
        }
        catch(EOFException e){

        }
        catch(Exception e){
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
