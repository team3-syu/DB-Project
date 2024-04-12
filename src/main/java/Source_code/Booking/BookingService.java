package Source_code.Booking;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static Source_code.Booking.Template.getSqlSession;

public class BookingService {

    private final BookingDAO bookingDAO;

    public BookingService() {

        bookingDAO = new BookingDAO();

    }



    public List<BookingDTO> selectMyBook(){
        System.out.println("서비스 통과");
        SqlSession sqlSession = getSqlSession();
        System.out.println("sql연결");
        List<BookingDTO> bookList = bookingDAO.selectMyBook(sqlSession);

        sqlSession.close();

        return bookList;
    }


    public boolean insertMyBook(BookingDTO book) {

        SqlSession sqlSession = getSqlSession();

        int result = bookingDAO.insertMenu(sqlSession, book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
     }
    }











