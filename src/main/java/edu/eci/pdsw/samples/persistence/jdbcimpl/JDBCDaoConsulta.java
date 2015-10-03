/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.jdbcimpl;

import edu.eci.pdsw.samples.entities.Consulta;
import edu.eci.pdsw.samples.persistence.DaoConsulta;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class JDBCDaoConsulta implements DaoConsulta {
    
    Connection con;

    public JDBCDaoConsulta(Connection con) {
        this.con = con;
    }


    @Override
    public Consulta load(int id) throws PersistenceException {
        return null;
    }

    @Override
    public void save(Consulta c) throws PersistenceException {
        
    }

    @Override
    public void update(Consulta c) throws PersistenceException {
        
    }
    
}
