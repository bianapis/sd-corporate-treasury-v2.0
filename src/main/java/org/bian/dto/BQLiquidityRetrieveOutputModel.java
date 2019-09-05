package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLiquidityRetrieveOutputModelCorporateTreasuryManagementPlanInstanceRecord;
import org.bian.dto.BQLiquidityRetrieveOutputModelLiquidityInstanceAnalysis;
import org.bian.dto.BQLiquidityRetrieveOutputModelLiquidityInstanceRecord;
import org.bian.dto.BQLiquidityRetrieveOutputModelLiquidityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLiquidityRetrieveOutputModel
 */
public class BQLiquidityRetrieveOutputModel   {
  private BQLiquidityRetrieveOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;

  private BQLiquidityRetrieveOutputModelLiquidityInstanceRecord liquidityInstanceRecord = null;

  private String liquidityRetrieveActionTaskReference = null;

  private Object liquidityRetrieveActionTaskRecord = null;

  private String liquidityRetrieveActionResponse = null;

  private BQLiquidityRetrieveOutputModelLiquidityInstanceReport liquidityInstanceReport = null;

  private BQLiquidityRetrieveOutputModelLiquidityInstanceAnalysis liquidityInstanceAnalysis = null;


  /**
   * Get corporateTreasuryManagementPlanInstanceRecord
   * @return corporateTreasuryManagementPlanInstanceRecord
  **/

  public BQLiquidityRetrieveOutputModelCorporateTreasuryManagementPlanInstanceRecord getCorporateTreasuryManagementPlanInstanceRecord() {
    return corporateTreasuryManagementPlanInstanceRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceRecord(BQLiquidityRetrieveOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord) {
    this.corporateTreasuryManagementPlanInstanceRecord = corporateTreasuryManagementPlanInstanceRecord;
  }


  /**
   * Get liquidityInstanceRecord
   * @return liquidityInstanceRecord
  **/

  public BQLiquidityRetrieveOutputModelLiquidityInstanceRecord getLiquidityInstanceRecord() {
    return liquidityInstanceRecord;
  }

  public void setLiquidityInstanceRecord(BQLiquidityRetrieveOutputModelLiquidityInstanceRecord liquidityInstanceRecord) {
    this.liquidityInstanceRecord = liquidityInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Liquidity instance retrieve service call 
   * @return liquidityRetrieveActionTaskReference
  **/

  public String getLiquidityRetrieveActionTaskReference() {
    return liquidityRetrieveActionTaskReference;
  }

  public void setLiquidityRetrieveActionTaskReference(String liquidityRetrieveActionTaskReference) {
    this.liquidityRetrieveActionTaskReference = liquidityRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return liquidityRetrieveActionTaskRecord
  **/

  public Object getLiquidityRetrieveActionTaskRecord() {
    return liquidityRetrieveActionTaskRecord;
  }

  public void setLiquidityRetrieveActionTaskRecord(Object liquidityRetrieveActionTaskRecord) {
    this.liquidityRetrieveActionTaskRecord = liquidityRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return liquidityRetrieveActionResponse
  **/

  public String getLiquidityRetrieveActionResponse() {
    return liquidityRetrieveActionResponse;
  }

  public void setLiquidityRetrieveActionResponse(String liquidityRetrieveActionResponse) {
    this.liquidityRetrieveActionResponse = liquidityRetrieveActionResponse;
  }


  /**
   * Get liquidityInstanceReport
   * @return liquidityInstanceReport
  **/

  public BQLiquidityRetrieveOutputModelLiquidityInstanceReport getLiquidityInstanceReport() {
    return liquidityInstanceReport;
  }

  public void setLiquidityInstanceReport(BQLiquidityRetrieveOutputModelLiquidityInstanceReport liquidityInstanceReport) {
    this.liquidityInstanceReport = liquidityInstanceReport;
  }


  /**
   * Get liquidityInstanceAnalysis
   * @return liquidityInstanceAnalysis
  **/

  public BQLiquidityRetrieveOutputModelLiquidityInstanceAnalysis getLiquidityInstanceAnalysis() {
    return liquidityInstanceAnalysis;
  }

  public void setLiquidityInstanceAnalysis(BQLiquidityRetrieveOutputModelLiquidityInstanceAnalysis liquidityInstanceAnalysis) {
    this.liquidityInstanceAnalysis = liquidityInstanceAnalysis;
  }


}

