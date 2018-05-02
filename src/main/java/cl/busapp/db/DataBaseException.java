/**
 * 
 */
package cl.busapp.db;

/**
 * 
 * Clase para el manejo de errores en las consultas en la base de datos
 * @author jvalladares
 *
 */
public class DataBaseException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public DataBaseException() {
		super();
	}

	/**
	 * Constructor
	 */
	public DataBaseException(String message) {
		super(message);
	}

	/**
	 * Constructor
	 */
	public DataBaseException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructor
	 */
	public DataBaseException(String message, Throwable cause) {
		super(message, cause);
	}
}
