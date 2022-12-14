// package User.Menu;

// import java.util.ArrayList;
// import java.util.Scanner;

// import Admin.ProductManagement.ProductManage.ReadProductInfo;
// import Admin.ProductManagement.ProductManage.ViewGrenadeByPrice;
// import Products.Product;

// public class GrenadeMenu {
//     private static Scanner sc = new Scanner(System.in);
//     public static void generateGrenadeMenu() throws Exception{
//         ArrayList<Product> list = new ArrayList<Product>();
//         ReadProductInfo rd = new ReadProductInfo();
//         list = rd.readProductsInfo();
//         int choice = 0;
//         do {
//             System.out.println("====Armor====");
//             System.out.println("1.View All Grenades");
//             System.out.println("2.View Grenade By Name");
//             System.out.println("3.View Grenade By Price");
//             System.out.println("4.View Grenade By Remaining");
//             System.out.println("5.Back");
//             System.out.print("Enter your choice: ");
//             choice = Integer.parseInt(sc.nextLine());
//             switch (choice) {
//                 case 1:
//                     for (int i = 0; i < list.size(); i++) {
//                         if (list.get(i).getProductTypeName()
//                                 .compareTo("Grenade") == 0) {
//                             System.out.println(list.get(i).outpuProductData());
//                         }
//                     }
//                     break;
//                 case 2:
//                     String name = "";
//                     System.out.println("Enter the name of the grenade: ");
//                     name = sc.nextLine();
//                     for (int i = 0; i < list.size(); i++) {
//                         if (list.get(i).getProductTypeName().equals("Grenade")) {
//                             if (list.get(i).getProductName().equals(name)) {
//                                 System.out.println(list.get(i).outpuProductData());
//                             }
//                         }
//                     }
//                     break;
//                 case 3:
//                     float price = 0;
//                     ViewGrenadeByPrice.viewByPrice(price);
//                     break;
//                 case 4:
//                     int remaining = 0;
//                     System.out.println("Enter remaining: ");
//                     remaining = Integer.parseInt(sc.nextLine());
//                     for (int i = 0; i < list.size(); i++) {
//                         if (list.get(i).getProductTypeName().equals("Grenade")) {
//                             if (list.get(i).getRemaining() <= remaining) {
//                                 System.out.println(list.get(i).outpuProductData());
//                             }
//                         }
//                     }
//                     break;
//                 case 5:
//                     System.out.println("Exit...");
//                     break;
//                 default:
//                     System.out.println("Invalid Choice");
//                     break;
//             }
//         } while (choice != 5);
//     }
// }
