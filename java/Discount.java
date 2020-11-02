import java.util.ArrayList;
import java.util.List;

public class Discount {

    public static void main(String[] args) {

        int itemCount = 0;

        System.out.println("Enter the number of products: ");

        itemCount = Integer.parseInt(System.console().readLine());

        Product[] products = new Product[itemCount];

        int index = 0;

        while (index < products.length) {

            String userInput = System.console().readLine();

            String[] split = userInput.split(","); // a,b,c

            products[index] = new Product(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]));

            index++;
        }

        int discount = 0;
        String[] names = new String[itemCount];

        index = 0;

        for (Product product : products) {
            if (discount <= product.getDiscount()) {
                names[index] = product.getName();
                discount = product.getDiscount();
                index++;
            }
        }

        for (String name : names) {
            if (name != null) {
                System.out.println("The product with the least discount is : " + name);
            }
        }

    }
}

class Product {

    private String name;
    private int price;
    private int discountPct;
    private int discount;

    public Product() {
    }

    public Product(String name, int price, int discountPct) {
        this.name = name;
        this.price = price;
        this.discountPct = discountPct;
        setDiscountPct(discountPct);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPct() {
        return this.discountPct;
    }

    public void setDiscountPct(int discountPct) {
        this.discountPct = discountPct;
        discount = (price * discountPct) / 100;

        setDiscount(discount);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", price='" + getPrice() + "'" + ", discountPct='" + getDiscountPct()
                + "'" + ", discount='" + getDiscount() + "'" + "}";
    }
}
