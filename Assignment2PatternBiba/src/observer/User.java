package observer;

import java.util.List;

public class User implements Observer{
    private String shopName;

    public User(String shopName){
        this.shopName = shopName;
    }

    @Override
    public void update (List<String> products){
        System.out.println("Dear " + this.shopName + "\nWe have new products on our shelves:\n" + products + "\n");
    }
}
