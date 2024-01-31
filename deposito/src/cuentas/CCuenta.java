package cuentas;
/**
 * La clase CCuenta representa una cuenta bancaria con información sobre el titular,
 * número de cuenta, saldo y tipo de interés.
 */

public class CCuenta {


	/** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número de cuenta. */
    private String cuenta;

    /** Saldo actual de la cuenta. */
    private double saldo;

    /** Tipo de interés de la cuenta. */
    private double tipoInterés;

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return El tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el número de cuenta.
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el saldo actual de la cuenta.
     * @param saldo El saldo actual.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInterés El tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor sin parámetros de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.
     * @param nom Nombre del titular.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el estado actual de la cuenta (saldo actual).
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}