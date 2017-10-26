package homeworkTwo;

/**
 * Created by user3h on 3/27/16.
 */
public class AdvanceTicket extends Ticket {

    private int daysInAdvance;

    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);

        this.daysInAdvance = daysInAdvance;

        if (daysInAdvance > 9) {
            super.setPrice(30);
        } else {
            super.setPrice(40);
        }
    }


}
