package Source_code.Medicine;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static Source_code.Medicine.Template.getSqlSession;

public class MedicineService {

    private final MedicineDAO medicineDAO;

    public MedicineService() { medicineDAO = new MedicineDAO();}

    public List<MedicineDTO> selectAllMedicine() {

        SqlSession sqlSession = getSqlSession();

        List<MedicineDTO> medicineList = medicineDAO.selectAllMedicine(sqlSession);

        sqlSession.close();

        return medicineList;
    }

    public boolean registMedicine(MedicineDTO medicine) {

        SqlSession sqlSession = getSqlSession();

        int result = medicineDAO.insertMedicine(sqlSession, medicine);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }


    public boolean modifyMedicine(MedicineDTO medicine) {
        SqlSession sqlSession = getSqlSession();

        int result = medicineDAO.updateMedicine(sqlSession, medicine);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteMedicine(String code) {
        SqlSession sqlSession = getSqlSession();

        int result = medicineDAO.deleteMedicine(sqlSession, code);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
}
