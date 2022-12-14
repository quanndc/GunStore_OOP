package Products;

import ProductType.ProductType;

public class Product extends ProductType{

    protected int remaining;
    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    protected String productCode;
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    protected String productName;
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    protected float productPrice;



    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String outputDataType() {
        return String.format("%s\t\t%s\t\t%s", ProductType.getProductTypeCode(), ProductType.getProductTypeName(), this.getProductCode());
    }

    public String outpuProductData(){
        return String.format("%-20s%-20s%-20s%-10.0f%5d",ProductType.getProductTypeName(),this.getProductCode(), this.getProductName(),this.getProductPrice(),this.getRemaining());
    }

}
