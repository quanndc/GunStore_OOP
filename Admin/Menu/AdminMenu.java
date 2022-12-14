package Admin.Menu;

import java.util.*;

import Admin.ProductManagement.ProductManage.AddProduct;
import Admin.ProductManagement.ProductManage.RemoveProduct;
import Admin.ProductManagement.ProductManage.UpdateProduct;
import Admin.ProductManagement.ProductManage.ViewAllProduct;
import Admin.ProductManagement.ProductManage.ViewProductByCode;
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
            System.out.println("1. Add new product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product");
            System.out.println("4. View product");
            System.out.println("5. View all products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // add new product
                    int choice2 = 0;
                    do {
                        System.out.println("=====ADD NEW PRODUCT SYSTEM=====");
                        System.out.println("1. Add new rifle");
                        System.out.println("2. Add new pistol");
                        System.out.println("3. Add new shotgun");
                        System.out.println("4. Add new amor");
                        System.out.println("5. Add new grenade");
                        System.out.println("6. Add new sniper");
                        System.out.println("7. Add new submachine");
                        System.out.println("8.Exit");
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
                case 2:
                    // remove product
                    int index = 0;
                    RemoveProduct.remove(index);
                    clearScreen();
                    break;
                case 3:
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
                                int index2 = 0;
                                String newName = "";
                                UpdateProduct.updateName(newName, index2);
                                break;
                            case 2:
                                // update product price
                                int index3 = 0;
                                float price = 0;
                                UpdateProduct.updatePrice(price, index3);
                                clearScreen();
                                break;
                            case 3:
                                // update product remaining
                                int index4 = 0;
                                int remaining = 0;
                                UpdateProduct.updateRemaining(remaining, index4);
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
                case 4:
                    // view product by code
                    String code = "";
                    ViewProductByCode.viewByCode(code);
                    break;
                case 5:
                    // view all products
                    ViewAllProduct.view();
                    break;
                case 6:
                    // exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}
