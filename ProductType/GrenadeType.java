package ProductType;

public class GrenadeType extends ProductType{
    public static String productTypeCode = "GR";
    public static String productTypeName = "Grenade";
    @Override
    public String outputDataType() {
        return String.format("%s\t\t%s", productTypeCode, productTypeName);
    }  
}
