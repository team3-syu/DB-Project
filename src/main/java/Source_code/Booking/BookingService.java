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

        SqlSession sqlSession = getSqlSession();

        List<BookingDTO> bookList = bookingDAO.selectMyBook(sqlSession);

        sqlSession.close();

        return bookList;
    }

    public List<BookingDTO> selectMemberBook(BookingDTO book){

        book.getMem_code();

        SqlSession sqlSession = getSqlSession();

        List<BookingDTO> bookList = bookingDAO.selectMemberBook(sqlSession,book);

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

    public boolean deleteMyBook(BookingDTO book) {

        SqlSession sqlSession = getSqlSession();

        int result = bookingDAO.deleteBook(sqlSession, book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean updateMyBook(BookingDTO book) {

        SqlSession sqlSession = getSqlSession();

        int result = bookingDAO.updateBook(sqlSession, book);

        if (result > 0) {
            bookingDAO.findBookAmount(sqlSession,book);
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
    }











