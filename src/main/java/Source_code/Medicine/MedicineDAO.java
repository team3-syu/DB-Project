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

}
