package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRatesRetrieveOutputModelBankRatesInstanceAnalysis
 */
public class BQBankRatesRetrieveOutputModelBankRatesInstanceAnalysis   {
  private Object bankRatesInstanceAnalysisRecord = null;

  private String bankRatesInstanceAnalysisReportType = null;

  private String bankRatesInstanceAnalysisParameters = null;

  private Object bankRatesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return bankRatesInstanceAnalysisRecord
  **/

  public Object getBankRatesInstanceAnalysisRecord() {
    return bankRatesInstanceAnalysisRecord;
  }

  public void setBankRatesInstanceAnalysisRecord(Object bankRatesInstanceAnalysisRecord) {
    this.bankRatesInstanceAnalysisRecord = bankRatesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return bankRatesInstanceAnalysisReportType
  **/

  public String getBankRatesInstanceAnalysisReportType() {
    return bankRatesInstanceAnalysisReportType;
  }

  public void setBankRatesInstanceAnalysisReportType(String bankRatesInstanceAnalysisReportType) {
    this.bankRatesInstanceAnalysisReportType = bankRatesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return bankRatesInstanceAnalysisParameters
  **/

  public String getBankRatesInstanceAnalysisParameters() {
    return bankRatesInstanceAnalysisParameters;
  }

  public void setBankRatesInstanceAnalysisParameters(String bankRatesInstanceAnalysisParameters) {
    this.bankRatesInstanceAnalysisParameters = bankRatesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return bankRatesInstanceAnalysisReport
  **/

  public Object getBankRatesInstanceAnalysisReport() {
    return bankRatesInstanceAnalysisReport;
  }

  public void setBankRatesInstanceAnalysisReport(Object bankRatesInstanceAnalysisReport) {
    this.bankRatesInstanceAnalysisReport = bankRatesInstanceAnalysisReport;
  }


}

