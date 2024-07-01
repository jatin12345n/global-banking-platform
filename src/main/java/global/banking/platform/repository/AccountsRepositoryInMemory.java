package global.banking.platform.repository;

import global.banking.platform.domain.Account;
import global.banking.platform.exception.AccountDoesNotExistException;
import global.banking.platform.exception.DuplicateAccountIdException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class AccountsRepositoryInMemory implements AccountsRepository {

    private final Map<String, Account> accounts = new ConcurrentHashMap<>();

    @Override
    public void createAccount(Account account) throws DuplicateAccountIdException {
        Account previousAccount = accounts.putIfAbsent(account.getAccountId(), account);
        if (previousAccount != null) {
            throw new DuplicateAccountIdException(
                    "Account id " + account.getAccountId() + " already exists!");
        }
    }

    @Override
    public Account getAccount(String accountId) {
        if(accounts.containsKey(accountId)) {
            return accounts.get(accountId);
        }
        else {
            throw new AccountDoesNotExistException("Account is not found");
        }
    }
    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accounts.values());
    }
    @Override
    public void clearAccounts() {
        accounts.clear();
    }

}
