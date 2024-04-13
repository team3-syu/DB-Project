package Source_code.Booking;

public class BookingDTO {
 private int book_code;
 private String book_date;
 private int mem_code;
 private String m_code;
 private int medi_count;
 private char book_status;

 private String mem_name;
 private String medi_name;

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public String getMedi_name() {
        return medi_name;
    }

    public void setMedi_name(String medi_name) {
        this.medi_name = medi_name;
    }

    public int getBook_code() {
        return book_code;
    }

    public void setBook_code(int book_code) {
        this.book_code = book_code;
    }

    public String getBook_date() {
        return book_date;
    }

    public void setBook_date(String book_date) {
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
