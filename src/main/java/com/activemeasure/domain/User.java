package com.activemeasure.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Email
    @Size(max=255)
    private String email;

    @NotNull
    @Size(min=8, max=255)
    private String password;

    @Column(columnDefinition="DATETIME")
    private LocalDate createTime;

    @Column(columnDefinition="DATETIME")
    private LocalDate updateTime;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }
}
