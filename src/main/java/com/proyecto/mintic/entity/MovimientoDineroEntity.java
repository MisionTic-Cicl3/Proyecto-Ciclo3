package com.proyecto.mintic.entity;

public class MovimientoDineroEntity {
    // Atrubutos
    private Integer monto;
    private String concepto;
    private String usuario;

    // constructor


    public MovimientoDineroEntity() {

    }

    public MovimientoDineroEntity(Integer monto, String concepto, String usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }
    // Getter y setter


    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
