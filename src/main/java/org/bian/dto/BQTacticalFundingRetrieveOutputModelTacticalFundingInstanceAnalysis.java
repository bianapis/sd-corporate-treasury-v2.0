package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceAnalysis
 */
public class BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceAnalysis   {
  private Object tacticalFundingInstanceAnalysisRecord = null;

  private String tacticalFundingInstanceAnalysisReportType = null;

  private String tacticalFundingInstanceAnalysisParameters = null;

  private Object tacticalFundingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return tacticalFundingInstanceAnalysisRecord
  **/

  public Object getTacticalFundingInstanceAnalysisRecord() {
    return tacticalFundingInstanceAnalysisRecord;
  }

  public void setTacticalFundingInstanceAnalysisRecord(Object tacticalFundingInstanceAnalysisRecord) {
    this.tacticalFundingInstanceAnalysisRecord = tacticalFundingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return tacticalFundingInstanceAnalysisReportType
  **/

  public String getTacticalFundingInstanceAnalysisReportType() {
    return tacticalFundingInstanceAnalysisReportType;
  }

  public void setTacticalFundingInstanceAnalysisReportType(String tacticalFundingInstanceAnalysisReportType) {
    this.tacticalFundingInstanceAnalysisReportType = tacticalFundingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return tacticalFundingInstanceAnalysisParameters
  **/

  public String getTacticalFundingInstanceAnalysisParameters() {
    return tacticalFundingInstanceAnalysisParameters;
  }

  public void setTacticalFundingInstanceAnalysisParameters(String tacticalFundingInstanceAnalysisParameters) {
    this.tacticalFundingInstanceAnalysisParameters = tacticalFundingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return tacticalFundingInstanceAnalysisReport
  **/

  public Object getTacticalFundingInstanceAnalysisReport() {
    return tacticalFundingInstanceAnalysisReport;
  }

  public void setTacticalFundingInstanceAnalysisReport(Object tacticalFundingInstanceAnalysisReport) {
    this.tacticalFundingInstanceAnalysisReport = tacticalFundingInstanceAnalysisReport;
  }


}

