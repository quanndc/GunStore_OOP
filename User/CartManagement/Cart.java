package User.CartManagement;


import java.util.ArrayList;
import java.util.Scanner;

import Admin.ProductManagement.ProductManage.WriteProductInfo;
import Products.Product;

public class Cart {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> cart = new ArrayList<Product>();

    public static void viewCart() {
        if (cart.size() == 0) {
            System.out.println("YOUR CART IS EMPTY!!!");
            return;
        }
        System.out.println("====YOUR CART====");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i+1)+". "+cart.get(i).outpuProductData());
        }
    }

    public static void addProductToCart(ArrayList<Product> list, int index, int quantity) {
        Product prd = new Product();
        prd.setProductTypeName(list.get(index - 1).getProductTypeName());
        prd.setProductCode(list.get(index - 1).getProductCode());
        prd.setProductName(list.get(index - 1).getProductName());
        prd.setProductPrice(list.get(index - 1).getProductPrice());
        if (quantity > list.get(index - 1).getRemaining()) {
            System.out.println("Not enough product in stock!");
            return;
        } else if (quantity < 0) {
            System.out.println("Invalid quantity!");
            return;
        } else if (index - 1 < 0 || index - 1 > list.size()) {
            System.out.println("Invalid index!");
            return;
        } else if (list.get(index - 1).getRemaining() == 0) {
            System.out.println("Product is out of stock!");
            return;
        } else {
            if (cart.size() == 0) {
                prd.setRemaining(quantity);
                cart.add(prd);
                System.out.println("Add product to cart successfully!");
                return;
            } else {
                for (int i = 0; i < cart.size(); i++) {
                    if (cart.get(i).getProductName().equalsIgnoreCase(prd.getProductName())) {
                        System.out.println("Product is already in cart!");
                        cart.get(i).setRemaining(cart.get(i).getRemaining() + quantity);
                        return;
                    } else {
                        prd.setRemaining(quantity);
                        cart.add(prd);
                        System.out.println("Add product to cart successfully!");
                        return;
                    }
                }
            }

        }
    }

    public static void removeProductFromCart(int index) {
        for (int i = 0; i < Cart.cart.size(); i++) {
            System.out.println((i + 1) + ". " + Cart.cart.get(i).outpuProductData());
        }
        System.out.println("Enter product index you want to remove: ");
        index = Integer.parseInt(sc.nextLine());
        if (Cart.cart.size() == 0) {
            System.out.println("NOTHING TO REMOVE!!!");
            return;
        } else if (index - 1 < 0 || index - 1 > cart.size()) {
            System.out.println("Invalid index!");
            return;
        }
       
        
        cart.remove(index - 1);
        System.out.println("Remove product from cart successfully!");
    }


    public static void decreaseNumberOfProduct(int index, int quantity){
        if (Cart.cart.size() == 0) {
            System.out.println("YOUR CART IS EMPTY!!!");
            return;
        }
        System.out.println("Enter product index you want to remove: ");
        index = Integer.parseInt(sc.nextLine());
        if (index - 1 < 0 || index - 1 > cart.size()) {
            System.out.println("Invalid index!");
            return;
        }
        System.out.println("Enter quantity you want to remove: ");
        quantity = Integer.parseInt(sc.nextLine());
        if (quantity > cart.get(index - 1).getRemaining()) {
            System.out.println("Invalid quantity!");
            return;
        } 
        else if (quantity <= 0) {
            System.out.println("Invalid quantity!");
            System.out.println("Nothing changed!");
            return;
        }
        else if(quantity == cart.get(index - 1).getRemaining()){
            cart.remove(index - 1);
            System.out.println("Deleted product successfully!");
            return;
        }
        else {
            cart.get(index - 1).setRemaining(cart.get(index - 1).getRemaining() - quantity);
            System.out.println("Decrease number of product successfully!");
            return;
        }        
    }

    public static float purchaseOneProduct(ArrayList<Product> list, ArrayList<Product> list2) throws Exception {
        float total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += (list.get(i).getRemaining() * list.get(i).getProductPrice());
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i).getProductName().equalsIgnoreCase(list2.get(j).getProductName())) {
                    list2.get(j).setRemaining(list2.get(j).getRemaining() - list.get(i).getRemaining());
                }
            }
        }
        list.clear();
        WriteProductInfo wr = new WriteProductInfo(false, "GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list2.size(); i++) {
            wr.write(list2.get(i));
        }
        wr.bw.close();
        wr.fw.close();
        return total;
    }

    public static float purchaseAllProduct(ArrayList<Product> list) throws Exception {
        float total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += (cart.get(i).getRemaining() * cart.get(i).getProductPrice());
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getProductName().equalsIgnoreCase(cart.get(i).getProductName())) {
                    int newRemaining = list.get(j).getRemaining() - cart.get(i).getRemaining();
                    list.get(j).setRemaining(newRemaining);
                }
            }
        }
        cart.clear();
        WriteProductInfo wr = new WriteProductInfo(false, "GunStore\\Data\\ProductFile\\ProductFile.txt");
        for (int i = 0; i < list.size(); i++) {
            wr.write(list.get(i));
        }
        wr.bw.close();
        wr.fw.close();
        return total;
    }

    public static void viewBill(ArrayList<Product> list) throws Exception{
        if (list.size() == 0) {
            System.out.println("NOTHING TO SHOW!!!");
            return;
        }
        System.out.println("====YOUR BILL====");

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).outpuProductData());
        }
    }
}
