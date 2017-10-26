package homeworkTwo;

public class StudentAdvanceTicket extends AdvanceTicket{

    String str = "(ID required)";

    public StudentAdvanceTicket(int number, int daysInAdvance) {
        super(number, daysInAdvance);

        if (daysInAdvance > 9) {
            super.setPrice(15);
        } else {
            super.setPrice(20);
        }
    }

    public String toString() {
        return "Number: "+super.getNumber()+", Price: "+getPrice()+" "+str;
    }

}
