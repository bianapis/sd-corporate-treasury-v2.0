package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLiquidityRetrieveOutputModelLiquidityInstanceReport
 */
public class BQLiquidityRetrieveOutputModelLiquidityInstanceReport   {
  private Object liquidityInstanceReportRecord = null;

  private String liquidityInstanceReportType = null;

  private String liquidityInstanceReportParameters = null;

  private Object liquidityInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return liquidityInstanceReportRecord
  **/

  public Object getLiquidityInstanceReportRecord() {
    return liquidityInstanceReportRecord;
  }

  public void setLiquidityInstanceReportRecord(Object liquidityInstanceReportRecord) {
    this.liquidityInstanceReportRecord = liquidityInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return liquidityInstanceReportType
  **/

  public String getLiquidityInstanceReportType() {
    return liquidityInstanceReportType;
  }

  public void setLiquidityInstanceReportType(String liquidityInstanceReportType) {
    this.liquidityInstanceReportType = liquidityInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return liquidityInstanceReportParameters
  **/

  public String getLiquidityInstanceReportParameters() {
    return liquidityInstanceReportParameters;
  }

  public void setLiquidityInstanceReportParameters(String liquidityInstanceReportParameters) {
    this.liquidityInstanceReportParameters = liquidityInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return liquidityInstanceReport
  **/

  public Object getLiquidityInstanceReport() {
    return liquidityInstanceReport;
  }

  public void setLiquidityInstanceReport(Object liquidityInstanceReport) {
    this.liquidityInstanceReport = liquidityInstanceReport;
  }


}

