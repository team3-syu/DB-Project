package Source_code.Component.Ingredient;

import java.util.List;

public class PrintResult {
    public void printIngredientList(List<IngredientDTO> ingredientList) {
        for(IngredientDTO ingredientDTO : ingredientList) {
            System.out.println(ingredientDTO);
        }
    }

    public void printIngredient(IngredientDTO ingredientDTO) {
        System.out.println(ingredientDTO);
    }

    public void  printSuccessMessage(String successCode) {
        String successMessage = "";

        switch(successCode) {
            case "insert" : successMessage = "신규 메뉴 등록을 성공하였습니다."; break;
            case "update" : successMessage = "메뉴 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "메뉴 삭제를 성공하였습니다."; break;
            default: successMessage = "알 수 없는 작업을 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch(errorCode) {
            case "selectList" : errorMessage = "성분 목록 조회를 실패하였습니다."; break;
            case "selectOne" : errorMessage = "성분 조회를 실패하였습니다."; break;
            case "insert" : errorMessage = "성분 메뉴 등록을 실패하였습니다."; break;
            case "update" : errorMessage = "성분 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "성분 삭제을 실패하였습니다."; break;
            default: errorMessage = "알 수 없는 작업을 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
