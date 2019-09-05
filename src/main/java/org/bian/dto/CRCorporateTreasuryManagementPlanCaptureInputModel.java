package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType;
import org.bian.dto.CRCorporateTreasuryManagementPlanCaptureInputModelCorporateTreasuryManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanCaptureInputModel
 */
public class CRCorporateTreasuryManagementPlanCaptureInputModel   {
  private String corporateTreasuryServicingSessionReference = null;

  private String corporateTreasuryManagementPlanInstanceReference = null;

  private CRCorporateTreasuryManagementPlanCaptureInputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;

  private Object corporateTreasuryManagementPlanCaptureActionTaskRecord = null;

  private CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateTreasuryServicingSessionReference
  **/

  public String getCorporateTreasuryServicingSessionReference() {
    return corporateTreasuryServicingSessionReference;
  }

  public void setCorporateTreasuryServicingSessionReference(String corporateTreasuryServicingSessionReference) {
    this.corporateTreasuryServicingSessionReference = corporateTreasuryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Treasury Management Plan instance 
   * @return corporateTreasuryManagementPlanInstanceReference
  **/

  public String getCorporateTreasuryManagementPlanInstanceReference() {
    return corporateTreasuryManagementPlanInstanceReference;
  }

  public void setCorporateTreasuryManagementPlanInstanceReference(String corporateTreasuryManagementPlanInstanceReference) {
    this.corporateTreasuryManagementPlanInstanceReference = corporateTreasuryManagementPlanInstanceReference;
  }


  /**
   * Get corporateTreasuryManagementPlanInstanceRecord
   * @return corporateTreasuryManagementPlanInstanceRecord
  **/

  public CRCorporateTreasuryManagementPlanCaptureInputModelCorporateTreasuryManagementPlanInstanceRecord getCorporateTreasuryManagementPlanInstanceRecord() {
    return corporateTreasuryManagementPlanInstanceRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceRecord(CRCorporateTreasuryManagementPlanCaptureInputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord) {
    this.corporateTreasuryManagementPlanInstanceRecord = corporateTreasuryManagementPlanInstanceRecord;
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

