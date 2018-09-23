package app.modules.users.repos;

import app.modules.users.models.Company;
import app.modules.users.models.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, Long> {



}
