package Source_code.member;

import java.util.List;
import java.util.Map;

public class MemberController {

    private final MemberService memberService;
    private final PrintResult printResult;

    public MemberController() {
        memberService = new MemberService();
        printResult = new PrintResult();
    }


    public void memberSelect() {

        List<MemberDTO> memberList = memberService.memberSelect();

        if (memberList != null) {
            printResult.printMemberList(memberList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }


    public void memberInsert(Map<String, String> parameter) {

        String member_id = parameter.get("member_id");
        String member_password = parameter.get("member_password");
        String member_name = parameter.get("member_name");
        String member_phone = parameter.get("member_phone");
        String member_birthday = parameter.get("member_birthday");
        String member_gender = parameter.get("member_gender");
        String member_email = parameter.get("member_email");

        MemberDTO member = new MemberDTO();
        member.setMember_id(member_id);
        member.setMember_password(member_password);
        member.setMember_name(member_name);
        member.setMember_phone(member_phone);
        member.setMember_birthday(member_birthday);
        member.setMember_gender(member_gender);
        member.setMember_email(member_email);

        if (memberService.memberInsert(member)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }


    public void memberUpdate(Map<String, String> parameter) {

        String member_id = parameter.get("member_id");
        String member_password = parameter.get("member_password");
        String member_name = parameter.get("member_name");
        String member_phone = parameter.get("member_phone");
        String member_birthday = parameter.get("member_birthday");
        String member_gender = parameter.get("member_gender");
        String member_email = parameter.get("member_email");

        MemberDTO member = new MemberDTO();
        member.setMember_id(member_id);
        member.setMember_password(member_password);
        member.setMember_name(member_name);
        member.setMember_phone(member_phone);
        member.setMember_birthday(member_birthday);
        member.setMember_gender(member_gender);
        member.setMember_email(member_email);

        if (memberService.memberUpdate(member)) {
            printResult.printSuccessMessage("update");

        } else {
            printResult.printErrorMessage("update");
        }

    }

    public void memberDelete(Map<String, String> parameter) {

        String member_id = parameter.get("member_id");

        if (memberService.memberDelete(member_id)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }


    }


    public void memberSearchById(Map<String, String> parameter) {
        String member_id = parameter.get("member_id");

        MemberDTO member = memberService.memberSearchById(member_id);

        if (member != null) {
            printResult.printMember(member);

        } else {
            printResult.printErrorMessage("selectOne");
        }

    }

    public void checkLogin (Map<String, String> parameter){
        String member_id = parameter.get("member_id");
        String member_password = parameter.get("member_password");
        MemberDTO member = new MemberDTO();
        member.setMember_id(member_id);
        member.setMember_password(member_password);
    }


    public String getMemberCodeAndName() {
        System.out.println("컨트롤러통과 getMemberCodeAndName");

        return memberService.getMemberCodeAndName();
    }
}

