package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, length = 30)
    private long id;
    @Column(unique = true, length = 30)
    private String email;
    @OneToOne
    @JoinColumn(name="profile_Id", nullable = false)
    private PerfilEntity profile;
    @Column(name = "role", nullable = false, length = 30)
    private String role;
    @ManyToOne
    @JoinColumn(name = "enterprise")
    private EmpresaEntity enterprise;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MovimientoDineroEntity> transactions = new ArrayList<>();
    @Column(nullable = false)
    private Date updateAt;
    @Column(nullable = false)
    private Date createdAt;


    public EmpleadoEntity() {
    }

    public EmpleadoEntity(String email, PerfilEntity profile, String role, EmpresaEntity enterprise, List<MovimientoDineroEntity> transactions, Date updateAt, Date createdAt) {
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<MovimientoDineroEntity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<MovimientoDineroEntity> transactions) {
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
                "Id=" + id +
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