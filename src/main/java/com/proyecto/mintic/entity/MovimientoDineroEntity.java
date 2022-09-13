package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDineroEntity {
    @Id
    @Column(unique = true, length = 30)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long Id;
    @Column(nullable = false, length = 50)
    private String concept;
    @Column(nullable = false, length = 50)
    private String amount;
    @ManyToOne
    @JoinColumn(name = "empleadoId")
    private EmpleadoEntity empleado;
    @ManyToOne
    @JoinColumn(name = "empresad")
    private EmpresaEntity empresad;
    @Column(nullable = false)
    private Calendar createdAt;
    @Column(nullable = false)
    private Calendar updateAt;


    public MovimientoDineroEntity() {
    }

    public MovimientoDineroEntity(String concept, String amount, EmpleadoEntity empleado, EmpresaEntity empresad, Calendar createdAt, Calendar updateAt) {
        this.concept = concept;
        this.amount = amount;
        this.empleado = empleado;
        this.empresad = empresad;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
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

    public EmpleadoEntity getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoEntity empleado) {
        this.empleado = empleado;
    }

    public EmpresaEntity getEmpresad() {
        return empresad;
    }

    public void setEmpresad(EmpresaEntity empresad) {
        this.empresad = empresad;
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
                ", user=" + empleado +
                ", enterprise=" + empresad +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
