package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanCaptureOutputModel
 */
public class CRCorporateTreasuryManagementPlanCaptureOutputModel   {
  private String corporateTreasuryManagementPlanCaptureActionTaskReference = null;

  private Object corporateTreasuryManagementPlanCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Treasury Management Plan instance capture service call 
   * @return corporateTreasuryManagementPlanCaptureActionTaskReference
  **/

  public String getCorporateTreasuryManagementPlanCaptureActionTaskReference() {
    return corporateTreasuryManagementPlanCaptureActionTaskReference;
  }

  public void setCorporateTreasuryManagementPlanCaptureActionTaskReference(String corporateTreasuryManagementPlanCaptureActionTaskReference) {
    this.corporateTreasuryManagementPlanCaptureActionTaskReference = corporateTreasuryManagementPlanCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return corporateTreasuryManagementPlanCaptureActionTaskRecord
  **/

  public Object getCorporateTreasuryManagementPlanCaptureActionTaskRecord() {
    return corporateTreasuryManagementPlanCaptureActionTaskRecord;
  }

  public void setCorporateTreasuryManagementPlanCaptureActionTaskRecord(Object corporateTreasuryManagementPlanCaptureActionTaskRecord) {
    this.corporateTreasuryManagementPlanCaptureActionTaskRecord = corporateTreasuryManagementPlanCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
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

