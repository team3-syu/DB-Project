package Source_code.Component.Ingredient;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static Source_code.Component.Ingredient.Template.getSqlSession;

public class IngredientService {
    private final IngredientDAO ingredientDAO;

    public IngredientService() {
        ingredientDAO= new IngredientDAO();
    }


    public List<IngredientDTO> selectAllIngredients() {
        SqlSession sqlSession = Source_code.Component.Ingredient.Template.getSqlSession();

        List<IngredientDTO> menuList = ingredientDAO.selectAllIngredients(sqlSession);

        sqlSession.close();

        return menuList;
    }

    public boolean insertIngredient(IngredientDTO ingredient) {
        SqlSession sqlSession = Source_code.Component.Ingredient.Template.getSqlSession();

        int result = ingredientDAO.insertIngredient(sqlSession, ingredient);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public boolean updateIngredient(IngredientDTO ingredient) {

        SqlSession sqlSession = Source_code.Component.Ingredient.Template.getSqlSession();

        int result = ingredientDAO.updateIngredient(sqlSession,ingredient);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public boolean deleteIngredient(int code) {
        SqlSession sqlSession = Source_code.Component.Ingredient.Template.getSqlSession();


        int result = ingredientDAO.deleteIngredient(sqlSession, code);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }
    public IngredientDTO getIngredientByCode(String component) {
        SqlSession sqlSession = Source_code.Component.Ingredient.Template.getSqlSession();
        IngredientDTO ingredient = ingredientDAO.getIngredientByCode(sqlSession, component);
        sqlSession.close();
        return ingredient;
    }
}
