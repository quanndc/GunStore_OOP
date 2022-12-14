package User.Menu;

import java.util.ArrayList;
import java.util.Scanner;

import Admin.ProductManagement.ProductManage.ReadProductInfo;
import Admin.ProductManagement.ProductManage.ViewAllProduct;
import Admin.ProductManagement.ProductManage.ViewProductByCode;
import Admin.ProductManagement.ProductManage.ViewProductByPrice;
import Admin.ProductManagement.ProductManage.WriteProductInfo;
import Products.Product;
import User.CartManagement.Cart;

public class Usermenu {
    private static Scanner sc = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void generateUserMenu() throws Exception {
        ArrayList<Product> list = new ArrayList<Product>();
        ReadProductInfo rd = new ReadProductInfo();
        list = rd.readProductsInfo();

        int choice = 0;
        do {
            System.out.println("Welcome to the Gun Store");
            System.out.println("1. View Products");
            System.out.println("2. Buy Products");
            System.out.println("3. View Cart");
            System.out.println("4. Remove Product From Cart");
            System.out.println("5. Purchase");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    do {
                        System.out.println("====VIEW PRODUCTS====");
                        System.out.println("1. View All Products");
                        System.out.println("2. View Product By Type");
                        System.out.println("3. View Product By Code");
                        System.out.println("4. View Product By Name");
                        System.out.println("5. View Product By Price");
                        System.out.println("6. View Product By Remaining");
                        System.out.println("7. Back");
                        System.out.print("Enter your choice: ");
                        choice1 = Integer.parseInt(sc.nextLine());
                        switch (choice1) {
                            case 1:
                                ViewAllProduct.view();
                                break;
                            case 2:
                                int choice2 = 0;
                                do {
                                    System.out.println("====VIEW PRODUCT BY TYPE====");
                                    System.out.println("1.Gun");
                                    System.out.println("2.Armor");
                                    System.out.println("3.Grenade");
                                    System.out.println("4.Back");
                                    System.out.print("Enter your choice: ");
                                    choice2 = Integer.parseInt(sc.nextLine());
                                    switch (choice2) {
                                        case 1:
                                            GunMenu.generateGunMenu();
                                            break;
                                        case 2:
                                            ArmorMenu.generateArmorMenu();
                                            break;
                                        case 3:
                                            GrenadeMenu.generateGrenadeMenu();
                                            break;
                                        default:
                                            System.out.println("Invalid Choice");
                                            break;
                                    }
                                } while (choice2 != 4);
                                break;
                            case 3:
                                String code = "";
                                ViewProductByCode.viewByCode(code);
                                break;
                            case 4:
                                String name = "";
                                System.out.println("Enter product name: ");
                                name = sc.nextLine();
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(i).getProductName().equals(name)) {
                                        System.out.println(list.get(i).outpuProductData());
                                    }
                                }
                                break;
                            case 5:
                                float price = 0;
                                ViewProductByPrice.viewByPrice(price);
                                break;
                            case 6:
                                int remaining = 0;
                                System.out.println("Enter remaining: ");
                                remaining = Integer.parseInt(sc.nextLine());
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(i).getRemaining() <= remaining) {
                                        System.out.println(list.get(i).outpuProductData());
                                    }
                                }
                                break;
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    } while (choice1 != 7);
                    break;
                case 2:
                    System.out.println("====BUY PRODUCTS====");
                    WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\User\\CartManagement\\CartFile\\Cart.txt");
                    ViewAllProduct.view();

                    int index = 0;
                    int quantity = 0;
                    System.out.println("Enter product index you want to buy: ");
                    index = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter quantity: ");
                    quantity = Integer.parseInt(sc.nextLine());
                    Cart.addProductToCart(list, index, quantity);
                    for (int i = 0; i < Cart.cart.size(); i++) {
                        wr.write(Cart.cart.get(i));
                    }
                    wr.bw.close();
                    wr.fw.close();
                    break;
                case 3:
                    Cart.viewCart();
                    break;
                case 4:
                    int index1 = 0;
                    System.out.println("====REMOVE PRODUCT====");
                    Cart.removeProductFromCart(index1);
                    break;
                case 5:
                    System.out.println("====PURCHASE====");
                    if (Cart.cart.size() == 0) {
                        System.out.println("YOUR CART IS EMPTY!!!");
                        break;
                    } else {
                        for (int i = 0; i < Cart.cart.size(); i++) {
                            System.out.println((i + 1) + ". " + Cart.cart.get(i).outpuProductData());
                        }
                    }
                    System.out.println("1. Purchase all products in your cart");
                    System.out.println("2. Purchase a product in your cart");
                    int choice3 = 0;
                    System.out.print("Enter your choice: ");
                    choice3 = Integer.parseInt(sc.nextLine());
                    switch (choice3) {
                        case 1:
                            float total = Cart.purchaseAllProduct(list);
                            System.out.println("Total: " + total);
                            break;
                        case 2:
                            ArrayList<Product> subCart = new ArrayList<>();
                            for (int i = 0; i < Cart.cart.size(); i++) {
                                System.out.println((i + 1) + ". " + Cart.cart.get(i).outpuProductData());
                            }
                            int index3 = 0;
                            System.out.println("Enter product index you want to purchase: ");
                            index3 = Integer.parseInt(sc.nextLine());
                            subCart.add(Cart.cart.get(index3-1));
                            Cart.cart.remove(index3-1);
                            float subTotal = Cart.purchaseOneProduct(subCart,list);
                            System.out.println("Total: " + subTotal);
                            break;
                        case 3:
                            System.out.println("Exit...");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("====EXIT====");
                    System.out.println("Thank you for using our service");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 6);
    }
}
