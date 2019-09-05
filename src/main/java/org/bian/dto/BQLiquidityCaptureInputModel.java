package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLiquidityCaptureInputModelLiquidityInstanceRecord;
import org.bian.dto.CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQLiquidityCaptureInputModel
 */
public class BQLiquidityCaptureInputModel   {
  private String corporateTreasuryManagementPlanInstanceReference = null;

  private String liquidityInstanceReference = null;

  private BQLiquidityCaptureInputModelLiquidityInstanceRecord liquidityInstanceRecord = null;

  private Object liquidityCaptureActionTaskRecord = null;

  private CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Corporate Treasury Management Plan instance 
   * @return corporateTreasuryManagementPlanInstanceReference
  **/

  public String getCorporateTreasuryManagementPlanInstanceReference() {
    return corporateTreasuryManagementPlanInstanceReference;
  }

  public void setCorporateTreasuryManagementPlanInstanceReference(String corporateTreasuryManagementPlanInstanceReference) {
    this.corporateTreasuryManagementPlanInstanceReference = corporateTreasuryManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Liquidity instance 
   * @return liquidityInstanceReference
  **/

  public String getLiquidityInstanceReference() {
    return liquidityInstanceReference;
  }

  public void setLiquidityInstanceReference(String liquidityInstanceReference) {
    this.liquidityInstanceReference = liquidityInstanceReference;
  }


  /**
   * Get liquidityInstanceRecord
   * @return liquidityInstanceRecord
  **/

  public BQLiquidityCaptureInputModelLiquidityInstanceRecord getLiquidityInstanceRecord() {
    return liquidityInstanceRecord;
  }

  public void setLiquidityInstanceRecord(BQLiquidityCaptureInputModelLiquidityInstanceRecord liquidityInstanceRecord) {
    this.liquidityInstanceRecord = liquidityInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return liquidityCaptureActionTaskRecord
  **/

  public Object getLiquidityCaptureActionTaskRecord() {
    return liquidityCaptureActionTaskRecord;
  }

  public void setLiquidityCaptureActionTaskRecord(Object liquidityCaptureActionTaskRecord) {
    this.liquidityCaptureActionTaskRecord = liquidityCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

