package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankRatesRetrieveOutputModelBankRatesInstanceAnalysis;
import org.bian.dto.BQBankRatesRetrieveOutputModelBankRatesInstanceRecord;
import org.bian.dto.BQBankRatesRetrieveOutputModelBankRatesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBankRatesRetrieveOutputModel
 */
public class BQBankRatesRetrieveOutputModel   {
  private BQBankRatesRetrieveOutputModelBankRatesInstanceRecord bankRatesInstanceRecord = null;

  private String bankRatesRetrieveActionTaskReference = null;

  private Object bankRatesRetrieveActionTaskRecord = null;

  private String bankRatesRetrieveActionResponse = null;

  private BQBankRatesRetrieveOutputModelBankRatesInstanceReport bankRatesInstanceReport = null;

  private BQBankRatesRetrieveOutputModelBankRatesInstanceAnalysis bankRatesInstanceAnalysis = null;


  /**
   * Get bankRatesInstanceRecord
   * @return bankRatesInstanceRecord
  **/

  public BQBankRatesRetrieveOutputModelBankRatesInstanceRecord getBankRatesInstanceRecord() {
    return bankRatesInstanceRecord;
  }

  public void setBankRatesInstanceRecord(BQBankRatesRetrieveOutputModelBankRatesInstanceRecord bankRatesInstanceRecord) {
    this.bankRatesInstanceRecord = bankRatesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank Rates instance retrieve service call 
   * @return bankRatesRetrieveActionTaskReference
  **/

  public String getBankRatesRetrieveActionTaskReference() {
    return bankRatesRetrieveActionTaskReference;
  }

  public void setBankRatesRetrieveActionTaskReference(String bankRatesRetrieveActionTaskReference) {
    this.bankRatesRetrieveActionTaskReference = bankRatesRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return bankRatesRetrieveActionResponse
  **/

  public String getBankRatesRetrieveActionResponse() {
    return bankRatesRetrieveActionResponse;
  }

  public void setBankRatesRetrieveActionResponse(String bankRatesRetrieveActionResponse) {
    this.bankRatesRetrieveActionResponse = bankRatesRetrieveActionResponse;
  }


  /**
   * Get bankRatesInstanceReport
   * @return bankRatesInstanceReport
  **/

  public BQBankRatesRetrieveOutputModelBankRatesInstanceReport getBankRatesInstanceReport() {
    return bankRatesInstanceReport;
  }

  public void setBankRatesInstanceReport(BQBankRatesRetrieveOutputModelBankRatesInstanceReport bankRatesInstanceReport) {
    this.bankRatesInstanceReport = bankRatesInstanceReport;
  }


  /**
   * Get bankRatesInstanceAnalysis
   * @return bankRatesInstanceAnalysis
  **/

  public BQBankRatesRetrieveOutputModelBankRatesInstanceAnalysis getBankRatesInstanceAnalysis() {
    return bankRatesInstanceAnalysis;
  }

  public void setBankRatesInstanceAnalysis(BQBankRatesRetrieveOutputModelBankRatesInstanceAnalysis bankRatesInstanceAnalysis) {
    this.bankRatesInstanceAnalysis = bankRatesInstanceAnalysis;
  }


}

