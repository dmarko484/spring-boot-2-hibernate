package app.modules.users.repos;

import app.modules.users.models.Invoice;
import app.modules.users.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {



}
