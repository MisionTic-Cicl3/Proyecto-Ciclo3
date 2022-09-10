package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Perfil")
public class PerfilEntity {

    @Id
    @Column(unique = true, length = 30)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(nullable = false,length = 30)
    private String image;
    @Column(nullable = false,length = 30)
    private String phone;
    @Column(nullable = false,length = 30)
    private String user;
    @Column(nullable = false)
    private Calendar createdAt;
    @Column(nullable = false)
    private Calendar updateAt;


    public PerfilEntity(){
    }

    public PerfilEntity(Integer id, String image, String phone, String user, Calendar createdAt, Calendar updateAt) {
        Id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
        return "PerfilEntity{" +
                "Id=" + Id +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", user='" + user + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
