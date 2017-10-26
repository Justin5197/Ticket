package homeworkTwo;

/**
 * Created by user3h on 3/27/16.
 */
public class Ticket {

    private int number;
    private int price;

    public Ticket(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Number: "+getNumber()+", Price: "+getPrice();
    }
}
