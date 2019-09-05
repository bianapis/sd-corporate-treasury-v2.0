package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceReport
 */
public class BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceReport   {
  private Object tacticalFundingInstanceReportRecord = null;

  private String tacticalFundingInstanceReportType = null;

  private String tacticalFundingInstanceReportParameters = null;

  private Object tacticalFundingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return tacticalFundingInstanceReportRecord
  **/

  public Object getTacticalFundingInstanceReportRecord() {
    return tacticalFundingInstanceReportRecord;
  }

  public void setTacticalFundingInstanceReportRecord(Object tacticalFundingInstanceReportRecord) {
    this.tacticalFundingInstanceReportRecord = tacticalFundingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return tacticalFundingInstanceReportType
  **/

  public String getTacticalFundingInstanceReportType() {
    return tacticalFundingInstanceReportType;
  }

  public void setTacticalFundingInstanceReportType(String tacticalFundingInstanceReportType) {
    this.tacticalFundingInstanceReportType = tacticalFundingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return tacticalFundingInstanceReportParameters
  **/

  public String getTacticalFundingInstanceReportParameters() {
    return tacticalFundingInstanceReportParameters;
  }

  public void setTacticalFundingInstanceReportParameters(String tacticalFundingInstanceReportParameters) {
    this.tacticalFundingInstanceReportParameters = tacticalFundingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return tacticalFundingInstanceReport
  **/

  public Object getTacticalFundingInstanceReport() {
    return tacticalFundingInstanceReport;
  }

  public void setTacticalFundingInstanceReport(Object tacticalFundingInstanceReport) {
    this.tacticalFundingInstanceReport = tacticalFundingInstanceReport;
  }


}

