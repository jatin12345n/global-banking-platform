package global.banking.platform.model;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * The information about new DataCatalog.
 */

@Data
public class CreateAccountDetails {

  private String id ;


  private BigDecimal balance ;

  public CreateAccountDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Account Identifier
   * @return id
  **/

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateAccountDetails balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Account balance
   * @return balance
  **/

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountDetails createAccountDetails = (CreateAccountDetails) o;
    return Objects.equals(this.id, createAccountDetails.id) &&
        Objects.equals(this.balance, createAccountDetails.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

