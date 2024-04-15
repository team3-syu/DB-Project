package Source_code.Medicine;

public class MedicineDTO {

    private String code;
    private String name;
    private String component;
    private String effect;
    private String sideEffect;
    private int amount;
    private String strong;

    public MedicineDTO() {
    }

    public MedicineDTO(String code, String name, String component, String effect, String sideEffect, int amount, String strong) {
        this.code = code;
        this.name = name;
        this.component = component;
        this.effect = effect;
        this.sideEffect = sideEffect;
        this.amount = amount;
        this.strong = strong;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStrong() {
        return strong;
    }

    public void setStrong(String strong) {
        this.strong = strong;
    }

    @Override
    public String toString() {
        return "MedichineDTO{" +
                "약 코드 = '" + code + '\'' +
                ", 약 이름 = '" + name + '\'' +
                ", 약 성분 = '" + component + '\'' +
                ", 약 효능 = '" + effect + '\'' +
                ", 약 부작용 = '" + sideEffect + '\'' +
                ", 수량 = " + amount +
                ", 세기 = '" + strong + '\'' +
                '}';
    }

}
