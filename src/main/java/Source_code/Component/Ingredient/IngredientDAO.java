package Source_code.Component.Ingredient;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IngredientDAO {
    public static List<IngredientDTO> selectAllIngredients(SqlSession sqlSession) {
        return sqlSession.selectList("IngredientMapper.selectAllIngredients");
    }

    public IngredientDTO selectIngredientByCode(SqlSession sqlSession, int code) {
        return sqlSession.selectOne("IngredientMapper.selectIngredientByCode", code);
    }

    public static int insertIngredient(SqlSession sqlSession, IngredientDTO ingredient) {
        return sqlSession.insert("IngredientMapper.insertIngredient", ingredient);
    }

    public static int updateIngredient(SqlSession sqlSession, IngredientDTO ingredient) {
        return sqlSession.update("IngredientMapper.updateIngredient", ingredient);
    }

    public static int deleteIngredient(SqlSession sqlSession, int code) {
        return sqlSession.delete("IngredientMapper.deleteIngredient", code);
    }
}