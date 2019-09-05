package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceRecord
 */
public class BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceRecord   {
  private String capitalAdequacyRequirements = null;

  private String bankPositionsandHedgingRequirements = null;

  private String enterpriseBalanceSheetPositions = null;

  private String tacticalFundingResolutionTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the required capital holdings against which the current position is tracked and hedging, re-balancing activity initiated for compliance 
   * @return capitalAdequacyRequirements
  **/

  public String getCapitalAdequacyRequirements() {
    return capitalAdequacyRequirements;
  }

  public void setCapitalAdequacyRequirements(String capitalAdequacyRequirements) {
    this.capitalAdequacyRequirements = capitalAdequacyRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Breakdown of the treasury positions monitored and there current/projected ranges 
   * @return bankPositionsandHedgingRequirements
  **/

  public String getBankPositionsandHedgingRequirements() {
    return bankPositionsandHedgingRequirements;
  }

  public void setBankPositionsandHedgingRequirements(String bankPositionsandHedgingRequirements) {
    this.bankPositionsandHedgingRequirements = bankPositionsandHedgingRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Selected balance sheet views used to evaluate short term funding needs 
   * @return enterpriseBalanceSheetPositions
  **/

  public String getEnterpriseBalanceSheetPositions() {
    return enterpriseBalanceSheetPositions;
  }

  public void setEnterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
    this.enterpriseBalanceSheetPositions = enterpriseBalanceSheetPositions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of a response initiated by corporate treasury 
   * @return tacticalFundingResolutionTask
  **/

  public String getTacticalFundingResolutionTask() {
    return tacticalFundingResolutionTask;
  }

  public void setTacticalFundingResolutionTask(String tacticalFundingResolutionTask) {
    this.tacticalFundingResolutionTask = tacticalFundingResolutionTask;
  }


}

