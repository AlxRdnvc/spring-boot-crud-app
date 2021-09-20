package com.alxrdnvc.crudapp.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "nationality")
public class Nationality {

    @Id
    private Integer Id;
    private String name;
    private String captial;
    private String updatedBy;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedOn;

    public Nationality () {

    }

    public Nationality(Integer id, String name, String captial, String updatedBy, Date updatedOn) {
        Id = id;
        this.name = name;
        this.captial = captial;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaptial() {
        return captial;
    }

    public void setCaptial(String captial) {
        this.captial = captial;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
