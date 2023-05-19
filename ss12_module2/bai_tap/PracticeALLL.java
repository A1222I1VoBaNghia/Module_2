package ss12_module2.bai_tap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PracticeALLL {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product(1, "Sữa Vinamilk", 100, "330ml"));
        productManager.addProduct(new Product(2, "Sữa Dalatmilk", 200, "320ml"));
        productManager.addProduct(new Product(3, "Sữa TH Truemilk", 300, "345ml"));
        productManager.addProduct(new Product(4, "Sữa Nestle", 400, "280ml"));
        System.out.println("Update sản phẩm 1: Giá tiền: 150");
        productManager.updateProduct(1, "Sữa Vinamilk", 150, "330ml");
        System.out.println("Xóa sản phẩm thứ 2");
        productManager.removeProduct(2);
        productManager.displayProducts();
    }
}
