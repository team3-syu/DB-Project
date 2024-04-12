package Source_code.Booking;

import java.util.List;

public class BookingControler {

    private final BookingService bookingService;
    private final PrintResult printResult;

    public BookingControler() {bookingService = new BookingService();
        printResult = new PrintResult();
    }

    public void selectMyBook() {

        List<BookingDTO> myBookList = bookingService.selectMyBook();
        if(myBookList != null) {
            printResult.printMenuList(myBookList);

        }


        System.out.println("컨트롤러통과");

    }

    public void inserBooking(){



    }
}
