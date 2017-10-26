package homeworkTwo;

public class WalkupTicket extends Ticket {

    private int number;

    public WalkupTicket(int number) {
        super(number);
        super.setPrice(50);
    }
}