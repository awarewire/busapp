/**
 * 
 */
package cl.busapp.db.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cl.busapp.db.mybatis.entities.UsuariosDB;

/**
 * @author jvalladares
 *
 */
public interface IUsuarios {
	
	@Select("SELECT COUNT(*) FROM busapp_bd.usuarios")
	public Integer getTotalUsuarios();

	@Select("Select * FROM usuarios")
	public List<UsuariosDB> getListaUsuarios();
	
}
