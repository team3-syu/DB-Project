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
        List<IngredientDTO> ingredientList = ingredientService.getAllIngredients();

        if(ingredientList != null) {
            printResult.printMenuList(ingredientList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectIngredientByCode(Map<String, String> stringStringMap) {
        int code = Integer.parseInt(stringStringMap.get("ingredientCode"));

        IngredientDTO ingredient = IngredientService.getIngredientByCode(code);

        if(ingredient != null) {
            printResult.printIngredient(ingredient);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void deleteIngredient(Map<String, String> stringStringMap) {

        int code = Integer.parseInt(stringStringMap.get("ingredientCode"));

        if(IngredientService.deleteIngredient(code)) {
            printResult.printSuccessMessage("delete");

        } else {
            printResult.printErrorMessage("delete");
        }

    }

    public void insertIngredient(Map<String, String> stringStringMap) {
        int code = Integer.parseInt(stringStringMap.get("ingredientCode"));
        String name = stringStringMap.get("ingredientName");
        String effect = stringStringMap.get("effect");
        String sideEffect = stringStringMap.get("sideeffect");

        IngredientDTO ingredient = new IngredientDTO();
        ingredient.setIngredientCode(code);
        ingredient.setIngredientName(name);
        ingredient.setEffect(effect);
        ingredient.setSideEffect(sideEffect);

        if(IngredientService.insertIngredient(ingredient)) {
            printResult.printSuccessMessage("insert");

        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void updateIngredient(Map<String, String> stringStringMap) {
        int code = Integer.parseInt(stringStringMap.get("ingredientCode"));
        String name = stringStringMap.get("ingredientName");
        String effect = stringStringMap.get("effect");
        String sideEffect = stringStringMap.get("sideeffect");

        IngredientDTO ingredient = new IngredientDTO();
        ingredient.setIngredientCode(code);
        ingredient.setIngredientName(name);
        ingredient.setEffect(effect);
        ingredient.setSideEffect(sideEffect);

        if(IngredientService.updateIngredient(ingredient)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }
}
