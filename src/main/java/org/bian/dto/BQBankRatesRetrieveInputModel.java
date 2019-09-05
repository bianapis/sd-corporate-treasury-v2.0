package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRatesRetrieveInputModelBankRatesInstanceAnalysis;
import org.bian.dto.BQBankRatesRetrieveInputModelBankRatesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBankRatesRetrieveInputModel
 */
public class BQBankRatesRetrieveInputModel   {
  private Object bankRatesRetrieveActionTaskRecord = null;

  private String bankRatesRetrieveActionRequest = null;

  private BQBankRatesRetrieveInputModelBankRatesInstanceReport bankRatesInstanceReport = null;

  private BQBankRatesRetrieveInputModelBankRatesInstanceAnalysis bankRatesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bankRatesRetrieveActionTaskRecord
  **/

  public Object getBankRatesRetrieveActionTaskRecord() {
    return bankRatesRetrieveActionTaskRecord;
  }

  public void setBankRatesRetrieveActionTaskRecord(Object bankRatesRetrieveActionTaskRecord) {
    this.bankRatesRetrieveActionTaskRecord = bankRatesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return bankRatesRetrieveActionRequest
  **/

  public String getBankRatesRetrieveActionRequest() {
    return bankRatesRetrieveActionRequest;
  }

  public void setBankRatesRetrieveActionRequest(String bankRatesRetrieveActionRequest) {
    this.bankRatesRetrieveActionRequest = bankRatesRetrieveActionRequest;
  }


  /**
   * Get bankRatesInstanceReport
   * @return bankRatesInstanceReport
  **/

  public BQBankRatesRetrieveInputModelBankRatesInstanceReport getBankRatesInstanceReport() {
    return bankRatesInstanceReport;
  }

  public void setBankRatesInstanceReport(BQBankRatesRetrieveInputModelBankRatesInstanceReport bankRatesInstanceReport) {
    this.bankRatesInstanceReport = bankRatesInstanceReport;
  }


  /**
   * Get bankRatesInstanceAnalysis
   * @return bankRatesInstanceAnalysis
  **/

  public BQBankRatesRetrieveInputModelBankRatesInstanceAnalysis getBankRatesInstanceAnalysis() {
    return bankRatesInstanceAnalysis;
  }

  public void setBankRatesInstanceAnalysis(BQBankRatesRetrieveInputModelBankRatesInstanceAnalysis bankRatesInstanceAnalysis) {
    this.bankRatesInstanceAnalysis = bankRatesInstanceAnalysis;
  }


}

