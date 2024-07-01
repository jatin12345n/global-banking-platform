package global.banking.platform.repository;

import global.banking.platform.domain.Account;
import global.banking.platform.exception.DuplicateAccountIdException;

import java.util.List;

public interface AccountsRepository {

  void createAccount(Account account) throws DuplicateAccountIdException;

  Account getAccount(String accountId);
  List<Account> findAll();
  void clearAccounts();
}
