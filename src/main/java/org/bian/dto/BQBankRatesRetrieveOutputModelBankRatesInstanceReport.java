package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRatesRetrieveOutputModelBankRatesInstanceReport
 */
public class BQBankRatesRetrieveOutputModelBankRatesInstanceReport   {
  private Object bankRatesInstanceReportRecord = null;

  private String bankRatesInstanceReportType = null;

  private String bankRatesInstanceReportParameters = null;

  private Object bankRatesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bankRatesInstanceReportRecord
  **/

  public Object getBankRatesInstanceReportRecord() {
    return bankRatesInstanceReportRecord;
  }

  public void setBankRatesInstanceReportRecord(Object bankRatesInstanceReportRecord) {
    this.bankRatesInstanceReportRecord = bankRatesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bankRatesInstanceReportType
  **/

  public String getBankRatesInstanceReportType() {
    return bankRatesInstanceReportType;
  }

  public void setBankRatesInstanceReportType(String bankRatesInstanceReportType) {
    this.bankRatesInstanceReportType = bankRatesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bankRatesInstanceReportParameters
  **/

  public String getBankRatesInstanceReportParameters() {
    return bankRatesInstanceReportParameters;
  }

  public void setBankRatesInstanceReportParameters(String bankRatesInstanceReportParameters) {
    this.bankRatesInstanceReportParameters = bankRatesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bankRatesInstanceReport
  **/

  public Object getBankRatesInstanceReport() {
    return bankRatesInstanceReport;
  }

  public void setBankRatesInstanceReport(Object bankRatesInstanceReport) {
    this.bankRatesInstanceReport = bankRatesInstanceReport;
  }


}

