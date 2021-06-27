package com.fon.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2020/5/27 9:40
 **/
@Entity
@Table(name = "account", schema = "finalterm", catalog = "")
public class AccountEntity {
    private String username;
    private String password;
    private String usertype;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "usertype")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntity entity = (AccountEntity) o;
        return Objects.equals(username, entity.username) &&
                Objects.equals(password, entity.password) &&
                Objects.equals(usertype, entity.usertype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, usertype);
    }
}
