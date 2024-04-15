package Source_code.Component.Ingredient;

import java.util.List;

public class IngredientDTO {
    private int id;
    private int ingredientCode;
    private String ingredientName;
    private String effect;
    private String sideEffect;
    private String component;

    public IngredientDTO() {

    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public IngredientDTO(int id, int ingredientCode, String ingredientName, String effect, String sideEffect, String component) {
        this.id = id;;
        this.ingredientCode = ingredientCode;
        this.ingredientName = ingredientName;
        this.effect = effect;
        this.sideEffect = sideEffect == null ? "" : sideEffect;
        this.component = component;
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
        return "약 성분" +
                '\n'+
                "{"+
                ", 성분 코드 = '" + id + '\'' +
                ", 약 성분 = '" + component + '\'' +
                ", 효능 = '" + effect + '\'' +
                ", 부작용=  '" + sideEffect + '\'' +
                '}';
    }
}
