/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.entities.Consulta;
import edu.eci.pdsw.samples.entities.Paciente;
import edu.eci.pdsw.samples.services.ServiceFacadeException;
import edu.eci.pdsw.samples.services.ServicesFacade;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void registroPacienteTest(){
        
    }
    
    @Test
    public void registroConsultaTest() throws ServiceFacadeException{
        ServicesFacade sf= ServicesFacade.getInstance("applicationconfig.properties");
        Consulta c= new Consulta(new Date(2015,10,3),"resumen");
        Paciente p= new Paciente(2101240,"TU","Andres",new Date(1999,5,31));
        sf.registrarNuevoPaciente(p);
        sf.agregarConsultaAPaciente(2101240,"TU", c);
        assertTrue(sf.ConsultarAUnaConsulta(c.getId()).toString().equals(c.toString()));
        
    }
    
}
