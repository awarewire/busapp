/**
 * 
 */
package cl.busapp.db.mybatis.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cl.busapp.db.DataBaseException;
import cl.busapp.db.mybatis.entities.EmpresaDB;
import cl.busapp.db.mybatis.entities.UsuariosDB;
import cl.busapp.db.mybatis.mapper.IEmpresa;

/**
 * @author jvalladares
 *
 */
public class EmpresaDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmpresaDAO.class);

	@Autowired
	IEmpresa iEmpresa;
	
	public int getTotalEmpresa() throws DataBaseException{
		try {
			return iEmpresa.getTotalEmpresas();
		} catch (Exception e) {
			LOGGER.error("Error al obtener el total de usuarios");
			throw new DataBaseException(e);
		}
	}
	
	public List<EmpresaDB> getListaEmpresas() throws DataBaseException{
		try {
			return iEmpresa.getListaEmpresas();
		} catch (Exception e) {
			LOGGER.error("Error al obtener los usuarios");
			throw new DataBaseException(e);
		}
		
	}
	
}
