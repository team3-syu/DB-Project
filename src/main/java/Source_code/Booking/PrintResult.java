package Source_code.Booking;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<BookingDTO> bookingList) {
        for(BookingDTO menu : bookingList) {
            System.out.println(menu);
        }
    }

}
