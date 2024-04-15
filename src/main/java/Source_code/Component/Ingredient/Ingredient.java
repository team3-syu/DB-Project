package Source_code.Component.Ingredient;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ingredient {
    public static void startIngredient() {
        Scanner sc = new Scanner(System.in);
        IngredientController ingredientController = new IngredientController();

        do {
            System.out.println("========== 약성분 관리 ==========");
            System.out.println("1. 전체 약성분 조회");
            System.out.println("2. 약 이름으로 조회");
            System.out.println("3. 신규 약성분 추가");
            System.out.println("4. 기존 약성분 변경");
            System.out.println("5. 기존 약성분 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.println("================================");
            System.out.print("관리 번호를 입력하세요");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    ingredientController.selectAllIngredients();
                    break;
                case 2:
                    ingredientController.selectIngredientByCode(inputIngredientCode());
                    break;
                case 3:
                    ingredientController.insertIngredient(inputIngredient());
                    break;
                case 4:
                    ingredientController.updateIngredient(inputModifyIngredient());
                    break;
                case 5:
                    ingredientController.deleteIngredient(inputIngredientCode());
                    break;
                case 9:
                    System.out.println("약성분 관리 프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 관리 번호입니다");
                    break;
            }
        } while (true);
    }

    private static Map<String, String> inputIngredientCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("약 성분를 입력하세요: ");
        String component = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("component", component);

        return parameter;
    }

    private static Map<String, String> inputIngredient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("약성분 코드를 입력하세요: ");
        String ingredientCode = sc.nextLine();
        System.out.print("약성분 이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("약성분 효능을 입력하세요: ");
        String effect = sc.nextLine();
        System.out.print("약성분 부작용을 입력하세요: ");
        String sideEffect = sc.nextLine();
        System.out.printf("성분을 입력하세요: ");
        String component= sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("ingredientCode", ingredientCode);
        parameter.put("name", name);
        parameter.put("effect", effect);
        parameter.put("sideEffect", sideEffect);
        parameter.put("component", component);

        return parameter;
    }

    private static Map<String, String> inputModifyIngredient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정 대상 약성분 코드를 입력하세요: ");
        String code = sc.nextLine().trim();
        System.out.print("수정할 약성분 이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("수정할 약성분 효능을 입력하세요: ");
        String effect = sc.nextLine();
        System.out.print("수정할 약성분 부작용을 입력하세요: ");
        String sideEffect = sc.nextLine();
        System.out.print("수정할 약성분 성분을 입력하세요: ");
        String component = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("effect", effect);
        parameter.put("sideEffect", sideEffect);
        parameter.put("component", component);

        return parameter;
    }

    public static void memberStartIngredient() {
        Scanner sc = new Scanner(System.in);
        IngredientController ingredientController = new IngredientController();

        do {
            System.out.println("========== 약성분 관리 ==========");
            System.out.println("1. 전체 약성분 조회");
            System.out.println("2. 약성분으로 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("================================");
            System.out.print("관리 번호를 입력하세요");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    ingredientController.selectAllIngredients();
                    break;
                case 2:
                    ingredientController.selectIngredientByCode(inputIngredientCode());
                    break;
                case 9:
                    System.out.println("약성분 관리 프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 관리 번호입니다");
                    break;
            }
        } while (true);
    }
}


