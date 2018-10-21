package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OpenItemTrackingBase
 */
public class OpenItemTrackingBase   {
  private String openItemType = null;

  private String openItemDescription = null;

  private String billingTransactionReference = null;

  private String billingParty = null;

  private String billingAddress = null;

  private String billingPeriod = null;

  private Object billingStatement = null;

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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return billingStatement
  **/

  public Object getBillingStatement() {
    return billingStatement;
  }

  public void setBillingStatement(Object billingStatement) {
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

