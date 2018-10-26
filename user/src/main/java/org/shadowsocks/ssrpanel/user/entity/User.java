package org.shadowsocks.ssrpanel.user.entity;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Objects;

/**
 *  User Entity
 */
@Entity
public class User {

    private Long id;

    private String username;

    private String password;

    private String email;

    private boolean isEnabled;

    private Timestamp regtime;

    private Timestamp logtime;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Timestamp getRegtime() {
        return regtime;
    }

    public void setRegtime(Timestamp regtime) {
        this.regtime = regtime;
    }

    public Timestamp getLogtime() {
        return logtime;
    }

    public void setLogtime(Timestamp logtime) {
        this.logtime = logtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isEnabled() == user.isEnabled() &&
                Objects.equals(getId(), user.getId()) &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getRegtime(), user.getRegtime()) &&
                Objects.equals(getLogtime(), user.getLogtime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPassword(), getEmail(), isEnabled(), getRegtime(), getLogtime());
    }

}
