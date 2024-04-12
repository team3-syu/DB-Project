package Source_code.Component.Ingredient;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static Source_code.Component.Ingredient.Template.getSqlSession;

public class IngredientService {
    private final IngredientDAO ingredientDAO;

    public IngredientService() {
       ingredientDAO= new IngredientDAO();
    }


    public List<IngredientDTO> getAllIngredients() {
        SqlSession sqlSession = getSqlSession();

        List<IngredientDTO> menuList = ingredientDAO.selectAllIngredients(sqlSession);

        sqlSession.close();

        return menuList;
    }

    public static boolean insertIngredient(IngredientDTO ingredient) {
        SqlSession sqlSession = getSqlSession();

        int result = IngredientDAO.insertIngredient(sqlSession, ingredient);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public static boolean updateIngredient(IngredientDTO ingredient) {

        SqlSession sqlSession = getSqlSession();

        int result = IngredientDAO.updateIngredient(sqlSession,ingredient);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public static boolean deleteIngredient(int code) {
        SqlSession sqlSession = getSqlSession();

        int result = IngredientDAO.deleteIngredient(sqlSession, code);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public static IngredientDTO getIngredientByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        IngredientMapper ingredientMapper = sqlSession.getMapper(IngredientMapper.class);
        return ingredientMapper.getIngredientByCode(code);
    }
}
