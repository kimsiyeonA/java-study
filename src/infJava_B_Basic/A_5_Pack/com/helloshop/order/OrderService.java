package infJava_B_Basic.A_5_Pack.com.helloshop.order;

import infJava_B_Basic.A_5_Pack.com.helloshop.product.Product;
import infJava_B_Basic.A_5_Pack.com.helloshop.user.User;

// 실제 주문하는 비즈니스 로직

public class OrderService {
    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
