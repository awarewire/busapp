/**
 * 
 */
package cl.busapp.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cl.busapp.db.mybatis.mapper.IUsuarios;


/**
 * @author jvalladares
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="spring-config-test.xml")
public class TestDB {

	//@Autowired
	//IUsuarios usuario;
	
	@Test
	public void testMapper() {
		System.out.println("Test");
		//int totalUsuarios = usuario.getTotalUsuarios();
		//System.out.println("Total de usuarios" + totalUsuarios);
	}
	
}
