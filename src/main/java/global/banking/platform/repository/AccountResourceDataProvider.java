package global.banking.platform.repository;


import global.banking.platform.domain.Account;
import global.banking.platform.exception.IllegalAmountException;
import global.banking.platform.exception.InsufficientFundsException;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public class AccountResourceDataProvider {

    @Getter
    private final AccountsRepository accountsRepository;

    @Autowired
    public AccountResourceDataProvider(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    public void credit(String id, BigDecimal amount) {
        Account account = accountsRepository.getAccount(id);
        validateAmount(amount);
        account.setBalance(account.getBalance().add(amount));
    }

    public void debit(String id, BigDecimal amount) {
        Account account = accountsRepository.getAccount(id);
        validateAmount(amount);
        if (account.getBalance().compareTo(amount) < 0) {
            throw new InsufficientFundsException(
                    String.format(
                            "Account %s has funds %s which are insufficient to complete the transaction for amount %s",
                            id, account.getBalance(), amount
                    )
            );
        }
        account.setBalance(account.getBalance().subtract(amount));
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null || BigDecimal.ZERO.compareTo(amount) > 0) {
            throw new IllegalAmountException(String.format("Transaction with amount %s not allowed", amount));
        }
    }
}
