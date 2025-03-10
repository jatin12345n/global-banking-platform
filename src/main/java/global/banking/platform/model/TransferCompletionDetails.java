

package global.banking.platform.model;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * State of accounts after money transfer completion
 */

@Data
public class TransferCompletionDetails {

  private String from ;


  private BigDecimal fromBalance ;


  private String to ;


  private BigDecimal toBalance ;



  public TransferCompletionDetails from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Account id from which Transfer was initiated
   * @return from
  **/

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public TransferCompletionDetails fromBalance(BigDecimal fromBalance) {
    this.fromBalance = fromBalance;
    return this;
  }

   /**
   * Balance of the account from which Transfer was initiated after the transfer got completed
   * @return fromBalance
  **/

  public BigDecimal getFromBalance() {
    return fromBalance;
  }

  public void setFromBalance(BigDecimal fromBalance) {
    this.fromBalance = fromBalance;
  }

  public TransferCompletionDetails to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Account id to which Transfer was initiated
   * @return to
  **/

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public TransferCompletionDetails toBalance(BigDecimal toBalance) {
    this.toBalance = toBalance;
    return this;
  }

   /**
   * Balance of the account to which Transfer was initiated after the transfer got completed
   * @return toBalance
  **/

  public BigDecimal getToBalance() {
    return toBalance;
  }

  public void setToBalance(BigDecimal toBalance) {
    this.toBalance = toBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCompletionDetails transferCompletionDetails = (TransferCompletionDetails) o;
    return Objects.equals(this.from, transferCompletionDetails.from) &&
        Objects.equals(this.fromBalance, transferCompletionDetails.fromBalance) &&
        Objects.equals(this.to, transferCompletionDetails.to) &&
        Objects.equals(this.toBalance, transferCompletionDetails.toBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, fromBalance, to, toBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCompletionDetails {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromBalance: ").append(toIndentedString(fromBalance)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toBalance: ").append(toIndentedString(toBalance)).append("\n");
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

