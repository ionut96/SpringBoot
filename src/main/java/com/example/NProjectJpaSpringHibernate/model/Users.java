package com.example.NProjectJpaSpringHibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users", catalog = "TestProject")
public class Users {

    @Id
    @Column(name="idUser")
    private Integer idUser;

    @Column(name="name")
    private String name;

    @Column(name="job")
    private String job;

    @Column(name="salary")
    private Integer salary;


    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
