package com.activemeasure.domain;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
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
    private LocalDate updateTime;

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

    public LocalDate getUpdateTime() {
        return updateTime;
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

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }
}

