package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "Movimiento")
public class MovimientoDineroEntity {
    @Id
    @Column(unique = true, length = 30)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int Id;
    @Column(nullable = false, length = 50)
    private String concept;
    @Column(nullable = false, length = 50)
    private String amount;
    @ManyToOne
    @JoinColumn(name = "Usuario")
    private EmpleadoEntity user;
    @ManyToOne
    @JoinColumn(name = "Empresas")
    private EmpresaEntity enterprise;
    @Column(nullable = false)
    private Calendar createdAt;
    @Column(nullable = false)
    private Calendar updateAt;


    public MovimientoDineroEntity() {
    }

    public MovimientoDineroEntity(int id, String concept, String amount, EmpleadoEntity user, EmpresaEntity enterprise, Calendar createdAt, Calendar updateAt) {
        Id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public EmpleadoEntity getUser() {
        return user;
    }

    public void setUser(EmpleadoEntity user) {
        this.user = user;
    }

    public EmpresaEntity getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EmpresaEntity enterprise) {
        this.enterprise = enterprise;
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
        return "MovimientoDineroEntity{" +
                "Id=" + Id +
                ", concept='" + concept + '\'' +
                ", amount='" + amount + '\'' +
                ", user=" + user +
                ", enterprise=" + enterprise +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
