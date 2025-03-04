package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import datasource.MariaDbConnection;
import entity.Currency;

public class CurrencyDao {

    public int getCurrencyCountDB() {
        Connection connection = MariaDbConnection.getConnection();

        String sql = "SELECT COUNT(*) FROM CURRENCIES";
        int count = 0;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (SQLException e) {

        }

        return count;
    }

    public Currency getCurrency(int id) {
        Connection connection = MariaDbConnection.getConnection();

        String sql = "SELECT id, currencyCode, currencyName, conversionRate FROM CURRENCIES WHERE id=?";

        String currencyCode = null;
        String currencyName = null;
        double conversionRate = 0.0;
        int count = 0;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                count++;
                currencyCode = rs.getString(2);
                currencyName = rs.getString(3);
                conversionRate = rs.getDouble(4);
            }

        } catch (SQLException e) {

        }

        if (count == 1) {
            return new Currency(id, currencyCode, currencyName, conversionRate);
        } else {
            return null;
        }
    }
}
