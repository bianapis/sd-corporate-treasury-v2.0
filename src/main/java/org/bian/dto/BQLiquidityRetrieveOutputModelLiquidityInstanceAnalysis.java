package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLiquidityRetrieveOutputModelLiquidityInstanceAnalysis
 */
public class BQLiquidityRetrieveOutputModelLiquidityInstanceAnalysis   {
  private Object liquidityInstanceAnalysisRecord = null;

  private String liquidityInstanceAnalysisReportType = null;

  private String liquidityInstanceAnalysisParameters = null;

  private Object liquidityInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return liquidityInstanceAnalysisRecord
  **/

  public Object getLiquidityInstanceAnalysisRecord() {
    return liquidityInstanceAnalysisRecord;
  }

  public void setLiquidityInstanceAnalysisRecord(Object liquidityInstanceAnalysisRecord) {
    this.liquidityInstanceAnalysisRecord = liquidityInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return liquidityInstanceAnalysisReportType
  **/

  public String getLiquidityInstanceAnalysisReportType() {
    return liquidityInstanceAnalysisReportType;
  }

  public void setLiquidityInstanceAnalysisReportType(String liquidityInstanceAnalysisReportType) {
    this.liquidityInstanceAnalysisReportType = liquidityInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return liquidityInstanceAnalysisParameters
  **/

  public String getLiquidityInstanceAnalysisParameters() {
    return liquidityInstanceAnalysisParameters;
  }

  public void setLiquidityInstanceAnalysisParameters(String liquidityInstanceAnalysisParameters) {
    this.liquidityInstanceAnalysisParameters = liquidityInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return liquidityInstanceAnalysisReport
  **/

  public Object getLiquidityInstanceAnalysisReport() {
    return liquidityInstanceAnalysisReport;
  }

  public void setLiquidityInstanceAnalysisReport(Object liquidityInstanceAnalysisReport) {
    this.liquidityInstanceAnalysisReport = liquidityInstanceAnalysisReport;
  }


}

