package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritizationRetrieveOutputModelSecuritizationInstanceAnalysis
 */
public class BQSecuritizationRetrieveOutputModelSecuritizationInstanceAnalysis   {
  private Object securitizationInstanceAnalysisRecord = null;

  private String securitizationInstanceAnalysisReportType = null;

  private String securitizationInstanceAnalysisParameters = null;

  private Object securitizationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return securitizationInstanceAnalysisRecord
  **/

  public Object getSecuritizationInstanceAnalysisRecord() {
    return securitizationInstanceAnalysisRecord;
  }

  public void setSecuritizationInstanceAnalysisRecord(Object securitizationInstanceAnalysisRecord) {
    this.securitizationInstanceAnalysisRecord = securitizationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return securitizationInstanceAnalysisReportType
  **/

  public String getSecuritizationInstanceAnalysisReportType() {
    return securitizationInstanceAnalysisReportType;
  }

  public void setSecuritizationInstanceAnalysisReportType(String securitizationInstanceAnalysisReportType) {
    this.securitizationInstanceAnalysisReportType = securitizationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return securitizationInstanceAnalysisParameters
  **/

  public String getSecuritizationInstanceAnalysisParameters() {
    return securitizationInstanceAnalysisParameters;
  }

  public void setSecuritizationInstanceAnalysisParameters(String securitizationInstanceAnalysisParameters) {
    this.securitizationInstanceAnalysisParameters = securitizationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return securitizationInstanceAnalysisReport
  **/

  public Object getSecuritizationInstanceAnalysisReport() {
    return securitizationInstanceAnalysisReport;
  }

  public void setSecuritizationInstanceAnalysisReport(Object securitizationInstanceAnalysisReport) {
    this.securitizationInstanceAnalysisReport = securitizationInstanceAnalysisReport;
  }


}

