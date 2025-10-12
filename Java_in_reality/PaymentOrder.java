import java.util.*;
interface PaymentMethod {
    String getPaymentMethod();
    void getInfor(String cusName, double count);
}

class CashPayment implements PaymentMethod {
    @Override
    public String getPaymentMethod() {
        return " bằng tiền mặt";
    }

    @Override
    public void getInfor(String cusName, double count) {
        System.out.println(cusName + " đã thanh toán " + count + getPaymentMethod());
    }
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public String getPaymentMethod() {
        return "bằng thẻ tín dụng";
    }

    @Override
    public void getInfor(String cusName, double count) {
        System.out.println(cusName + " đã thanh toán " + count + getPaymentMethod());
    }
}

class MomoPayment implements PaymentMethod {
    @Override
    public String getPaymentMethod() {
        return " bằng ví điện tử Momo";
    }

    @Override
    public void getInfor(String cusName, double count) {
        System.out.println(cusName + " đã thanh toán " + count + getPaymentMethod());
    }
}

abstract class Products {
    protected String prodId;
    protected String name;
    protected double price;
    protected String prodType;

    public Products(String prodId, String name, double price, String prodType) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.prodType = prodType;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public abstract void show();
}

class ElectronicProd extends Products {
    private String IMEI;
    private int warrantyTime;

    public ElectronicProd(String prodId, String name, double price, String prodType, String IMEI, int warrantyTime) {
        super(prodId, name, price, prodType);
        this.IMEI = IMEI;
        this.warrantyTime = warrantyTime;
    }

    @Override
    public void show() {
        System.out.println("Sản phẩm điện tử: " + name + " | Giá: " + price + 
                           " | IMEI: " + IMEI + " | Bảo hành: " + warrantyTime + " tháng");
    }
}

class FoodProd extends Products {
    private String IMEI;
    private Date date;

    public FoodProd(String prodId, String name, double price, String prodType, String IMEI, Date date) {
        super(prodId, name, price, prodType);
        this.IMEI = IMEI;
        this.date = date;
    }

    @Override
    public void show() {
        System.out.println("Sản phẩm thực phẩm: " + name + " | Giá: " + price + 
                           " | Hạn sử dụng: " + date);
    }
}

class ProductList {
    private List<Products> productList = new ArrayList<>();

    public void addProduct(Products p) {
        productList.add(p);
    }

    public List<Products> getListProduct() {
        return productList;
    }
}

class Order {
    private String orderId;
    private List<Products> productList = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public Order(String orderId, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
    }

    public void addProduct(Products p) {
        productList.add(p);
    }

    public double count() {
        double total = 0;
        for (Products p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public void checkout(String customerName) {
        double total = count();
        System.out.println("Tổng tiền đơn hàng: " + total + " VNĐ");
        paymentMethod.getInfor(customerName, total);
    }
}

public class PaymentOrder {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        ElectronicProd laptop = new ElectronicProd("E001", "Laptop Dell", 15000000, "Electronic", "123456789", 12);
        FoodProd milk = new FoodProd("F001", "Sữa Vinamilk", 35000, "Food", "N/A", new Date());

        productList.addProduct(laptop);
        productList.addProduct(milk);

        for (Products p : productList.getListProduct()) {
            p.show();
        }

        PaymentMethod momo = new MomoPayment();
        Order order = new Order("ORD001", momo);
        order.addProduct(laptop);
        order.addProduct(milk);

        order.checkout("Nguyễn Văn A");
    }
}
