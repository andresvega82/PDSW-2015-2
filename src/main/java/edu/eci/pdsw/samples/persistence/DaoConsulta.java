/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence;

import edu.eci.pdsw.samples.entities.Consulta;

/**
 *
 * @author user
 */
public interface DaoConsulta {
    
    
    public Consulta load(int id) throws PersistenceException;
    
    public void save(Consulta c) throws PersistenceException;
    
    public void update(Consulta c) throws PersistenceException;
    
}
