package ProductType;

public class ArmorType extends ProductType{
    public static String productTypeCode = "AMR";
    public static String productTypeName = "Armor";
    @Override
    public String outputDataType() {
        return String.format("%s\t\t%s", productTypeCode, productTypeName);
    }  
}
