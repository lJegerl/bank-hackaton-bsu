package bank.hackaton.app.domain;

import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Data
@Table(name = "banking_data")
public class BankingData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "date_of_birth", nullable = false)
    private String dateOfBirth; // Consider using LocalDate for better date handling

    @Column(nullable = false)
    private String address;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "tax_id", nullable = false)
    private String taxId;

    @Column(name = "account_number", nullable = false, unique = true)
    private String accountNumber;

    @Column(name = "transaction_history", columnDefinition = "json")
    private Map<String, Object> transactionHistory; // Use a Map to represent JSON data

    @Column(name = "account_balance", nullable = false)
    private BigDecimal accountBalance;

    @Column(name = "last_transaction_date")
    private Timestamp lastTransactionDate;

    @Column(name = "created_at", updatable = false, nullable = false)
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt = new Timestamp(System.currentTimeMillis());

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "branch_code", nullable = false)
    private String branchCode;

    @Column(name = "customer_segment")
    private String customerSegment;

    @Column(name = "transaction_frequency")
    private Integer transactionFrequency;

    @Column(name = "average_transaction_amount")
    private BigDecimal averageTransactionAmount;

    @Column(name = "account_age")
    private Integer accountAge;

    @Column(name = "preferred_channel")
    private String preferredChannel;

    @Column(name = "loan_amount")
    private BigDecimal loanAmount;

    @Column(name = "number_of_products")
    private Integer numberOfProducts;
}
