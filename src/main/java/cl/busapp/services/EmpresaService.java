/**
 * 
 */
package cl.busapp.services;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cl.busapp.db.DataBaseException;
import cl.busapp.db.mybatis.dao.EmpresaDAO;
import cl.busapp.db.mybatis.dao.UsuarioDAO;
import cl.busapp.db.mybatis.entities.EmpresaDB;
import cl.busapp.db.mybatis.entities.UsuariosDB;
import cl.busapp.services.wrapper.Wrapper;
import cl.busapp.services.wrapper.WrapperGenerico;

/**
 * @author jvalladares
 *
 */
@Service
@Path("/empresa")
public class EmpresaService {

	private static final String CHARSET_UTF_8 = ";charset=utf-8";
	
	private static Logger LOGGER = LoggerFactory.getLogger(EmpresaService.class);
	private Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

	
	@Autowired
	EmpresaDAO empresaDAO;
	
	@GET
	@Path("/cantidad-total")
	@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF_8)
	public String totalUsuarios() {
		WrapperGenerico wrapper = new WrapperGenerico();
		int totalUsuario;
		try {
			totalUsuario = empresaDAO.getTotalEmpresa();
			wrapper.setData(totalUsuario);
			LOGGER.info("total de usuario " + totalUsuario);
		} catch (DataBaseException e) {
			LOGGER.error("Error", e);
		}
		
		return this.getWrapper(wrapper);
	}
	
	@GET
	@Path("/lista-empresa")
	@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF_8)
	public String usuarios() {
		WrapperGenerico wrapper = new WrapperGenerico();
		try {
			List<EmpresaDB> listUsuarios = empresaDAO.getListaEmpresas();
			LOGGER.info("total de usuario " + listUsuarios.size());
			wrapper.setData(listUsuarios);
			String jsonWrapper = this.getWrapper(wrapper);
			return jsonWrapper;
		} catch (DataBaseException e) {
			LOGGER.error("Error", e);
			wrapper.setOK(false);
			wrapper.setError(new Error(e));
		}
		return gson.toJson(wrapper);
	}
	
	
	/**
	 * Metodo que genera el Wrapper
	 * @param wrapper
	 * @param tipoPaqueteEnum
	 * @return
	 */
	private String getWrapper(Wrapper wrapper) {
		return wrapper.getWrapper();
	}
}
