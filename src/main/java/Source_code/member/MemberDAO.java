package Source_code.member;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class MemberDAO {

    public List<MemberDTO> memberSelect(SqlSession sqlSession) {

        return sqlSession.selectList("MemberMapper.selectMember");
    }

    public int memberInsert (SqlSession sqlSession, MemberDTO member) {
        return sqlSession.insert("MemberMapper.memberInsert", member);
    }

    public int memberUpdate (SqlSession sqlSession, MemberDTO member) {
        return sqlSession.update("MemberMapper.memberUpdate", member);
    }

    public int memberDelete (SqlSession sqlSession, String member_id ) {
        return sqlSession.delete("MemberMapper.memberDelete", member_id);
    }

    public MemberDTO memberSearchById(SqlSession sqlSession, String member_id) {
        return sqlSession.selectOne("MemberMapper.memberSearchById", member_id);

    }

    public int checkLogin(SqlSession sqlSession, String member_id, String member_password) {
        return sqlSession.selectOne("MemberMapper.checkLogin", Map.of("member_id", member_id, "member_password", member_password));

}


    public Map<String, String> getMemberCodeAndName(SqlSession sqlSession) {
        System.out.println("DAO통과 getMemberCodeAndName");
        return sqlSession.selectOne("MemberMapper.getMemberCodeAndName");
    }
}