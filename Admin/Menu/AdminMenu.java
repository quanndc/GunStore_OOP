package Admin.Menu;

import java.util.*;

import Admin.Billmanagement.Bill;
import Admin.ProductManagement.ProductManage.AddProduct;
import Admin.ProductManagement.ProductManage.RemoveProduct;
import Admin.ProductManagement.ProductManage.UpdateProduct;
import Admin.ProductManagement.ProductManage.ViewAllProduct;
import Admin.ProductManagement.ProductTypeManage.RemoveProductType;
import Admin.ProductManagement.ProductTypeManage.UpdateProductType;
import Admin.ProductManagement.ProductTypeManage.ViewAllProductType;
import Admin.ProductManagement.ProductTypeManage.WriteProductType;
import Products.Guns.Pistols.Pistol;
import Products.Guns.Rifle.*;
import Products.Guns.Shotgun.Shotgun;
import Products.Guns.Sniper.Sniper;
import Products.Guns.Submachine.SMG;
import Products.Product;
import Products.Amors.Amor;
import Products.Grenades.Grenade;

public class AdminMenu {
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // generate admin menu
    public static void generateAdminMenu() throws Exception {
        int choice = 0;
        do {
            System.out.println("=====ADMIN MANAGEMENT SYSTEM=====");
            System.out.println("1.Add new product type");
            System.out.println("2.Remove product type");
            System.out.println("3.Update product type");
            System.out.println("4.View product type");
            System.out.println("=============================================");
            System.out.println("5. Add new product");
            System.out.println("6. Remove product");
            System.out.println("7. Update product");
            System.out.println("8. View all products");
            System.out.println("9. View all daily bills");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // add new product type
                    System.out.println("=====ADD NEW PRODUCT TYPE SYSTEM=====");
                    Product product = new Product();
                    String productTypeCode = "";
                    System.out.println("Enter product type code: ");
                    productTypeCode = sc.nextLine();
                    product.setProductTypeCode(productTypeCode);
                    String productTypeName = "";
                    System.out.println("Enter product type name: ");
                    productTypeName = sc.nextLine();
                    product.setProductTypeName(productTypeName);
                    String productCode = "";
                    System.out.println("Enter product code: ");
                    productCode = sc.nextLine();
                    product.setProductCode(productCode);
                    WriteProductType wr = new WriteProductType(true);
                    wr.write(product);
                    wr.bw.close();
                    wr.fw.close();
                    break;
                case 2:
                    // remove product type
                    System.out.println("=====REMOVE PRODUCT TYPE SYSTEM=====");
                    int index = 0;
                    RemoveProductType.remove(index);
                    break;
                case 3:
                    // update product Type
                    System.out.println("=====UPDATE PRODUCT TYPE SYSTEM=====");
                    int index2 = 0;
                    String name = "";
                    UpdateProductType.update(index2, name);
                    break;
                case 4:
                    // view all product type
                    System.out.println("=====VIEW ALL PRODUCT TYPE SYSTEM=====");
                    ViewAllProductType.view();
                    break;
                case 5:
                    // add new product
                    int choice2 = 0;
                    System.out.println("=====ADD NEW PRODUCT SYSTEM=====");
                    do {
                        System.out.println("=====ADD NEW PRODUCT SYSTEM=====");
                        System.out.println("1. Add new rifle");
                        System.out.println("2. Add new pistol");
                        System.out.println("3. Add new shotgun");
                        System.out.println("4. Add new armor");
                        System.out.println("5. Add new grenade");
                        System.out.println("6. Add new sniper");
                        System.out.println("7. Add new submachine");
                        System.out.println("8.Back");
                        System.out.print("Enter your choice: ");
                        choice2 = Integer.parseInt(sc.nextLine());
                        switch (choice2) {
                            case 1:
                                // add new rifle
                                Product newRifle = new Rifle();
                                System.out.print("Enter rifle name: ");
                                newRifle.setProductName(sc.nextLine());
                                System.out.print("Enter rifle price: ");
                                newRifle.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter rifle remaining: ");
                                newRifle.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newRifle);
                                break;
                            case 2:
                                // add new pistol
                                Product newPistol = new Pistol();
                                System.out.print("Enter pistol name: ");
                                newPistol.setProductName(sc.nextLine());
                                System.out.print("Enter pistol price: ");
                                newPistol.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter pistol remaining: ");
                                newPistol.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newPistol);
                                break;
                            case 3:
                                // add new shotgun
                                Product newShotgun = new Shotgun();
                                System.out.print("Enter shotgun name: ");
                                newShotgun.setProductName(sc.nextLine());
                                System.out.print("Enter shotgun price: ");
                                newShotgun.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter shotgun remaining: ");
                                newShotgun.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newShotgun);
                                break;
                            case 4:
                                // add new amor
                                Product newAmor = new Amor();
                                System.out.print("Enter amor name: ");
                                newAmor.setProductName(sc.nextLine());
                                System.out.print("Enter amor price: ");
                                newAmor.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter amor remaining: ");
                                newAmor.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newAmor);
                                break;
                            case 5:
                                // add new grenade
                                Product newGrenade = new Grenade();
                                System.out.print("Enter grenade name: ");
                                newGrenade.setProductName(sc.nextLine());
                                System.out.print("Enter grenade price: ");
                                newGrenade.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter grenade remaining: ");
                                newGrenade.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newGrenade);
                                break;
                            case 6:
                                // add new sniper
                                Product newSniper = new Sniper();
                                System.out.print("Enter sniper name: ");
                                newSniper.setProductName(sc.nextLine());
                                System.out.print("Enter sniper price: ");
                                newSniper.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter sniper remaining: ");
                                newSniper.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newSniper);
                                break;
                            case 7:
                                // add new SMG
                                Product newSMG = new SMG();
                                System.out.print("Enter SMG name: ");
                                newSMG.setProductName(sc.nextLine());
                                System.out.print("Enter SMG price: ");
                                newSMG.setProductPrice(Float.parseFloat(sc.nextLine()));
                                System.out.print("Enter SMG remaining: ");
                                newSMG.setRemaining(Integer.parseInt(sc.nextLine()));
                                AddProduct.add(newSMG);
                                break;
                            case 8:
                                // exit
                                clearScreen();
                                break;
                            default:
                                System.out.println("Invalid choice");
                                clearScreen();
                                break;
                        }
                    } while (choice2 != 8);
                    break;
                case 6:
                    // remove product
                    int index1 = 0;
                    RemoveProduct.remove(index1);
                    clearScreen();
                    break;
                case 7:
                    // grenerate update menu
                    int updateChoice = 0;
                    do {
                        System.out.println("=====UPDATE PRODUCT SYSTEM=====");
                        System.out.println("1. Update product name");
                        System.out.println("2. Update product price");
                        System.out.println("3. Update product remaining");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");
                        updateChoice = sc.nextInt();
                        switch (updateChoice) {
                            case 1:
                                // update product name
                                int index3 = 0;
                                String newName = "";
                                UpdateProduct.updateName(newName, index3);
                                break;
                            case 2:
                                // update product price
                                int index4 = 0;
                                float price = 0;
                                UpdateProduct.updatePrice(price, index4);
                                clearScreen();
                                break;
                            case 3:
                                // update product remaining
                                int index5 = 0;
                                int remaining = 0;
                                UpdateProduct.updateRemaining(remaining, index5);
                                clearScreen();
                                break;
                            case 4:
                                // exit
                                clearScreen();
                                break;
                            default:
                                System.out.println("Invalid choice");
                                clearScreen();
                                break;
                        }
                    } while (updateChoice != 4);
                    break;
                case 8:
                    // view all products
                    ViewAllProduct.view();
                    break;
                case 9:
                    // print daily bills
                    Bill.printDailyBill();
                    break;
                case 10:
                    // exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 9);
    }
}
