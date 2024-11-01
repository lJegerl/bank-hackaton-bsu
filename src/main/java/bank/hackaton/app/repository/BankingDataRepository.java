package bank.hackaton.app.repository;

import bank.hackaton.app.domain.BankingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankingDataRepository extends JpaRepository<BankingData, Long> {
    Optional<BankingData> findByEmail(String email);
    Optional<BankingData> findByAccountNumber(String accountNumber);
}
