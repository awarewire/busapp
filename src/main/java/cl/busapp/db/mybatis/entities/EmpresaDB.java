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
public class EmpresaDB {

	@Expose
	@SerializedName("id")
	private Integer id;
	
	@Expose
	@SerializedName("rut")
	private String rut;
	
	@Expose
	@SerializedName("razon_social")
	private String razonSocial;
	
	@Expose
	@SerializedName("telefono")
	private String telefono;
	
	@Expose
	@SerializedName("correo")
	private String correo;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
