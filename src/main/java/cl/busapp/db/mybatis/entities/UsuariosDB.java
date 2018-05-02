/**
 * 
 */
package cl.busapp.db.mybatis.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author jvalladares
 *
 */
public class UsuariosDB {
	
	@Expose
	@SerializedName("id")
	private Integer id;
	
	@Expose
	@SerializedName("rut")
	private String rut;
	
	@Expose
	@SerializedName("nombre")
	private String nombre;
	
	@Expose
	@SerializedName("correo")
	private String correo;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
