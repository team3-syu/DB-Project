package Source_code.Component.Ingredient;

import java.util.List;
import java.util.Map;

public class IngredientController {
    private final IngredientService ingredientService;
    private final PrintResult printResult;

    public IngredientController() {
        ingredientService = new IngredientService();
        printResult = new PrintResult();
    }

    public void selectAllIngredients() {

        List<IngredientDTO> ingredientList = ingredientService.selectAllIngredients();

        if(ingredientList != null) {
            printResult. printIngredientList(ingredientList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectIngredientByCode(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        IngredientDTO ingredient = ingredientService.getIngredientByCode(code);
        if (ingredient != null) {
            printResult.printIngredient(ingredient);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }


    public void deleteIngredient(Map<String, String> parameter) {
        String codeStr = parameter.get("code");
        if (codeStr == null || codeStr.isEmpty()) {
            printResult.printErrorMessage("delete");
            return;
        }
        int code = Integer.parseInt(codeStr);
        boolean result = ingredientService.deleteIngredient(code);
        if (result) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }

    public void insertIngredient(Map<String, String> parameter) {
        // 파라미터에서 약성분 정보 추출
        int ingredientCode = Integer.parseInt(parameter.get("ingredientCode"));
        String ingredientName = parameter.get("name");
        String effect = parameter.get("effect");
        String sideEffect = parameter.get("sideEffect");

        // IngredientDTO 객체 생성
        IngredientDTO ingredient = new IngredientDTO(0, ingredientCode, ingredientName, effect, sideEffect);

        // ingredientService의 insertIngredient 메서드 호출하여 약성분 등록
        boolean result = ingredientService.insertIngredient(ingredient);

        // 등록 결과에 따라 성공 또는 실패 메시지 출력
        if (result) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }


    public void updateIngredient(Map<String, String> parameter) {
        String codeStr = parameter.get("code");
        if (codeStr == null || codeStr.isEmpty()) {
            printResult.printErrorMessage("update");
            return;
        }
        int code = Integer.parseInt(codeStr);

        String name = parameter.get("name");
        String effect = parameter.get("effect");
        String sideEffect = parameter.get("sideEffect");

        // 기존 약성분 정보 조회
        IngredientDTO existingIngredient = ingredientService.getIngredientByCode(code);
        if (existingIngredient == null) {
            printResult.printErrorMessage("update");
            return;
        }

        // 수정할 약성분 정보 설정
        existingIngredient.setIngredientName(name);
        existingIngredient.setEffect(effect);
        existingIngredient.setSideEffect(sideEffect);

        // 약성분 정보 업데이트
        boolean result = ingredientService.updateIngredient(existingIngredient);
        if (result) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }
}
