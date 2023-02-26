package cuentas;

/**
 * Clase que define un objeto de tipo Cuenta
 * @author Christian Gómez Lozano
 *
 */

public class CCuenta {

	/**
	 * Atributos de la clase CCuenta
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor de la clase CCuenta
     * @param nom el nombre de la cuenta
     * @param cue el identificativo de la cuenta
     * @param sal el saldo de la cuenta
     * @param tipo el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Devuelve atributo nombre
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre introducido como parámetro
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el atributo cuenta
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece la cuenta introducida como parámetro
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el atributo saldo
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo introducido como parámetro
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el atributo interés
	 * @return the tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establece el tipo de interés introducido como parámetro
	 * @param tipoInterés the tipoInterés to set
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Devuelve el saldo
	 * @return el saldo de la cuenta
	 */
	public double estado()
    {
        return getSaldo();
    }
	
	/**
	 * Método que ingresa una cierta cantidad en la cuenta
	 * @param cantidad a ingresar 
	 * @throws Exception si la cantidad a ingresar es menor que 0
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método que retira una cierta cantidad de la cuenta
     * @param cantidad que se va a retirar
     * @throws Exception si la cantidad a retirar es negativa o es superior al saldo actual de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
