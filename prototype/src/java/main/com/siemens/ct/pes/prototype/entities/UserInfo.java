package com.siemens.ct.pes.prototype.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the "userInfo" database table.
 * 
 */
@Entity
@Table(schema = "prototype", name = "\"userInfo\"")
@NamedQuery(name = "UserInfo.findAll", query = "SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "USERINFO_ID_GENERATOR", sequenceName = "userInfo_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERINFO_ID_GENERATOR")
    private int id;

    private String description;

    private String name;

    public UserInfo() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}