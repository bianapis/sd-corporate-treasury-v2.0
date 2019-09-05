package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceReport
 */
public class BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceReport   {
  private Object strategicFundingInstanceReportRecord = null;

  private String strategicFundingInstanceReportType = null;

  private String strategicFundingInstanceReportParameters = null;

  private Object strategicFundingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return strategicFundingInstanceReportRecord
  **/

  public Object getStrategicFundingInstanceReportRecord() {
    return strategicFundingInstanceReportRecord;
  }

  public void setStrategicFundingInstanceReportRecord(Object strategicFundingInstanceReportRecord) {
    this.strategicFundingInstanceReportRecord = strategicFundingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return strategicFundingInstanceReportType
  **/

  public String getStrategicFundingInstanceReportType() {
    return strategicFundingInstanceReportType;
  }

  public void setStrategicFundingInstanceReportType(String strategicFundingInstanceReportType) {
    this.strategicFundingInstanceReportType = strategicFundingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return strategicFundingInstanceReportParameters
  **/

  public String getStrategicFundingInstanceReportParameters() {
    return strategicFundingInstanceReportParameters;
  }

  public void setStrategicFundingInstanceReportParameters(String strategicFundingInstanceReportParameters) {
    this.strategicFundingInstanceReportParameters = strategicFundingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return strategicFundingInstanceReport
  **/

  public Object getStrategicFundingInstanceReport() {
    return strategicFundingInstanceReport;
  }

  public void setStrategicFundingInstanceReport(Object strategicFundingInstanceReport) {
    this.strategicFundingInstanceReport = strategicFundingInstanceReport;
  }


}

