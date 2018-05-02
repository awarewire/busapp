/**
 * 
 */
package cl.busapp.db.mybatis.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cl.busapp.db.DataBaseException;
import cl.busapp.db.mybatis.entities.UsuariosDB;
import cl.busapp.db.mybatis.mapper.IUsuarios;

/**
 * @author jvalladares
 *
 */
public class UsuarioDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioDAO.class);

	@Autowired
	IUsuarios iUsuarios;
	
	public int getTotalUsuarios() throws DataBaseException{
		try {
			return iUsuarios.getTotalUsuarios();
		} catch (Exception e) {
			LOGGER.error("Error al obtener el total de usuarios");
			throw new DataBaseException(e);
		}
	}
	
	public List<UsuariosDB> getListaUsuarios() throws DataBaseException{
		try {
			return iUsuarios.getListaUsuarios();
		} catch (Exception e) {
			LOGGER.error("Error al obtener los usuarios");
			throw new DataBaseException(e);
		}
		
	}
	
}
