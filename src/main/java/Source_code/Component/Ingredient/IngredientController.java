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
        int id = Integer.parseInt(parameter.get("id"));


        IngredientDTO ingredient = ingredientService.getIngredientById(id);
        if (ingredient != null) {
            printResult.printIngredient(ingredient);
        } else {
            printResult.printErrorMessage("selectOne");
        }
        }


    public void deleteIngredient(Map<String, String> stringStringMap) {

        int code = Integer.parseInt(stringStringMap.get("ingredientCode"));

        if(ingredientService.deleteIngredient(code)) {
            printResult.printSuccessMessage("delete");

        } else {
            printResult.printErrorMessage("delete");
        }

    }

    public void insertIngredient(Map<String, String> stringStringMap)  {
        String codeStr = stringStringMap.get("ingredientCode");
    if (codeStr != null) {
        int code = Integer.parseInt(codeStr);
        String name = stringStringMap.get("ingredientName");
        String effect = stringStringMap.get("effect");
        String sideEffect = stringStringMap.get("sideEffect");

        IngredientDTO ingredient = new IngredientDTO();
        ingredient.setIngredientCode(code);
        ingredient.setIngredientName(name);
        ingredient.setEffect(effect);
        ingredient.setSideEffect(sideEffect);

        if (ingredientService.insertIngredient(ingredient)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    } else {
        printResult.printErrorMessage("insert");
    }
}

    public void updateIngredient(Map<String, String> stringStringMap) {
        int code = Integer.parseInt(stringStringMap.get("ingredientCode"));
        String name = stringStringMap.get("ingredientName");
        String effect = stringStringMap.get("effect");
        String sideEffect = stringStringMap.get("sideEffect");

        IngredientDTO ingredient = new IngredientDTO();
        ingredient.setIngredientCode(code);
        ingredient.setIngredientName(name);
        ingredient.setEffect(effect);
        ingredient.setSideEffect(sideEffect);

        if(ingredientService.updateIngredient(ingredient)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }
}
