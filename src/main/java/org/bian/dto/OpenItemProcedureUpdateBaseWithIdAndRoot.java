package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OpenItemProcedureUpdateBaseWithIdAndRoot
 */
public class OpenItemProcedureUpdateBaseWithIdAndRoot   {
  private String openItemUpdateReference = null;

  private String openItemReference = null;

  private String openItemType = null;

  private String openItemDescription = null;

  private String repaymentTransactionReference = null;

  private String transactionPayerReference = null;

  private String transactionPayerProductInstanceReference = null;

  private String transactionPayerBankReference = null;

  private String transactionType = null;

  private String transactionAmount = null;

  private String transactionCurrency = null;

  private String transactionValueDate = null;

  private String openItemStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return openItemUpdateReference
  **/

  public String getOpenItemUpdateReference() {
    return openItemUpdateReference;
  }

  public void setOpenItemUpdateReference(String openItemUpdateReference) {
    this.openItemUpdateReference = openItemUpdateReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return openItemReference
  **/

  public String getOpenItemReference() {
    return openItemReference;
  }

  public void setOpenItemReference(String openItemReference) {
    this.openItemReference = openItemReference;
  }


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

