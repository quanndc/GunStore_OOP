import Products.Product;
import Products.Amors.Amor;
import Products.Amors.TALOS;
import Products.Grenades.F1;
import Products.Guns.Submachine.SMG;
import Products.Guns.Submachine.Uzi;
import User.Menu.Usermenu;


public class Program {
    public static void main(String[] args) throws Exception{

        //AdminMenu.generateAdminMenu();
        //Usermenu.generateUserMenu();

        Product gun = new Amor("DORAN", 100000, 5);
        System.out.println(Amor.getProductTypeCode());
        System.out.println(Amor.getProductTypeName());
        System.out.println(gun.getProductCode());
        System.out.println(gun.getProductName());
        
        // System.out.println(gun.get());


        // list.add(new Thompson());
        // list.add(new SpectreM4());
        // list.add(new Uzi());
        // list.add(new L115A3AWM());
        // list.add(new Barret50Cal());
        // list.add(new Cheytac408Cal());
        // list.add(new BrowningCitori());
        // list.add(new ArmselStriker());
        // list.add(new M16A1());
        // list.add(new AK47());
        // list.add(new Glock17());
        // list.add(new Astra600());
        // list.add(new Anaconda());
        // list.add(new M67());
        // list.add(new F1());
        // list.add(new TALOS());
        // list.add(new PASGT());
        // list.add(new DragonSilk());
        // //System.out.format("%-20s%-20s%-20s%-20s%-20s\n","Product Type", "Product Code", "Product Name", "Product Price", "Remaining");
        // //System.out.println("-----------------------------------------------------------------------------------------");
        // // WriteProductInfo wr = new WriteProductInfo(false);
        // // for(int i=0;i<list.size();i++){
        // //     wr.write(list.get(i));
        // // }
        // // wr.bw.close();
        // // wr.fw.close();

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
