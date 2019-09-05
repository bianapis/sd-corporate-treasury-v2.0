package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLiquidityRetrieveOutputModelCorporateTreasuryManagementPlanInstanceRecord
 */
public class BQLiquidityRetrieveOutputModelCorporateTreasuryManagementPlanInstanceRecord   {
  private String enterpriseBankAccountingAndCashManagementRecords = null;

  private String currencyandRateRiskAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Account records that cover booking, pooling and netting activities across all relevant bank activity 
   * @return enterpriseBankAccountingAndCashManagementRecords
  **/

  public String getEnterpriseBankAccountingAndCashManagementRecords() {
    return enterpriseBankAccountingAndCashManagementRecords;
  }

  public void setEnterpriseBankAccountingAndCashManagementRecords(String enterpriseBankAccountingAndCashManagementRecords) {
    this.enterpriseBankAccountingAndCashManagementRecords = enterpriseBankAccountingAndCashManagementRecords;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Analytical views detailing exposure and sensitivity to currency and interest rate fluctuations 
   * @return currencyandRateRiskAnalysis
  **/

  public String getCurrencyandRateRiskAnalysis() {
    return currencyandRateRiskAnalysis;
  }

  public void setCurrencyandRateRiskAnalysis(String currencyandRateRiskAnalysis) {
    this.currencyandRateRiskAnalysis = currencyandRateRiskAnalysis;
  }


}

