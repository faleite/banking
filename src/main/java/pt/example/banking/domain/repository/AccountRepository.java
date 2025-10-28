package pt.example.banking.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.example.banking.domain.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
