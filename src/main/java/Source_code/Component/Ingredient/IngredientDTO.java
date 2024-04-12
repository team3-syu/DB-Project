package Source_code.Component.Ingredient;

import java.util.List;

public class IngredientDTO {
    private int id;
    private int ingredientCode;
    private String ingredientName;
    private String effect;
    private String sideEffect;

    public IngredientDTO() {

    }
    public IngredientDTO(int id, int ingredientCode, String ingredientName, String effect, String sideEffect) {
        this.id = id;;
        this.ingredientCode = ingredientCode;
        this.ingredientName = ingredientName;
        this.effect = effect;
        this.sideEffect = sideEffect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIngredientCode() {
        return ingredientCode;
    }

    public void setIngredientCode(int ingredientCode) {
        this.ingredientCode = ingredientCode;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", ingredientCode='" + ingredientCode + '\'' +
                ", ingredientName='" + ingredientName + '\'' +
                ", effect='" + effect + '\'' +
                ", sideEffect='" + sideEffect + '\'' +
                '}';
    }
}
