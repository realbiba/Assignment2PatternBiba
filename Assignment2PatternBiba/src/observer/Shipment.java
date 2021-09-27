package observer;

import java.util.ArrayList;
import java.util.List;

public class Shipment implements Observable{

    private List<String> product = new ArrayList<>();
    private List<Observer> products = new ArrayList<>();

    public void addProduct(String product){
        this.product.add(product);
        notifyAllUsers();
    }

    public void deleteProduct(String product){
        this.product.remove(product);
        notifyAllUsers();
    }



    @Override
    public void signUpUser(Observer observer) {
        this.products.add(observer);
    }

    @Override
    public void deleteUser(Observer observer) {
        this.products.remove(observer);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer observer: products){
            observer.update(this.product);
        }
    }
}
