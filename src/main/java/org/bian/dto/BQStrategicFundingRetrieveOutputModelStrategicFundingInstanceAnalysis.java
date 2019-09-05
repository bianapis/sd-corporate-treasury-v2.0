package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceAnalysis
 */
public class BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceAnalysis   {
  private Object strategicFundingInstanceAnalysisRecord = null;

  private String strategicFundingInstanceAnalysisReportType = null;

  private String strategicFundingInstanceAnalysisParameters = null;

  private Object strategicFundingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return strategicFundingInstanceAnalysisRecord
  **/

  public Object getStrategicFundingInstanceAnalysisRecord() {
    return strategicFundingInstanceAnalysisRecord;
  }

  public void setStrategicFundingInstanceAnalysisRecord(Object strategicFundingInstanceAnalysisRecord) {
    this.strategicFundingInstanceAnalysisRecord = strategicFundingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return strategicFundingInstanceAnalysisReportType
  **/

  public String getStrategicFundingInstanceAnalysisReportType() {
    return strategicFundingInstanceAnalysisReportType;
  }

  public void setStrategicFundingInstanceAnalysisReportType(String strategicFundingInstanceAnalysisReportType) {
    this.strategicFundingInstanceAnalysisReportType = strategicFundingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return strategicFundingInstanceAnalysisParameters
  **/

  public String getStrategicFundingInstanceAnalysisParameters() {
    return strategicFundingInstanceAnalysisParameters;
  }

  public void setStrategicFundingInstanceAnalysisParameters(String strategicFundingInstanceAnalysisParameters) {
    this.strategicFundingInstanceAnalysisParameters = strategicFundingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return strategicFundingInstanceAnalysisReport
  **/

  public Object getStrategicFundingInstanceAnalysisReport() {
    return strategicFundingInstanceAnalysisReport;
  }

  public void setStrategicFundingInstanceAnalysisReport(Object strategicFundingInstanceAnalysisReport) {
    this.strategicFundingInstanceAnalysisReport = strategicFundingInstanceAnalysisReport;
  }


}

