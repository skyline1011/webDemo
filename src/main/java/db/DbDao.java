package db;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class DbDao {

    public static void main(String[] args) {
        try {
            List<TestUser> users = query();
            System.out.println(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<TestUser> query() throws SQLException {
        QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from t_user_test";
        List<TestUser> list = (List<TestUser>) runner.query(sql, new BeanListHandler(TestUser.class));
        return list;
    }

}
