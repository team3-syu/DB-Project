package Source_code.Booking;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookingDAO {

    public List<BookingDTO> selectMyBook(SqlSession sqlSession) {

        return sqlSession.selectList("BookMapper.selectMyBook");
    }

    public List<BookingDTO> selectMemberBook(SqlSession sqlSession,BookingDTO book) {


        return sqlSession.selectList("BookMapper.selectMemberBook",book);
    }

    public int insertMenu(SqlSession sqlSession, BookingDTO book) {

        return sqlSession.insert("BookMapper.insertMenu", book);

    }

    public int deleteBook(SqlSession sqlSession, BookingDTO book) {


        return sqlSession.delete("BookMapper.deleteMenu", book);

    }

    public int updateBook(SqlSession sqlSession, BookingDTO book) {


        return sqlSession.update("BookMapper.updateBook", book);

    }

    public List<BookingDTO> findBookAmount(SqlSession sqlSession,BookingDTO book){

        sqlSession.selectList("BookMapper.updateBook",book);


        return sqlSession.selectList("BookMapper.updateBook",book);

    }



}
