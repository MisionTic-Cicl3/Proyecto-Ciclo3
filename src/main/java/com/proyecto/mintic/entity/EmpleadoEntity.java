package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Empleado")
public class EmpleadoEntity {

    @Id
    @Column(unique = true, length = 30)
    private int Id;
    @Column(unique = true, length = 30)
    private String email;
    @OneToOne
    @JoinColumn(name="user")
    private PerfilEntity profile;
    @Column(nullable = false, length = 30)
    private String role;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    private EmpresaEntity enterprise;

    @OneToMany
    @JoinColumn(name="transaction")
    private MovimientoDineroEntity transactions;
    @Column(nullable = false)
    private Date updateAt;
    @Column(nullable = false)
    private Date createdAt;


    public EmpleadoEntity() {
    }

    public EmpleadoEntity(int id, String email, PerfilEntity profile, String role, EmpresaEntity enterprise, MovimientoDineroEntity transactions, Date updateAt, Date createdAt) {
        Id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PerfilEntity getProfile() {
        return profile;
    }

    public void setProfile(PerfilEntity profile) {
        this.profile = profile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public EmpresaEntity getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EmpresaEntity enterprise) {
        this.enterprise = enterprise;
    }

    public MovimientoDineroEntity getTransactions() {
        return transactions;
    }

    public void setTransactions(MovimientoDineroEntity transactions) {
        this.transactions = transactions;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "EmpleadoEntity{" +
                "Id=" + Id +
                ", email='" + email + '\'' +
                ", profile='" + profile + '\'' +
                ", role='" + role + '\'' +
                ", enterprise='" + enterprise + '\'' +
                ", transactions='" + transactions + '\'' +
                ", updateAt=" + updateAt +
                ", createdAt=" + createdAt +
                '}';
    }
}