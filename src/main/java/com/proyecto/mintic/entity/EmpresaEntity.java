package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Empresa")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, length = 30)
    private long Id;
    @Column(unique = true, length = 30)
    private String name;
    @Column(unique = true, length = 30)
    private String document;
    @Column(nullable = false, length = 30)
    private String phone;
    @Column(nullable = false, length = 30)
    private String address;
    @OneToMany(mappedBy = "enterprise", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EmpleadoEntity> empleado = new ArrayList<>();
    @OneToMany(mappedBy = "empresad", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MovimientoDineroEntity> transactions = new ArrayList<>();
    @Column(nullable = false)
    private Calendar createdAt;
    @Column(nullable = false)
    private Calendar updateAt;

    public EmpresaEntity() {
    }


    public EmpresaEntity(String name, String document, String phone, String address, List<EmpleadoEntity> empleado, List<MovimientoDineroEntity> transactions, Calendar createdAt, Calendar updateAt) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.empleado = empleado;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public List<MovimientoDineroEntity> getTransactions() {
        return transactions;
    }

    public List<EmpleadoEntity> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<EmpleadoEntity> empleado) {
        this.empleado = empleado;
    }

    public void setTransactions(List<MovimientoDineroEntity> transactions) {
        this.transactions = transactions;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public Calendar getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Calendar updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "EmpresaEntity{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", empleado=" + empleado +
                ", transactions=" + transactions +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}