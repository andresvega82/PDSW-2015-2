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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.validation.constraints.AssertTrue;
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
        Set <Consulta> s = new HashSet<Consulta>();
        Consulta c= new Consulta(new Date(2015,10,3),"resumen");
        Paciente p= new Paciente(2101266,"TU","Andres",new Date(1999,5,31));
        s.add(c);
        p.setConsultas(s);
        sf.registrarNuevoPaciente(p);
        Paciente pn= sf.consultarPaciente(p.getId(),p.getTipo_id());
        Iterator<Consulta> i= pn.getConsultas().iterator();
        Iterator<Consulta> ii=p.getConsultas().iterator();
        while(i.hasNext() && ii.hasNext()){
            assertTrue(i.next().getId()==ii.next().getId());
        }
        
    }
    
}
