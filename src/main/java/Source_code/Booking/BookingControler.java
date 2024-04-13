package Source_code.Booking;

import java.util.List;
import java.util.Map;

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

    public void inserBooking(Map<String, String> parameter) {

        String memberCode = parameter.get("memberCode");
        String bookMediName = parameter.get("bookMediName");
        String bookMediCount = parameter.get("bookMediCount");
        String bookDate = parameter.get("bookDate");


        BookingDTO book = new BookingDTO();
        book.setMem_code(Integer.parseInt(memberCode));
        book.setMedi_name(bookMediName);
        book.setMedi_count(Integer.parseInt(bookMediCount));
        book.setBook_date(bookDate);


        if(bookingService.insertMyBook(book)) {
            System.out.println("성공");

        } else {
            System.out.println("실패");
        }

    }
}
