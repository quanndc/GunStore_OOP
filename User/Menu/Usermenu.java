package User.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Admin.Billmanagement.Bill;
import Admin.ProductManagement.ProductManage.ReadProductInfo;
import Admin.ProductManagement.ProductManage.ViewAllProduct;
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
        ArrayList<Product> bill = new ArrayList<Product>();

        ReadProductInfo rd = new ReadProductInfo();
        list = rd.readProductsInfo("GunStore\\Data\\ProductFile\\ProductFile.txt");

        int choice = 0;
        do {
            System.out.println("Welcome to the Gun Store");
            System.out.println("1. Buy Products");
            System.out.println("2. Manage Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("====BUY PRODUCTS====");
                    WriteProductInfo wr = new WriteProductInfo(false,"GunStore\\User\\CartManagement\\CartFile\\Cart.txt");
                    ViewAllProduct.view();
                    int index = 0;
                    int quantity = 0;
                    System.out.print("Enter product index you want to buy: ");
                    index = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter quantity: ");
                    quantity = Integer.parseInt(sc.nextLine());
                    Cart.addProductToCart(list, index, quantity);
                    for (int i = 0; i < Cart.cart.size(); i++) {
                        wr.write(Cart.cart.get(i));
                    }
                    wr.bw.close();
                    wr.fw.close();
                    break;
                case 2:
                    int choice2 = 0;
                    do{
                        System.out.println("====MANAGE CART====");
                        System.out.println("1. View Cart");
                        System.out.println("2. Decrease quantity of product in cart");
                        System.out.println("3. Remove Product");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice: ");
                        choice2 = Integer.parseInt(sc.nextLine());
                        switch(choice2){
                            case 1:
                                Cart.viewCart();
                                break;
                            case 2:
                                int index1 = 0;
                                int quantity1 = 0;
                                Cart.decreaseNumberOfProduct(index1, quantity1);
                                break;
                            case 3:
                                int index2 = 0;
                                Cart.removeProductFromCart(index2);
                                break;
                            case 4: 
                                System.out.println("Exit...");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while(choice2!=4);
                    break;
                case 3:
                    System.out.println("====CHECKOUT====");
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
                    System.out.println("3. Exit");
                    int choice3 = 0;
                    System.out.print("Enter your choice: ");
                    choice3 = Integer.parseInt(sc.nextLine());
                    switch (choice3) {
                        case 1:
                            for(int i=0;i<Cart.cart.size();i++){
                                bill.add(Cart.cart.get(i));
                            }
                            float total = Cart.purchaseAllProduct(list);
                            long billCode = new Date().getTime();
                            LocalDate createdAt = LocalDate.now();
                            Bill.printOneBill(bill, billCode, createdAt);
                            Bill.exportBill(bill, billCode, createdAt, total);
                            bill.clear();
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
                            bill.add(Cart.cart.get(index3-1));
                            Cart.cart.remove(index3-1);
                            float total2 = Cart.purchaseOneProduct(subCart,list);
                            long billCode1 = new Date().getTime();
                            LocalDate createdAt1 = LocalDate.now();
                            Bill.printOneBill(bill, billCode1, createdAt1);
                            Bill.exportBill(bill, billCode1, createdAt1,total2);
                            bill.clear();
                            break;
                        case 3:
                            System.out.println("Exit...");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Exit...");
                    System.out.println("Thank you for using our service!!!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 4);
    }
}
