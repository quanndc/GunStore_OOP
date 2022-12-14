package ProductType;

public class GunType extends ProductType{

    public static String productTypeCode = "G";
    public static String productTypeName = "Gun";
    @Override
    public String outputDataType() {
        return String.format("%s\t\t%s", productTypeCode, productTypeName);
    }    
}
