package ProductType;

public abstract class ProductType {
    protected String productTypeCode;
    protected  String productTypeName;

    public String getProductTypeCode() {
        return this.productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public String getProductTypeName() {
        return this.productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public abstract String outputDataType();

}
