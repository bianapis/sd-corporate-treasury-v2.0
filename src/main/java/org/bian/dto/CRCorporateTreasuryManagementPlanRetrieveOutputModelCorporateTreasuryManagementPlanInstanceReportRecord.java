package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceReportRecord
 */
public class CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceReportRecord   {
  private String corporateTreasuryManagementPlanInstanceReportData = null;

  private String corporateTreasuryManagementPlanInstanceReportType = null;

  private Object corporateTreasuryManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateTreasuryManagementPlanInstanceReportData
  **/

  public String getCorporateTreasuryManagementPlanInstanceReportData() {
    return corporateTreasuryManagementPlanInstanceReportData;
  }

  public void setCorporateTreasuryManagementPlanInstanceReportData(String corporateTreasuryManagementPlanInstanceReportData) {
    this.corporateTreasuryManagementPlanInstanceReportData = corporateTreasuryManagementPlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateTreasuryManagementPlanInstanceReportType
  **/

  public String getCorporateTreasuryManagementPlanInstanceReportType() {
    return corporateTreasuryManagementPlanInstanceReportType;
  }

  public void setCorporateTreasuryManagementPlanInstanceReportType(String corporateTreasuryManagementPlanInstanceReportType) {
    this.corporateTreasuryManagementPlanInstanceReportType = corporateTreasuryManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateTreasuryManagementPlanInstanceReport
  **/

  public Object getCorporateTreasuryManagementPlanInstanceReport() {
    return corporateTreasuryManagementPlanInstanceReport;
  }

  public void setCorporateTreasuryManagementPlanInstanceReport(Object corporateTreasuryManagementPlanInstanceReport) {
    this.corporateTreasuryManagementPlanInstanceReport = corporateTreasuryManagementPlanInstanceReport;
  }


}

