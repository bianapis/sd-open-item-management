package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OpenItemProcedureBase
 */
public class OpenItemProcedureBase   {
  private String openItemType = null;

  private String openItemDescription = null;

  private String productInstanceReference = null;

  private String partyReference = null;

  private String loanRepaymentSchedule = null;

  private String loanOutstandingBalance = null;

  private String loanTerminationDate = null;

  private String repaymentStatement = null;

  private String repaymentTransactionReference = null;

  private String transactionPayerReference = null;

  private String transactionPayerProductInstanceReference = null;

  private String transactionPayerBankReference = null;

  private String transactionType = null;

  private String transactionAmount = null;

  private String transactionCurrency = null;

  private String transactionValueDate = null;

  private String billingTransactionReference = null;

  private String billingParty = null;

  private String billingAddress = null;

  private String billingPeriod = null;

  private String billingStatement = null;

  private String billingAmount = null;

  private String paymentDueDate = null;

  private String openItemStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return openItemType
  **/

  public String getOpenItemType() {
    return openItemType;
  }

  public void setOpenItemType(String openItemType) {
    this.openItemType = openItemType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return openItemDescription
  **/

  public String getOpenItemDescription() {
    return openItemDescription;
  }

  public void setOpenItemDescription(String openItemDescription) {
    this.openItemDescription = openItemDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime     
   * @return loanRepaymentSchedule
  **/

  public String getLoanRepaymentSchedule() {
    return loanRepaymentSchedule;
  }

  public void setLoanRepaymentSchedule(String loanRepaymentSchedule) {
    this.loanRepaymentSchedule = loanRepaymentSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return loanOutstandingBalance
  **/

  public String getLoanOutstandingBalance() {
    return loanOutstandingBalance;
  }

  public void setLoanOutstandingBalance(String loanOutstandingBalance) {
    this.loanOutstandingBalance = loanOutstandingBalance;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return loanTerminationDate
  **/

  public String getLoanTerminationDate() {
    return loanTerminationDate;
  }

  public void setLoanTerminationDate(String loanTerminationDate) {
    this.loanTerminationDate = loanTerminationDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return repaymentStatement
  **/

  public String getRepaymentStatement() {
    return repaymentStatement;
  }

  public void setRepaymentStatement(String repaymentStatement) {
    this.repaymentStatement = repaymentStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return repaymentTransactionReference
  **/

  public String getRepaymentTransactionReference() {
    return repaymentTransactionReference;
  }

  public void setRepaymentTransactionReference(String repaymentTransactionReference) {
    this.repaymentTransactionReference = repaymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return transactionPayerReference
  **/

  public String getTransactionPayerReference() {
    return transactionPayerReference;
  }

  public void setTransactionPayerReference(String transactionPayerReference) {
    this.transactionPayerReference = transactionPayerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return transactionPayerProductInstanceReference
  **/

  public String getTransactionPayerProductInstanceReference() {
    return transactionPayerProductInstanceReference;
  }

  public void setTransactionPayerProductInstanceReference(String transactionPayerProductInstanceReference) {
    this.transactionPayerProductInstanceReference = transactionPayerProductInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return transactionPayerBankReference
  **/

  public String getTransactionPayerBankReference() {
    return transactionPayerBankReference;
  }

  public void setTransactionPayerBankReference(String transactionPayerBankReference) {
    this.transactionPayerBankReference = transactionPayerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return transactionAmount
  **/

  public String getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(String transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return transactionCurrency
  **/

  public String getTransactionCurrency() {
    return transactionCurrency;
  }

  public void setTransactionCurrency(String transactionCurrency) {
    this.transactionCurrency = transactionCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return transactionValueDate
  **/

  public String getTransactionValueDate() {
    return transactionValueDate;
  }

  public void setTransactionValueDate(String transactionValueDate) {
    this.transactionValueDate = transactionValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return billingTransactionReference
  **/

  public String getBillingTransactionReference() {
    return billingTransactionReference;
  }

  public void setBillingTransactionReference(String billingTransactionReference) {
    this.billingTransactionReference = billingTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name     
   * @return billingParty
  **/

  public String getBillingParty() {
    return billingParty;
  }

  public void setBillingParty(String billingParty) {
    this.billingParty = billingParty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name     
   * @return billingAddress
  **/

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration     
   * @return billingPeriod
  **/

  public String getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return billingStatement
  **/

  public String getBillingStatement() {
    return billingStatement;
  }

  public void setBillingStatement(String billingStatement) {
    this.billingStatement = billingStatement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return billingAmount
  **/

  public String getBillingAmount() {
    return billingAmount;
  }

  public void setBillingAmount(String billingAmount) {
    this.billingAmount = billingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return paymentDueDate
  **/

  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return openItemStatus
  **/

  public String getOpenItemStatus() {
    return openItemStatus;
  }

  public void setOpenItemStatus(String openItemStatus) {
    this.openItemStatus = openItemStatus;
  }


}

