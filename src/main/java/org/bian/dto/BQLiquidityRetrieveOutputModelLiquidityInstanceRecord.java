package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLiquidityRetrieveOutputModelLiquidityInstanceRecord
 */
public class BQLiquidityRetrieveOutputModelLiquidityInstanceRecord   {
  private String enterpriseLiquidityCashManagementAnalysis = null;

  private String enterpriseLargePaymentTransactionRecords = null;

  private String businessUnitFinancialReports = null;

  private String liquidityResolutionTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Consolidated cashflow/liquidity reports 
   * @return enterpriseLiquidityCashManagementAnalysis
  **/

  public String getEnterpriseLiquidityCashManagementAnalysis() {
    return enterpriseLiquidityCashManagementAnalysis;
  }

  public void setEnterpriseLiquidityCashManagementAnalysis(String enterpriseLiquidityCashManagementAnalysis) {
    this.enterpriseLiquidityCashManagementAnalysis = enterpriseLiquidityCashManagementAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of large transactions that impact the treasury position that need to be considered individually  
   * @return enterpriseLargePaymentTransactionRecords
  **/

  public String getEnterpriseLargePaymentTransactionRecords() {
    return enterpriseLargePaymentTransactionRecords;
  }

  public void setEnterpriseLargePaymentTransactionRecords(String enterpriseLargePaymentTransactionRecords) {
    this.enterpriseLargePaymentTransactionRecords = enterpriseLargePaymentTransactionRecords;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: These unit reports include cost/income actual and projected values as required 
   * @return businessUnitFinancialReports
  **/

  public String getBusinessUnitFinancialReports() {
    return businessUnitFinancialReports;
  }

  public void setBusinessUnitFinancialReports(String businessUnitFinancialReports) {
    this.businessUnitFinancialReports = businessUnitFinancialReports;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of a response initiated by corporate treasury 
   * @return liquidityResolutionTask
  **/

  public String getLiquidityResolutionTask() {
    return liquidityResolutionTask;
  }

  public void setLiquidityResolutionTask(String liquidityResolutionTask) {
    this.liquidityResolutionTask = liquidityResolutionTask;
  }


}

