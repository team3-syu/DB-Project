package Source_code.member;

public class MemberDTO implements java.io.Serializable {

    private int member_code;
    private String member_id;
    private String member_password;
    private String member_name;
    private String member_phone;
    private String member_birthday;
    private String member_gender;
    private String member_email;


    public MemberDTO() {
    }


    public MemberDTO(int member_code, String member_id, String member_password, String member_name, String member_phone, String member_birthday, String member_gender, String member_email) {
        this.member_code = member_code;
        this.member_id = member_id;
        this.member_password = member_password;
        this.member_name = member_name;
        this.member_phone = member_phone;
        this.member_birthday = member_birthday;
        this.member_gender = member_gender;
        this.member_email = member_email;
    }


    public int getMember_code() {
        return member_code;
    }

    public void setMember_code(int member_code) {
        this.member_code = member_code;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getMember_password() {
        return member_password;
    }

    public void setMember_password(String member_password) {
        this.member_password = member_password;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_birthday() {
        return member_birthday;
    }

    public void setMember_birthday(String member_birthday) {
        this.member_birthday = member_birthday;
    }

    public String getMember_gender() {
        return member_gender;
    }

    public void setMember_gender(String member_gender) {
        this.member_gender = member_gender;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }


    @Override
    public String toString() {
        return "MemberDTO{" +
                "member_code=" + member_code +
                ", member_id='" + member_id + '\'' +
                ", member_password='" + member_password + '\'' +
                ", member_name='" + member_name + '\'' +
                ", member_phone='" + member_phone + '\'' +
                ", member_birthday='" + member_birthday + '\'' +
                ", member_gender='" + member_gender + '\'' +
                ", member_email='" + member_email + '\'' +
                '}';
    }
}
