package Source_code.Booking;

import java.util.Date;

public class BookingDTO {
 private int book_code;
 private Date book_date;
 private int mem_code;
 private String m_code;
 private int medi_count;
 private char book_status;

    public int getBook_code() {
        return book_code;
    }

    public void setBook_code(int book_code) {
        this.book_code = book_code;
    }

    public Date getBook_date() {
        return book_date;
    }

    public void setBook_date(Date book_date) {
        this.book_date = book_date;
    }

    public int getMem_code() {
        return mem_code;
    }

    public void setMem_code(int mem_code) {
        this.mem_code = mem_code;
    }

    public String getM_code() {
        return m_code;
    }

    public void setM_code(String m_code) {
        this.m_code = m_code;
    }

    public int getMedi_count() {
        return medi_count;
    }

    public void setMedi_count(int medi_count) {
        this.medi_count = medi_count;
    }

    public char getBook_status() {
        return book_status;
    }

    public void setBook_status(char book_status) {
        this.book_status = book_status;
    }
}
