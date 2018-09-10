package app.modules.users.models;

import app.modules.core.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile extends AbstractEntity {

    @OneToOne(fetch= FetchType.LAZY)
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
