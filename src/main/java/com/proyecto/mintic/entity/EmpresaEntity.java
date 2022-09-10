package com.proyecto.mintic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Empresa")
public class EmpresaEntity {

    @Id
    @Column(unique = true, length = 30)
    private int Id;
    @Column(unique = true, length = 30)
    private String name;
    @Column(unique = true, length = 30)
    private String document;
    @Column(nullable = false, length = 30)
    private String phone;
    @Column(nullable = false, length = 30)
    private String address;
    @Column(nullable = false, length = 100)
    private String users;
    @Column(nullable = false, length = 100)
    private String transactions;
    @Column(nullable = false)
    private Date createdAt;
    @Column(nullable = false)
    private Date updateAt;

    public EmpresaEntity() {
    }

    public EmpresaEntity(int id, String name, String document, String phone, String address, String users, String transactions, Date createdAt, Date updateAt) {
        Id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
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

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
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
                ", users='" + users + '\'' +
                ", transactions='" + transactions + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}