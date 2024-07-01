package global.banking.platform.service;

import global.banking.platform.domain.Account;

public interface NotificationService {

  void notifyAboutTransfer(Account account, String transferDescription);
}
