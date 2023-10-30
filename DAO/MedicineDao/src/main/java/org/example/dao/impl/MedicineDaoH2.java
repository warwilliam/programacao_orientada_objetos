package org.example.dao.impl;

import org.example.dao.config.ConfigJDBC;
import org.example.dao.IDao;
import org.example.model.Medicine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MedicineDaoH2 implements IDao<Medicine> {

    private ConfigJDBC configJDBC;


    public MedicineDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Medicine save(Medicine medicine) throws Exception {

        Connection connection = configJDBC.connectWithDB();
        Statement statement = null;

        String query = String.format(
                "INSERT INTO MEDICINE " +
                        "(name, laboratory, quantity, price) " +
                        "VALUES ('%s', '%s', '%s', '%s')",
                medicine.getName(),
                medicine.getLaboratory(),
                medicine.getQuantity(),
                medicine.getPrice());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next())
                medicine.setId(keys.getInt(1));

        }catch (Exception e){
            e.printStackTrace();
        }

        return medicine;
    }
}
