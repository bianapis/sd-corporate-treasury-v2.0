package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingCaptureInputModelStrategicFundingInstanceRecord
 */
public class BQStrategicFundingCaptureInputModelStrategicFundingInstanceRecord   {
  private String eCMDCMMarketTransactions = null;

  private String strategicInvestmentHoldingsTransactions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of equity and debt transactions 
   * @return eCMDCMMarketTransactions
  **/

  public String getECMDCMMarketTransactions() {
    return eCMDCMMarketTransactions;
  }

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


}

