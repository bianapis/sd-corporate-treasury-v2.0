package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLiquidityCaptureOutputModel
 */
public class BQLiquidityCaptureOutputModel   {
  private String liquidityCaptureActionTaskReference = null;

  private Object liquidityCaptureActionTaskRecord = null;

  private String liquidityCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Liquidity instance capture service call 
   * @return liquidityCaptureActionTaskReference
  **/

  public String getLiquidityCaptureActionTaskReference() {
    return liquidityCaptureActionTaskReference;
  }

  public void setLiquidityCaptureActionTaskReference(String liquidityCaptureActionTaskReference) {
    this.liquidityCaptureActionTaskReference = liquidityCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Liquidity structured input transaction/record 
   * @return liquidityCaptureRecordReference
  **/

  public String getLiquidityCaptureRecordReference() {
    return liquidityCaptureRecordReference;
  }

  public void setLiquidityCaptureRecordReference(String liquidityCaptureRecordReference) {
    this.liquidityCaptureRecordReference = liquidityCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

