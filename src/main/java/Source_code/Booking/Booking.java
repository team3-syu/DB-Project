package Source_code.Booking;


import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Booking {

    public static void main(String[] args) {
   /* public static void bookingStart() {*/

        BookingControler bookingControler = new BookingControler();
        LocalDate date = LocalDate.now();


        System.out.println(date);
        System.out.println("========= 예약 조회 페이지 입니다. ===========");
        addSpace();
        System.out.println("1. 내예약 조회 하기");
        System.out.println("2. 예약하기");
        System.out.println("3. 삭제하기");
        System.out.println("4. 예약상태 변경 하기");
        System.out.println("9. 돌아가기");
        Scanner sc = new Scanner(System.in);
        int SelectMenu = sc.nextInt();

        switch (SelectMenu){
            case 1 : bookingControler.selectMyBook();break;
            case 2 : bookingControler.inserBooking(inputMenu());break;
            case 3 : bookingControler.deleteMyBook(deleteBook());break;
            case 4 : bookingControler.updateBookStatus(UpdateBook());break;
            case 9 : return;

        }


    }


    private static void addSpace(){

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("");
        }

    }

    private static Map<String, String> inputMenu() {

        LocalDate date = LocalDate.now();

        Scanner sc = new Scanner(System.in);
        System.out.print("예약하실 약 이름을 입력하세요 : ");
        String bookMediName = sc.nextLine();
        /*이부분에 약있는지 검사해야함*/
        System.out.print("예약할 약의 개수를 입력하세요 : ");
        String bookMediCount = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("bookDate", String.valueOf(date));
        parameter.put("bookMediName", bookMediName);
        parameter.put("bookMediCount", bookMediCount);
        parameter.put("memberCode","1");


        return parameter;

    }

    private static String deleteBook() {


        Scanner sc = new Scanner(System.in);
        System.out.print("삭제하실 예약코드를 입력하세요 : ");
        String deleteCode = sc.nextLine();
        /*이부분에 약있는지 검사해야함*/



        return deleteCode;

    }

    private static String UpdateBook() {


        Scanner sc = new Scanner(System.in);
        System.out.print("예약상태를 변경하실 예약코드를 입력하세요 : ");
        String updateCode = sc.nextLine();
        /*이부분에 약있는지 검사해야함*/


        return updateCode;

    }
}
