package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceAnalysis
 */
public class CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceAnalysis   {
  private String corporateTreasuryManagementPlanInstanceAnalysisReference = null;

  private String corporateTreasuryManagementPlanInstanceAnalysisReportType = null;

  private String corporateTreasuryManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateTreasuryManagementPlanInstanceAnalysisReference
  **/

  public String getCorporateTreasuryManagementPlanInstanceAnalysisReference() {
    return corporateTreasuryManagementPlanInstanceAnalysisReference;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysisReference(String corporateTreasuryManagementPlanInstanceAnalysisReference) {
    this.corporateTreasuryManagementPlanInstanceAnalysisReference = corporateTreasuryManagementPlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateTreasuryManagementPlanInstanceAnalysisParameters
  **/

  public String getCorporateTreasuryManagementPlanInstanceAnalysisParameters() {
    return corporateTreasuryManagementPlanInstanceAnalysisParameters;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysisParameters(String corporateTreasuryManagementPlanInstanceAnalysisParameters) {
    this.corporateTreasuryManagementPlanInstanceAnalysisParameters = corporateTreasuryManagementPlanInstanceAnalysisParameters;
  }


}

