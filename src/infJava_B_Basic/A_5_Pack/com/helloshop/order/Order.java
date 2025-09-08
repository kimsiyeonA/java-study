package infJava_B_Basic.A_5_Pack.com.helloshop.order;

// 주문 정보

import infJava_B_Basic.A_5_Pack.com.helloshop.product.Product;
import infJava_B_Basic.A_5_Pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
