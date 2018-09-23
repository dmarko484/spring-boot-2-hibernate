package app.modules.users.repos;

import app.modules.users.models.Profile;
import app.modules.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {



}
