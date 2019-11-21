package yurkovlyanets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import yurkovlyanets.Model.Order;

import java.sql.SQLException;
import java.time.Instant;
import java.util.List;

public class OrderDAO {
    private static final String SQL_ADD_ACTION =
            "insert into call_list (order_number, order_add_date) values (:ordernumber, :orderadddate)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Order> getAll(int ordernumber, Instant orderadddate) throws SQLException{
        return jdbcTemplate.query ( "select * from Order", new BeanPropertyRowMapper<>(Order.class));
    }

    public void addOrder(Order order) {
        jdbcTemplate.update(
                "insert into user_action (order_number, order_add_date)",
                order.getOrdernumber() , order.getOrderadddate()
        );
    }
}
