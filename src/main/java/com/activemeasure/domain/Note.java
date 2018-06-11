package com.activemeasure.domain;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name="notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(max=50)
    private String title;

    @NonNull
    @Size(max=1000)
    private String note;

    @Column(columnDefinition="DATETIME")
    private LocalDate createTime;

    @Column(columnDefinition="DATETIME")
    private LocalDate lastUpdateTime;

    @NotNull
    private String email;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public LocalDate getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public void setLastUpdateTime(LocalDate lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

