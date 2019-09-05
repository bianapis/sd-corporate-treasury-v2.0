package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceReportRecord
 */
public class CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceReportRecord   {
  private String corporateTreasuryManagementPlanInstanceReportReference = null;

  private String corporateTreasuryManagementPlanInstanceReportType = null;

  private String corporateTreasuryManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateTreasuryManagementPlanInstanceReportReference
  **/

  public String getCorporateTreasuryManagementPlanInstanceReportReference() {
    return corporateTreasuryManagementPlanInstanceReportReference;
  }

  public void setCorporateTreasuryManagementPlanInstanceReportReference(String corporateTreasuryManagementPlanInstanceReportReference) {
    this.corporateTreasuryManagementPlanInstanceReportReference = corporateTreasuryManagementPlanInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateTreasuryManagementPlanInstanceReportParameters
  **/

  public String getCorporateTreasuryManagementPlanInstanceReportParameters() {
    return corporateTreasuryManagementPlanInstanceReportParameters;
  }

  public void setCorporateTreasuryManagementPlanInstanceReportParameters(String corporateTreasuryManagementPlanInstanceReportParameters) {
    this.corporateTreasuryManagementPlanInstanceReportParameters = corporateTreasuryManagementPlanInstanceReportParameters;
  }


}

