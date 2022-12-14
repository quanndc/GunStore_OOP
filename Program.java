import java.util.Scanner;

import Admin.Menu.AdminMenu;
import User.Menu.Usermenu;

public class Program {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int choice = 0;
        do{
            System.out.println("Welcome to Gun Store");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine()); 
            switch (choice) {
                case 1:
                    AdminMenu.generateAdminMenu();
                    break;
                case 2:
                    Usermenu.generateUserMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice != 3);

        // Usermenu.generateUserMenu();
        //Bill.printDailyBill();
        // Product gun = new Amor("DORAN", 100000, 5);
        // System.out.println(Amor.getProductTypeCode());
        // System.out.println(Amor.getProductTypeName());
        // System.out.println(gun.getProductCode());
        // System.out.println(gun.getProductName());
        
        // System.out.println(gun.get());

        // ArrayList<Product> list = new ArrayList<>();
        // list.add(new Thompson());
        // System.out.println(list.get(0).outpuProductData());
        // list.add(new SpectreM4());
        // System.out.println(list.get(1).outpuProductData());
        // list.add(new Uzi());
        // System.out.println(list.get(2).outpuProductData());
        // list.add(new L115A3AWM());
        // System.out.println(list.get(3).outpuProductData());
        // list.add(new Barret50Cal());
        // System.out.println(list.get(4).outpuProductData());
        // list.add(new Cheytac408Cal());
        // System.out.println(list.get(5).outpuProductData());
        // list.add(new BrowningCitori());
        // System.out.println(list.get(6).outpuProductData());
        // list.add(new ArmselStriker());
        // System.out.println(list.get(7).outpuProductData());
        // list.add(new M16A1());
        // System.out.println(list.get(8).outpuProductData());
        // list.add(new AK47());
        // System.out.println(list.get(9).outpuProductData());
        // list.add(new Glock17());
        // System.out.println(list.get(10).outpuProductData());
        // list.add(new Astra600());
        // System.out.println(list.get(11).outpuProductData());
        // list.add(new Anaconda());
        // System.out.println(list.get(12).outpuProductData());
        // list.add(new M67());
        // System.out.println(list.get(13).outpuProductData());
        // list.add(new F1());
        // System.out.println(list.get(14).outpuProductData());
        // list.add(new TALOS());
        // System.out.println(list.get(15).outpuProductData());
        // list.add(new PASGT());
        // System.out.println(list.get(16).outpuProductData());
        // list.add(new DragonSilk());
        // System.out.println(list.get(17).outpuProductData());
        // System.out.println("========================================================");
        // // //System.out.format("%-20s%-20s%-20s%-20s%-20s\n","Product Type", "Product Code", "Product Name", "Product Price", "Remaining");
        // // //System.out.println("-----------------------------------------------------------------------------------------");
        // WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\Data\\ProductFile\\ProductFile.txt");
        // for(int i=0;i<list.size();i++){
        //     wr.write(list.get(i));
        //     //System.out.println(list.get(i).outpuProductData());
        // }
        // wr.bw.close();
        // wr.fw.close();

        // ReadProductInfo rd = new ReadProductInfo();
        // ArrayList<Product> list2 = rd.readProductsInfo();
        // for(int i=0;i<list2.size();i++){
        //     System.out.println(list2.get(i).outpuProductData());
        // }

        // Product prd = new Rifle("M4A1", 100000, 10);
        // list2.add(prd);

        // WriteProductInfo wr = new WriteProductInfo(false);
        // for(int i=0;i<list2.size();i++){
        //     wr.write(list2.get(i));
        // }
        // wr.bw.close();
        // wr.fw.close();

    }
}
