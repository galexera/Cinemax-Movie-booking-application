package ticketvariables;

public class seat_bill {

    static String selected_seats;
    static int total_pay1;
    static String total_pay2;

    public seat_bill() {
    }

    public seat_bill(String st, int b) {
        selected_seats = st;
        total_pay1 = b;
    }

    public String get_seats() {
        return selected_seats;
    }

    public String get_bill() {
        total_pay2 = Integer.toString(total_pay1);
        return total_pay2;
    }

}
