package ejerc03;

import java.util.List;

public class DiscountApplier {
    private ProductDao dao;

    public DiscountApplier(ProductDao dao) {
        this.dao = dao;
    }

    public void applyDiscounts() {
        List<Product> products = dao.getAll();
        for (Product p : products) {
            if (p.getCategory().equals("HOME")) {
                p.setPrice(p.getPrice() * 0.9); // 10% descuento
            } else if (p.getCategory().equals("BUSINESS")) {
                p.setPrice(p.getPrice() * 1.1); // 10% aumento
            }
        }
    }
}