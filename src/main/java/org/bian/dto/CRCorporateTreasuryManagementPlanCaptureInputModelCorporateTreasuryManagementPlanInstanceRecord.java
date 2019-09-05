package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanCaptureInputModelCorporateTreasuryManagementPlanInstanceRecord
 */
public class CRCorporateTreasuryManagementPlanCaptureInputModelCorporateTreasuryManagementPlanInstanceRecord   {
  private String enterpriseFinancialStatements = null;

  private String enterpriseBalanceSheetDetailedContent = null;

  private String enterpriseBankAccountingAndCashManagementRecords = null;

  private String capitalWholesaleMarketTransactions = null;

  private String currencyandRateRiskAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The bank financial statements include the balance sheet, statement of cash flows, statement of retained earnings and the income statement 
   * @return enterpriseFinancialStatements
  **/

  public String getEnterpriseFinancialStatements() {
    return enterpriseFinancialStatements;
  }

  public void setEnterpriseFinancialStatements(String enterpriseFinancialStatements) {
    this.enterpriseFinancialStatements = enterpriseFinancialStatements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The balance sheet breakdown include individual assets/liabilities as necessary 
   * @return enterpriseBalanceSheetDetailedContent
  **/

  public String getEnterpriseBalanceSheetDetailedContent() {
    return enterpriseBalanceSheetDetailedContent;
  }

  public void setEnterpriseBalanceSheetDetailedContent(String enterpriseBalanceSheetDetailedContent) {
    this.enterpriseBalanceSheetDetailedContent = enterpriseBalanceSheetDetailedContent;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Includes large transactions and net positions for smaller trade activity as appropriate 
   * @return capitalWholesaleMarketTransactions
  **/

  public String getCapitalWholesaleMarketTransactions() {
    return capitalWholesaleMarketTransactions;
  }

  public void setCapitalWholesaleMarketTransactions(String capitalWholesaleMarketTransactions) {
    this.capitalWholesaleMarketTransactions = capitalWholesaleMarketTransactions;
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

