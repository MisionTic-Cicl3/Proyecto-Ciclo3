package com.proyecto.mintic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class EmpresaEntity {
    // Atributos
    @Id
    @Column(unique = true, length = 30)
    private String nombreEmpresa;
    @Column(unique = true, length = 30)
    private String direccionEmpresa;
    @Column(unique = true, length = 30)
    private  String telefonoEmpresa;
    @Column(unique = true, length = 30)
    private String nitEmpresa;
    @Column(nullable = true)
    private int no_page;

    // Constructor
    public EmpresaEntity() {
    }

    public EmpresaEntity(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa, int no_page) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.no_page = no_page;
    }

    // Getter y setter

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public int getNo_page() {
        return no_page;
    }

    public void setNo_page(int no_page) {
        this.no_page = no_page;
    }
}
