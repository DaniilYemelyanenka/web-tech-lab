package by.bsuir.webtech.Model;

public class CartInfo {

    private int itemCount;
    private double totalPrice;

    public CartInfo(double totalPrice, int itemCount) {
        this.totalPrice = totalPrice;
        this.itemCount = itemCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
