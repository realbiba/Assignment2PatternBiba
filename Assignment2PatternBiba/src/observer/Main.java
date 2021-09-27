package observer;

public class Main {
    public static void main(String[] args) {
        Shipment shipping = new Shipment();

        shipping.addProduct("Hoodie");
        shipping.addProduct("Sneakers");

        User newShop = new User("Motion");
        shipping.signUpUser(newShop);

        shipping.addProduct("Glasses");
        shipping.deleteProduct("Hoodie");

    }
}
