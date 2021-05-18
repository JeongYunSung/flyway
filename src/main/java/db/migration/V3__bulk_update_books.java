package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.ResultSet;
import java.sql.Statement;

public class V3__bulk_update_books extends BaseJavaMigration {

    @Override
    public void migrate(Context context) throws Exception {
        try(Statement statement = context.getConnection().createStatement()) {

            try(ResultSet rs = statement.executeQuery("select id from books order by id")) {
                while(rs.next()) {
                    int id = rs.getInt(1);
                    String name = "홍길동";
                    try (Statement update = context.getConnection().createStatement()) {
                        update.execute("update books set author = '" + name + "' where id = " + id);
                    }
                }
            }
        }
    }
}
