package app.modules.users.repos;

import app.modules.users.models.Company;
import app.modules.users.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {



}
