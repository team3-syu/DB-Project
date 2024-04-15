package Source_code.Component.Ingredient;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IngredientDAO {
    public List<IngredientDTO> selectAllIngredients(SqlSession sqlSession) {
        return sqlSession.selectList("IngredientMapper.selectAllIngredients");
    }

    public IngredientDTO getIngredientByCode(SqlSession sqlSession, String name) {
        return sqlSession.selectOne("IngredientMapper.getIngredientByCode", name);
    }

    public int insertIngredient(SqlSession sqlSession, IngredientDTO ingredient) {
        return sqlSession.insert("IngredientMapper.insertIngredient", ingredient);
    }

    public int updateIngredient(SqlSession sqlSession, IngredientDTO ingredient) {
        return sqlSession.update("IngredientMapper.updateIngredient", ingredient);
    }

    public int deleteIngredient(SqlSession sqlSession, int code) {
        return sqlSession.delete("IngredientMapper.deleteIngredient", code);
    }
}