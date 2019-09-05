package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRatesRetrieveOutputModelBankRatesInstanceRecord
 */
public class BQBankRatesRetrieveOutputModelBankRatesInstanceRecord   {
  private String bankRateType = null;

  private String bankRateValue = null;

  private String bankRateValueDate = null;

  private String bankRateValueHistory = null;

  private String bankRateRecordReference = null;

  private Object bankRateRecord = null;

  private String bankRateRecordDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of bank interest or currency rate that is to be applied in production (e.g. bank's consumer mortgage rate) 
   * @return bankRateType
  **/

  public String getBankRateType() {
    return bankRateType;
  }

  public void setBankRateType(String bankRateType) {
    this.bankRateType = bankRateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current value (value range if appropriate) to apply 
   * @return bankRateValue
  **/

  public String getBankRateValue() {
    return bankRateValue;
  }

  public void setBankRateValue(String bankRateValue) {
    this.bankRateValue = bankRateValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The key date and time values associated with the rate 
   * @return bankRateValueDate
  **/

  public String getBankRateValueDate() {
    return bankRateValueDate;
  }

  public void setBankRateValueDate(String bankRateValueDate) {
    this.bankRateValueDate = bankRateValueDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Historical values (maintained for back testing, corrections etc.) 
   * @return bankRateValueHistory
  **/

  public String getBankRateValueHistory() {
    return bankRateValueHistory;
  }

  public void setBankRateValueHistory(String bankRateValueHistory) {
    this.bankRateValueHistory = bankRateValueHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the distributed record containing the prevailing bank rates 
   * @return bankRateRecordReference
  **/

  public String getBankRateRecordReference() {
    return bankRateRecordReference;
  }

  public void setBankRateRecordReference(String bankRateRecordReference) {
    this.bankRateRecordReference = bankRateRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of the prevailing bank rates 
   * @return bankRateRecord
  **/

  public Object getBankRateRecord() {
    return bankRateRecord;
  }

  public void setBankRateRecord(Object bankRateRecord) {
    this.bankRateRecord = bankRateRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Date and time stamp for rate value record 
   * @return bankRateRecordDate
  **/

  public String getBankRateRecordDate() {
    return bankRateRecordDate;
  }

  public void setBankRateRecordDate(String bankRateRecordDate) {
    this.bankRateRecordDate = bankRateRecordDate;
  }


}

