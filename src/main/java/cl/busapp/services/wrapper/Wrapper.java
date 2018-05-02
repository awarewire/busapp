/**
 * 
 */
package cl.busapp.services.wrapper;

import com.google.gson.annotations.Expose;

/**
 * @author jvalladares
 *
 */

import com.google.gson.annotations.SerializedName;

public abstract class Wrapper {
	
	@Expose
	@SerializedName("OK")
	protected boolean OK = true;

	@Expose
	@SerializedName("tiempo_respuesta")
	protected String tiempo_respuesta;

	@Expose
	@SerializedName("cantidad_resultados")
	protected int cantidad_resultados;

	@Expose
	@SerializedName("URL")
	protected String URL;

	@Expose
	protected Error error;

	@Expose
	@SerializedName("tipo_metodo")
	protected EnumTipoMetodo tipo_metodo;
	
	//@Expose(serialize = false, deserialize=false)
	private final Double inicio;
	
	/**
	 * 
	 */
	public Wrapper() {
		this.inicio = new Double((System.currentTimeMillis()/1000));
	}
	
	/**
	 * @param oK
	 * @param tiempo_respuesta
	 * @param cantidad_resultados
	 * @param uRL
	 * @param error
	 * @param tipo_metodo
	 * @param inicio
	 */
	public Wrapper(boolean oK, String tiempo_respuesta, int cantidad_resultados, String uRL, Error error,
			EnumTipoMetodo tipo_metodo, Double inicio) {
		super();
		OK = oK;
		this.tiempo_respuesta = tiempo_respuesta;
		this.cantidad_resultados = cantidad_resultados;
		URL = uRL;
		this.error = error;
		this.tipo_metodo = tipo_metodo;
		this.inicio = inicio;
	}



	/**
	 * @return the oK
	 */
	public boolean isOK() {
		return OK;
	}

	/**
	 * @param oK
	 *            the oK to set
	 */
	public void setOK(boolean oK) {
		OK = oK;
	}

	/**
	 * @return the tiempo_respuesta
	 */
	public String getTiempo_respuesta() {
		return tiempo_respuesta;
	}

	/**
	 * @param tiempo_respuesta
	 *            the tiempo_respuesta to set
	 */
	public void setTiempo_respuesta(String tiempo_respuesta) {
		this.tiempo_respuesta = tiempo_respuesta;
	}

	/**
	 * @return the cantidad_resultados
	 */
	public int getCantidad_resultados() {
		return cantidad_resultados;
	}
	
	public abstract String getWrapper();

	/**
	 * @param cantidad_resultados
	 *            the cantidad_resultados to set
	 */
	public void setCantidad_resultados(int cantidad_resultados) {
		this.cantidad_resultados = cantidad_resultados;
	}

	/**
	 * @return the URL
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * @param URL
	 *            the URL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}

	/**
	 * @return the error
	 */
	public Error getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(Error error) {
		this.error = error;
	}

	/**
	 * @return the tipo_metodo
	 */
	public EnumTipoMetodo getTipo_metodo() {
		return tipo_metodo;
	}

	/**
	 * @param tipo_metodo
	 *            the tipo_metodo to set
	 */
	public void setTipo_metodo(EnumTipoMetodo tipo_metodo) {
		this.tipo_metodo = tipo_metodo;
	}
	
	public double getTiempo(){
		return (System.currentTimeMillis()/1000) - inicio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Wrapper [OK=" + OK + ", tiempo_respuesta=" + tiempo_respuesta + ", cantidad_resultados="
				+ cantidad_resultados + ", URL=" + URL + ", error=" + error + ", tipo_metodo=" + tipo_metodo + "]";
	}

	
	public enum EnumTipoMetodo {
		GET,
		POST,
		PUT,
		DELETE;
	}
}
