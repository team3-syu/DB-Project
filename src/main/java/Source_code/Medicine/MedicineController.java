package Source_code.Medicine;

import java.util.List;
import java.util.Map;

public class MedicineController {

    private final MedicineService medicineService;
    private final PrintResult printResult;

    public MedicineController() {
        medicineService = new MedicineService();
        printResult = new PrintResult();
    }


    public void selectAllMedicine() {

        List<MedicineDTO> medicineList = medicineService.selectAllMedicine();

        if(medicineList != null) {
            printResult.printMedicineList(medicineList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void registMedicine(Map<String, String> parameter) {

        String code = parameter.get("code");
        String name = parameter.get("name");
        String component = parameter.get("component");
        String effect = parameter.get("effect");
        String sideEffect = parameter.get("sideEffect");
        int amount = Integer.parseInt(parameter.get("amount"));
        String strong = parameter.get("strong");

        MedicineDTO medicine = new MedicineDTO();
        medicine.setCode(code);
        medicine.setName(name);
        medicine.setComponent(component);
        medicine.setEffect(effect);
        medicine.setSideEffect(sideEffect);
        medicine.setAmount(amount);
        medicine.setStrong(strong);

        if (medicineService.registMedicine(medicine)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyMedicine(Map<String, String> parameter) {
        String code = parameter.get("code");
        String name = parameter.get("name");
        String component = parameter.get("component");
        String effect = parameter.get("effect");
        String sideEffect = parameter.get("sideEffect");
        int amount = Integer.parseInt(parameter.get("amount"));
        String strong = parameter.get("strong");

        MedicineDTO medicine = new MedicineDTO();
        medicine.setCode(code);
        medicine.setName(name);
        medicine.setComponent(component);
        medicine.setEffect(effect);
        medicine.setSideEffect(sideEffect);
        medicine.setAmount(amount);
        medicine.setStrong(strong);

        if(medicineService.modifyMedicine(medicine)) {
            printResult.printSuccessMessage("update");

        } else {
            printResult.printErrorMessage("update");
        }


    }

    public void deleteMedicine(Map<String, String> parameter) {
        String code = parameter.get("code");

        if(medicineService.deleteMedicine(code)) {
            printResult.printSuccessMessage("delete");

        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
