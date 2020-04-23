public class Burger {
    private String code;
    private int quantity;
    static public int totalItem;
    private int SIZE = 15;

    Burger(String code, int quantity){
        this.code = code;
        this.quantity = quantity;
        totalItem += quantity;
    }

    public String getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }
}
