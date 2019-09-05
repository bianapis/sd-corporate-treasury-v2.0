package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceRecord
 */
public class BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceRecord   {
  private String financialPerformanceandBalanceSheetProjections = null;

  private String eCMDCMMarketTransactions = null;

  private String strategicInvestmentHoldingsTransactions = null;

  private String enterpriseBalanceSheetPositions = null;

  private String strategicFundingResolutionTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Financial reports from multiple business units 
   * @return financialPerformanceandBalanceSheetProjections
  **/

  public String getFinancialPerformanceandBalanceSheetProjections() {
    return financialPerformanceandBalanceSheetProjections;
  }

  public void setFinancialPerformanceandBalanceSheetProjections(String financialPerformanceandBalanceSheetProjections) {
    this.financialPerformanceandBalanceSheetProjections = financialPerformanceandBalanceSheetProjections;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of equity and debt transactions 
   * @return eCMDCMMarketTransactions
  **/

  public String getECMDCMMarketTransactions() {
    return eCMDCMMarketTransactions;
  }

  @JsonProperty("eCMDCMMarketTransactions")
  public void setECMDCMMarketTransactions(String eCMDCMMarketTransactions) {
    this.eCMDCMMarketTransactions = eCMDCMMarketTransactions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of major investment/divestment transactions 
   * @return strategicInvestmentHoldingsTransactions
  **/

  public String getStrategicInvestmentHoldingsTransactions() {
    return strategicInvestmentHoldingsTransactions;
  }

  public void setStrategicInvestmentHoldingsTransactions(String strategicInvestmentHoldingsTransactions) {
    this.strategicInvestmentHoldingsTransactions = strategicInvestmentHoldingsTransactions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Summary details and analysis of the balance sheet relevant to longer term planning 
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
   * @return strategicFundingResolutionTask
  **/

  public String getStrategicFundingResolutionTask() {
    return strategicFundingResolutionTask;
  }

  public void setStrategicFundingResolutionTask(String strategicFundingResolutionTask) {
    this.strategicFundingResolutionTask = strategicFundingResolutionTask;
  }


}

