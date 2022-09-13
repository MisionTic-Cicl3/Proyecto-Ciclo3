package com.proyecto.mintic.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Perfil")
public class PerfilEntity {

    @Id
    @Column(unique = true, length = 30)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    @Column(nullable = false,length = 30)
    private String image;
    @Column(nullable = false,length = 30)
    private String phone;
    @OneToOne
    @JoinColumn(name = "User_ID")
    private EmpleadoEntity user;
    @Column(nullable = false)
    private Calendar createdAt;
    @Column(nullable = false)
    private Calendar updateAt;


    public PerfilEntity(){
    }

    public PerfilEntity(String image, String phone, EmpleadoEntity user, Calendar createdAt, Calendar updateAt) {
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
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

    public EmpleadoEntity getUser() {
        return user;
    }

    public void setUser(EmpleadoEntity user) {
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
