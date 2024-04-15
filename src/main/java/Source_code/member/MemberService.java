package Source_code.member;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static Source_code.member.Template.getSqlSession;


public class MemberService {

    private final MemberDAO memberDAO;

    public MemberService() {
        memberDAO = new MemberDAO();
    }


    public List<MemberDTO> memberSelect() {

        SqlSession sqlSession = getSqlSession();

        List<MemberDTO> memberList = memberDAO.memberSelect(sqlSession);

        sqlSession.close();

        return memberList;
    }

    public boolean memberInsert(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();

        int result = memberDAO.memberInsert(sqlSession, member);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }


    public boolean memberUpdate(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();

        int result = memberDAO.memberUpdate(sqlSession, member);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean memberDelete(String member_id) {
        SqlSession sqlSession = getSqlSession();
        int result = memberDAO.memberDelete(sqlSession, member_id);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public MemberDTO memberSearchById(String member_id) {

        SqlSession sqlSession = getSqlSession();

        MemberDTO member = memberDAO.memberSearchById (sqlSession, member_id);

        sqlSession.close();

        return member;
    }

    public int checkLogin(String id, String password) {
        SqlSession sqlSession = Template.getSqlSession();

        int result = memberDAO.checkLogin(sqlSession, id, password);

        sqlSession.close();

        return result;
    }



    public String getMemberCodeAndName(MemberDTO login_member) {
        try (SqlSession sqlSession = Template.getSqlSession()) {
            System.out.println("서비스통과 getMemberCodeAndName");
            // 회원 코드와 이름을 가져오는 쿼리 실행
            MemberDTO memberDTO = memberDAO.getMemberCodeAndName(sqlSession, login_member);
            int memberCode = memberDTO.getMember_code();
            System.out.println(memberCode);
            return String.valueOf(memberCode);

        } catch (Exception e) {
            e.printStackTrace();


        }
         return null;
    }


}

