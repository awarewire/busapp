/**
 * 
 */
package cl.busapp.services.wrapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author jvalladares
 *
 */
public class WrapperGenerico  extends Wrapper{

	@Expose
	@SerializedName("data")
	private Object data;
	
	/**
	 * 
	 */
	public WrapperGenerico() {
		super();
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}



	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}



	/* (non-Javadoc)
	 * @see cl.busapp.services.wrapper.Wrapper#getWrapper()
	 */
	@Override
	public String getWrapper() {
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		this.setCantidad_resultados(data != null ? 1 : 0);
		this.setTiempo_respuesta(this.getTiempo() + " segundos");
		return gson.toJson(this);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WrapperGenerico [data=" + data + ", OK=" + OK
				+ ", tiempo_respuesta=" + tiempo_respuesta + ", cantidad_resultados=" + cantidad_resultados + ", URL="
				+ URL + ", error=" + error + ", tipo_metodo=" + tipo_metodo + "]";
	}
	
}
