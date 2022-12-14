// package User.Menu;

// import java.util.ArrayList;
// import java.util.Scanner;

// import Admin.ProductManagement.ProductManage.ReadProductInfo;
// import Admin.ProductManagement.ProductManage.ViewGunByCode;
// import Admin.ProductManagement.ProductManage.ViewGunByPrice;
// import Products.Product;

// public class GunMenu {
//     private static Scanner sc = new Scanner(System.in);

//     public static void generateGunMenu() throws Exception {
//         ArrayList<Product> list = new ArrayList<Product>();
//         ReadProductInfo rd = new ReadProductInfo();
//         list = rd.readProductsInfo();
//         int choice = 0;
//         do {
//             System.out.println("====GUN====");
//             System.out.println("1.View All Guns");
//             System.out.println("2.View Gun By Code");
//             System.out.println("3.View Gun By Name");
//             System.out.println("4.View Gun By Price");
//             System.out.println("5.View Gun By Remaining");
//             System.out.println("6.Back");
//             System.out.print("Enter your choice: ");
//             choice = Integer.parseInt(sc.nextLine());
//             switch (choice) {
//                 case 1:
//                     for (int i = 0; i < list.size(); i++) {
//                         if (list.get(i).getProductTypeName()
//                                 .compareTo("Gun") == 0) {
//                             System.out.println(list.get(i).outpuProductData());
//                         }
//                     }
//                     break;
//                 case 2:
//                     int choice1 = 0;
//                     do {
//                         System.out.println("====VIEW GUN BY CODE====");
//                         System.out.println("1.SMG");
//                         System.out.println("2.RIFLE");
//                         System.out.println("3.SNIPER");
//                         System.out.println("4.PISTOL");
//                         System.out.println("5.SHOTGUN");
//                         System.out.println("6.Back");
//                         System.out.print("Enter your choice: ");
//                         choice1 = Integer.parseInt(sc.nextLine());
//                         switch (choice1) {
//                             case 1:
//                                 ViewGunByCode.viewByCode("SMG");
//                                 break;
//                             case 2:
//                                 ViewGunByCode.viewByCode("RIFLE");
//                                 break;
//                             case 3:
//                                 ViewGunByCode.viewByCode("SNIPER");
//                                 break;
//                             case 4:
//                                 ViewGunByCode.viewByCode("PISTOL");
//                                 break;
//                             case 5:
//                                 ViewGunByCode.viewByCode("SHOTGUN");
//                                 break;
//                             case 6:
//                                 System.out.println("Exit...");
//                                 break;
//                             default:
//                                 System.out.println("Invalid Choice");
//                                 break;
//                         }
//                     } while (choice1 != 6);
//                     break;
//                 case 3:
//                     String name = "";
//                     System.out.println("Enter the name of the gun: ");
//                     name = sc.nextLine();
//                     for (int i = 0; i < list.size(); i++) {
//                         if (list.get(i).getProductTypeName().equals("Gun")) {
//                             if (list.get(i).getProductName().equals(name)) {
//                                 System.out.println(list.get(i).outpuProductData());
//                             }
//                         }
//                     }
//                     break;
//                 case 4:
//                     float price = 0;
//                     ViewGunByPrice.viewByPrice(price);
//                     break;
//                 case 5:
//                     int remaining = 0;
//                     System.out.println("Enter remaining: ");
//                     remaining = Integer.parseInt(sc.nextLine());
//                     for (int i = 0; i < list.size(); i++) {
//                         if (list.get(i).getProductTypeName().equals("Gun")) {
//                             if (list.get(i).getRemaining() <= remaining) {
//                                 System.out.println(list.get(i).outpuProductData());
//                             }
//                         }
//                     }
//                     break;
//                 case 6:
//                     System.out.println("Exit...");
//                     break;
//                 default:
//                     System.out.println("Invalid Choice");
//                     break;
//             }
//         } while (choice != 6);
//     }
// }
