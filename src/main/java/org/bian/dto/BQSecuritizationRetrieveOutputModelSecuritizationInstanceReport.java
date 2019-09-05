package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritizationRetrieveOutputModelSecuritizationInstanceReport
 */
public class BQSecuritizationRetrieveOutputModelSecuritizationInstanceReport   {
  private Object securitizationInstanceReportRecord = null;

  private String securitizationInstanceReportType = null;

  private String securitizationInstanceReportParameters = null;

  private Object securitizationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return securitizationInstanceReportRecord
  **/

  public Object getSecuritizationInstanceReportRecord() {
    return securitizationInstanceReportRecord;
  }

  public void setSecuritizationInstanceReportRecord(Object securitizationInstanceReportRecord) {
    this.securitizationInstanceReportRecord = securitizationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return securitizationInstanceReportType
  **/

  public String getSecuritizationInstanceReportType() {
    return securitizationInstanceReportType;
  }

  public void setSecuritizationInstanceReportType(String securitizationInstanceReportType) {
    this.securitizationInstanceReportType = securitizationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return securitizationInstanceReportParameters
  **/

  public String getSecuritizationInstanceReportParameters() {
    return securitizationInstanceReportParameters;
  }

  public void setSecuritizationInstanceReportParameters(String securitizationInstanceReportParameters) {
    this.securitizationInstanceReportParameters = securitizationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return securitizationInstanceReport
  **/

  public Object getSecuritizationInstanceReport() {
    return securitizationInstanceReport;
  }

  public void setSecuritizationInstanceReport(Object securitizationInstanceReport) {
    this.securitizationInstanceReport = securitizationInstanceReport;
  }


}

