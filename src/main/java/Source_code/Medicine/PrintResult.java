package Source_code.Medicine;

import java.util.List;

public class PrintResult {


    public void printMedicineList(List<MedicineDTO> medicineList) {
        System.out.println("========== 조회한 약 리스트 ==========");

        for (MedicineDTO medicine : medicineList) {
            System.out.println(medicine);
        }
    }


    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch(successCode) {
            case "insert" : successMessage = "신규 약 등록을 성공하였습니다."; break;
            case "update" : successMessage = "약 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "약 삭제를 성공하였습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch(errorCode) {
            case "selectList" : errorMessage = "약 목록 조회를 실패하였습니다."; break;
            case "selectOne" : errorMessage = "약 조회를 실패하였습니다."; break;
            case "insert" : errorMessage = "약 메뉴 등록을 실패하였습니다."; break;
            case "update" : errorMessage = "약 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "약 삭제을 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
