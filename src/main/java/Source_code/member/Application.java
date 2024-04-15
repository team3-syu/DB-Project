package Source_code.member;

import Source_code.Medicine.Medicine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Source_code.Booking.Booking.bookingStart;


import static Source_code.Booking.Booking.managerBookingStart;

import static Source_code.Component.Ingredient.Ingredient.memberStartIngredient;
import static Source_code.Component.Ingredient.Ingredient.startIngredient;
import static Source_code.Medicine.Medicine.medicineMenu;
import static Source_code.Medicine.Medicine.medicineStart;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberController memberController = new MemberController();


        do {
            System.out.println();
            System.out.println("=========== 메인화면 입니다 ===========");
            System.out.println("1.로그인");
            System.out.println("2.회원 가입");
            System.out.println("9.프로그램 종료");
            System.out.print("원하는 번호를 입력하세요: ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    memberLogin();
                    break;
                case 2:
                    memberController.memberInsert(inputMember());
                    break;
                case 9:
                    System.out.println("===프로그램을 종료합니다===");
                    return;


                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
            }

        } while (true);
    }


    private static void memberLogin() {

        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("=====로그인 페이지입니다.=====");
        System.out.print("아이디를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        if (id.equals("manager") && password.equals("1234")) {
            System.out.println("매니저로 로그인 성공.");
            showAdminMenu();
        } else {
            int result = memberService.checkLogin(id, password);

            if (result == 1) {
                System.out.println("로그인 성공!");
                showUserMenu(id,password);
            } else {
                System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인해주세요.");
            }
        }
    }


    private static void showAdminMenu() {
        Scanner sc = new Scanner(System.in);
        MemberController memberController = new MemberController();


        do {
            System.out.println();
            System.out.println("============== showAdminMenu 관리자 화면입니다 ==============");
            System.out.println("1.회원 전체 조회");
            System.out.println("2.아이디로 회원 검색");
            System.out.println("3.회원 수정");
            System.out.println("4.회원 탈퇴");
            System.out.println("5.약 관리하기");
            System.out.println("6.성분 관리하기");
            System.out.println("7.예약 관리하기");

            System.out.println("9.프로그램 종료");
            System.out.print("원하는 번호를 입력하세요: ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    memberController.memberSelect();
                    break;
                case 2:
                    memberController.memberSearchById(memberSearch());
                    break;
                case 3:
                    memberController.memberUpdate(updateMember());
                    break;
                case 4:
                    memberController.memberDelete(memberSearch());
                    break;
                case 5:
                    medicineStart(); showAdminMenu();
                    break;
                case 6:
                    startIngredient(); showAdminMenu();
                    break;
                case 7:
                    managerBookingStart(); showAdminMenu();
                    break;
                case 9:
                    System.out.println("===프로그램을 종료합니다===");
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    break;
            }

        } while (true);
    }

    private static Map<String, String> memberSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 아이디를 입력하세요 : ");
        String member_id = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("member_id", member_id);
        return parameter;

    }


    private static Map<String, String> inputMember() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("========회원가입==========");
        System.out.print("회원 아이디을 입력하세요: ");
        String member_id = sc.nextLine();
        System.out.print("회원 비밀번호를 입력하세요: ");
        String member_password = sc.nextLine();
        System.out.print("회원 이름을 입력하세요: ");
        String member_name = sc.nextLine();
        System.out.print("회원 전화번호를 입력하세요: ");
        String member_phone = sc.nextLine();
        System.out.print("회원 생년월일을 입력하세요: ");
        String member_birthday = sc.nextLine();
        System.out.print("회원 성별을 입력하세요: ");
        String member_gender = sc.nextLine();
        System.out.print("회원 이메일을 입력하세요: ");
        String member_email = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("member_id", member_id);
        parameter.put("member_password", member_password);
        parameter.put("member_name", member_name);
        parameter.put("member_phone", member_phone);
        parameter.put("member_birthday", member_birthday);
        parameter.put("member_gender", member_gender);
        parameter.put("member_email", member_email);

        return parameter;

    }


    private static Map<String, String> updateMember() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("======== 회원 수정 ======");

        System.out.print("수정할 회원 아이디을 입력하세요: ");
        String member_id = sc.nextLine();
        System.out.print("수정할 회원 비밀번호를 입력하세요: ");
        String member_password = sc.nextLine();
        System.out.print("수정할 회원 이름을 입력하세요: ");
        String member_name = sc.nextLine();
        System.out.print("수정할 회원 전화번호를 입력하세요: ");
        String member_phone = sc.nextLine();
        System.out.print("수정할 회원 생년월일을 입력하세요: ");
        String member_birthday = sc.nextLine();
        System.out.print("수정할 회원 성별을 입력하세요: ");
        String member_gender = sc.nextLine();
        System.out.print("수정할 회원 이메일을 입력하세요: ");
        String member_email = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("member_id", member_id);
        parameter.put("member_password", member_password);
        parameter.put("member_name", member_name);
        parameter.put("member_phone", member_phone);
        parameter.put("member_birthday", member_birthday);
        parameter.put("member_gender", member_gender);
        parameter.put("member_email", member_email);

        return parameter;

    }


    private static void showUserMenu(String id,String password) {

        MemberController memberController = new MemberController();

        String mem_code = memberController.getMemberCodeAndName(id,password);

        System.out.println();
        System.out.println("======고객 서비스=====");
        System.out.println("1. 약 정보 조회하기");
        System.out.println("2. 약 성분 조회하기");
        System.out.println("3. 예약 메뉴");
        System.out.println("9.프로그램 종료");
        System.out.print("원하는 번호를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        switch (no) {
            case 1:
                medicineMenu(); showUserMenu(id,password); break;
            case 2:
                memberStartIngredient(); showUserMenu(id,password); break;
            case 3:
                bookingStart(mem_code); showUserMenu(id,password); break;
            case 9:

        }


    }
}
