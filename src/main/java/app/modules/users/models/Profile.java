package app.modules.users.models;

import app.modules.core.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile extends AbstractEntity {

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(
            name="user_id", unique=true, nullable=false, updatable=false)
    @JsonIgnore
    User user;

    String education;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
