package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord
 */
public class CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord   {
  private String treasuryPlanningPoliciesAndGuidelines = null;

  private String treasuryPlanOperatingParameters = null;

  private String treasuryPlanGoals = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The bank's treasury policies and guidelines reflected in the plan 
   * @return treasuryPlanningPoliciesAndGuidelines
  **/

  public String getTreasuryPlanningPoliciesAndGuidelines() {
    return treasuryPlanningPoliciesAndGuidelines;
  }

  public void setTreasuryPlanningPoliciesAndGuidelines(String treasuryPlanningPoliciesAndGuidelines) {
    this.treasuryPlanningPoliciesAndGuidelines = treasuryPlanningPoliciesAndGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The array of group treasury positions and limits to be met through the plan 
   * @return treasuryPlanOperatingParameters
  **/

  public String getTreasuryPlanOperatingParameters() {
    return treasuryPlanOperatingParameters;
  }

  public void setTreasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
    this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target financial performance goals set out in the bank's corporate treasury plan 
   * @return treasuryPlanGoals
  **/

  public String getTreasuryPlanGoals() {
    return treasuryPlanGoals;
  }

  public void setTreasuryPlanGoals(String treasuryPlanGoals) {
    this.treasuryPlanGoals = treasuryPlanGoals;
  }


}

