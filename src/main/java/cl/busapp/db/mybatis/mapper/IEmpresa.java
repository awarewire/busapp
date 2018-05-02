/**
 * 
 */
package cl.busapp.db.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cl.busapp.db.mybatis.entities.EmpresaDB;

/**
 * @author jvalladares
 *
 */
public interface IEmpresa {

	@Select("SELECT COUNT(*) FROM busapp_bd.empresa")
	public Integer getTotalEmpresas();

	@Select("Select * FROM empresas")
	public List<EmpresaDB> getListaEmpresas();
}
