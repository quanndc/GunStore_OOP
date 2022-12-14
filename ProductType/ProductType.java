package ProductType;

public abstract class ProductType {
    protected static String productTypeCode;
    protected static String productTypeName;

    public static String getProductTypeCode() {
        return productTypeCode;
    }

    public static void setProductTypeCode(String productTypeCode) {
        ProductType.productTypeCode = productTypeCode;
    }

    public static String getProductTypeName() {
        return productTypeName;
    }

    public static void setProductTypeName(String productTypeName) {
        ProductType.productTypeName = productTypeName;
    }

    public abstract String outputDataType();

}
