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
        else{
            System.out.println("약이름을 잘못입력했습니다");
        }



    }
    public void selectMemberBook(String mem_code) {
        BookingDTO book = new BookingDTO();
        book.setMem_code(Integer.parseInt(mem_code));
        List<BookingDTO> myBookList = bookingService.selectMemberBook(book);
        if(myBookList != null) {
            printResult.printMenuList(myBookList);
        }
        else{
            System.out.println("약이름을 잘못입력했습니다");
        }


    }
    public void deleteMyBook(String deleteCode){
        BookingDTO book = new BookingDTO();
        book.setBook_code(Integer.parseInt(deleteCode));
        if(bookingService.deleteMyBook(book)) {
            System.out.println("성공");

        } else {
            System.out.println("실패");
        }

    }

    public void updateBookStatus(String updateBook){
        BookingDTO book = new BookingDTO();
        book.setBook_code(Integer.parseInt(updateBook));
        if(bookingService.updateMyBook(book)) {
            System.out.println("성공");

        } else {
            System.out.println("실패");
        }

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
