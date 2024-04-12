package Source_code.Medicine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MedicineController medicineController = new MedicineController();

        do {
            System.out.println("========== 약 관리 ==========");
            System.out.println("1. 전체 약 조회");
            System.out.println("2. 신규 약 추가");
            System.out.println("3. 기존 약 변경");
            System.out.println("4. 기존 약 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.println("=========================");
            System.out.println("약 관리 번호를 입력하세요 : ");
            int no = scanner.nextInt();

            switch (no) {
                case 1:
                    medicineController.selectAllMedicine();
                    break;
                case 2:
                    medicineController.registMedicine(inputMedicine());
                    break;
                case 3:
                    medicineController.modifyMedicine(inputModifyMedicine());
                    break;
                case 4:
                    medicineController.deleteMedicine(inputMedicineCode());
                    break;
                case 9:
                    System.out.println("약 관리 프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 관리 번호입니다.");
                    break;
            }
        } while (true);


    }


    private static Map<String, String> inputMedicine() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("약 코드를 입력하세요 : ");
        String code = scanner.nextLine();
        System.out.println("약 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.println("약 성분을 입력하세요 : ");
        String component = scanner.nextLine();
        System.out.println("약 효능을 입력하세요 : ");
        String effect = scanner.nextLine();
        System.out.println("약 부작용을 입력하세요 : ");
        String sideEffect = scanner.nextLine();
        System.out.println("약 수량을 입력하세요 : ");
        String amount = scanner.nextLine();
        System.out.println("약 강도를 입력하세요 : ");
        String strong = scanner.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("component", component);
        parameter.put("effect", effect);
        parameter.put("sideEffect", sideEffect);
        parameter.put("amount", amount);
        parameter.put("strong", strong);

        return parameter;
    }

    private static Map<String, String> inputModifyMedicine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수정 대상 약 코드를 입력하세요 : ");
        String code = scanner.nextLine();
        System.out.println("수정할 약 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.println("수정할 약 성분을 입력하세요 : ");
        String component = scanner.nextLine();
        System.out.println("수정할 약 효능을 입력하세요 : ");
        String effect = scanner.nextLine();
        System.out.println("수정할 약 부작용을 입력하세요 : ");
        String sideEffect = scanner.nextLine();
        System.out.println("수정할 약 수량을 입력하세요 : ");
        String amount = scanner.nextLine();
        System.out.println("수정할 약 강도를 입력하세요 : ");
        String strong = scanner.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("component", component);
        parameter.put("effect", effect);
        parameter.put("sideEffect", sideEffect);
        parameter.put("amount", amount);
        parameter.put("strong", strong);

        return parameter;
    }
    private static Map<String, String> inputMedicineCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("약 코드를 입력하세요 : ");
        String code = scanner.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

}
