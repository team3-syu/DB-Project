package Source_code.Component.Ingredient;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IngredientMapper {

    List<IngredientDTO> getAllIngredients();

    void insertIngredient(IngredientDTO ingredient);
    void updateIngredient(IngredientDTO ingredient);
    void deleteIngredient(int id);

    IngredientDTO getIngredientByCode(int code);
}
