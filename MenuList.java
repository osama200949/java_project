public enum MenuList {

    B101("McChicken", 8.90),
    B102("Fillet-O-Fish", 8.90),
    B103("Cheeseburger", 5.50),
    B201("Chicken McNuggets", 11.50),
    B202("GCB", 12.50),
    B203("Spicy Chicken McDeluxe", 11.50),
    B204("Big Mac", 10.90),
    B301("Double GCB", 18.20),
    B302("Double Fillet-O-Fish", 11.95),
    B303("Double Cheeseburger", 9.50),
    B304("Double Spicy Chicken McDeluxe	", 17.25),
    ;

    private double price;
    private String desc;

    MenuList(String desc, double price) {
        this.price = price;
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }
}
