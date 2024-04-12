package Source_code.Booking;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookingDAO {

    public List<BookingDTO> selectMyBook(SqlSession sqlSession) {
        System.out.println("dao 접근");
        return sqlSession.selectList("BookMapper.selectMyBook");
    }

    public int insertMenu(SqlSession sqlSession, BookingDTO book) {
        return sqlSession.insert("BookMapper.insertMenu", book);
    }

    public int updateMenu(SqlSession sqlSession, BookingDTO menu) {
        return sqlSession.update("MenuMapper.updateMenu", menu);
    }

}
