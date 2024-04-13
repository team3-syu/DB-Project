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

    public List<MedicineDTO> selectNameMedicine(String name) {

        SqlSession sqlSession = getSqlSession();

        List<MedicineDTO> medicineList = medicineDAO.selectNameMedicine(sqlSession, name);

        sqlSession.close();

        return medicineList;
    }

    public List<MedicineDTO> selectComponentMedicine(String component) {

        SqlSession sqlSession = getSqlSession();

        List<MedicineDTO> medicineList = medicineDAO.selectComponentMedicine(sqlSession, component);

        sqlSession.close();

        return medicineList;
    }

    public List<MedicineDTO> selectEffectMedicine(String effect) {

        SqlSession sqlSession = getSqlSession();

        List<MedicineDTO> medicineList = medicineDAO.selectEffectMedicine(sqlSession, effect);

        sqlSession.close();

        return medicineList;
    }

    public List<MedicineDTO> selectSideEffectMedicine(String sideEffect) {

        SqlSession sqlSession = getSqlSession();

        List<MedicineDTO> medicineList = medicineDAO.selectSideEffectMedicine(sqlSession, sideEffect);

        sqlSession.close();

        return medicineList;
    }


}
