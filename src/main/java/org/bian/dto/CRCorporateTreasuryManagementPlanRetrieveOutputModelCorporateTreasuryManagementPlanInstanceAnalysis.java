package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceAnalysis
 */
public class CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceAnalysis   {
  private String corporateTreasuryManagementPlanInstanceAnalysisData = null;

  private String corporateTreasuryManagementPlanInstanceAnalysisReportType = null;

  private Object corporateTreasuryManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateTreasuryManagementPlanInstanceAnalysisData
  **/

  public String getCorporateTreasuryManagementPlanInstanceAnalysisData() {
    return corporateTreasuryManagementPlanInstanceAnalysisData;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysisData(String corporateTreasuryManagementPlanInstanceAnalysisData) {
    this.corporateTreasuryManagementPlanInstanceAnalysisData = corporateTreasuryManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateTreasuryManagementPlanInstanceAnalysisReportType
  **/

  public String getCorporateTreasuryManagementPlanInstanceAnalysisReportType() {
    return corporateTreasuryManagementPlanInstanceAnalysisReportType;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysisReportType(String corporateTreasuryManagementPlanInstanceAnalysisReportType) {
    this.corporateTreasuryManagementPlanInstanceAnalysisReportType = corporateTreasuryManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateTreasuryManagementPlanInstanceAnalysisReport
  **/

  public Object getCorporateTreasuryManagementPlanInstanceAnalysisReport() {
    return corporateTreasuryManagementPlanInstanceAnalysisReport;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysisReport(Object corporateTreasuryManagementPlanInstanceAnalysisReport) {
    this.corporateTreasuryManagementPlanInstanceAnalysisReport = corporateTreasuryManagementPlanInstanceAnalysisReport;
  }


}

