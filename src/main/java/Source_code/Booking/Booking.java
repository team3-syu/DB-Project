package Source_code.Booking;


import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class Booking {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();


        System.out.println(date);
        System.out.println("========= 예약 조회 페이지 입니다. ===========");
        addSpace();
        System.out.println("1. 내예약 조회 하기");
        System.out.println("2. 예약하기");
        System.out.println("9. 돌아가기");
        Scanner sc = new Scanner(System.in);
        int SelectMenu = sc.nextInt();

        switch (SelectMenu){
            case 1 : break;
            case 2 : break;
            case 9 : break;

        }


    }


    private static void addSpace(){

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("");
        }

    }
}
