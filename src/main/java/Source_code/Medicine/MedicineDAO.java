package Source_code.Medicine;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MedicineDAO {
    public List<MedicineDTO> selectAllMedicine(SqlSession sqlSession) {
        return sqlSession.selectList("MedicineMapper.selectAllMedicine");
    }

    public int insertMedicine(SqlSession sqlSession, MedicineDTO medicine) {
        return sqlSession.insert("MedicineMapper.insertMedicine", medicine);
    }


    public int updateMedicine(SqlSession sqlSession, MedicineDTO medicine) {
        return sqlSession.update("MedicineMapper.updateMedicine", medicine);
    }

    public int deleteMedicine(SqlSession sqlSession, String code) {
        return sqlSession.delete("MedicineMapper.deleteMedicine", code);
    }

    public List<MedicineDTO> selectNameMedicine(SqlSession sqlSession, String name) {
        return sqlSession.selectList("MedicineMapper.selectNameMedicine", name);
    }

    public List<MedicineDTO> selectComponentMedicine(SqlSession sqlSession, String component) {
        return sqlSession.selectList("MedicineMapper.selectComponentMedicine", component);
    }

    public List<MedicineDTO> selectEffectMedicine(SqlSession sqlSession, String effect) {
        return sqlSession.selectList("MedicineMapper.selectEffectMedicine", effect);
    }

    public List<MedicineDTO> selectSideEffectMedicine(SqlSession sqlSession, String sideEffect) {
        return sqlSession.selectList("MedicineMapper.selectSideEffectMedicine", sideEffect);
    }




}
