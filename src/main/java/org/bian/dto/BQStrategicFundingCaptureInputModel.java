package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStrategicFundingCaptureInputModelStrategicFundingInstanceRecord;
import org.bian.dto.CRCorporateTreasuryManagementPlanCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingCaptureInputModel
 */
public class BQStrategicFundingCaptureInputModel   {
  private String corporateTreasuryManagementPlanInstanceReference = null;

  private String strategicFundingInstanceReference = null;

  private BQStrategicFundingCaptureInputModelStrategicFundingInstanceRecord strategicFundingInstanceRecord = null;

  private Object strategicFundingCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Strategic Funding instance 
   * @return strategicFundingInstanceReference
  **/

  public String getStrategicFundingInstanceReference() {
    return strategicFundingInstanceReference;
  }

  public void setStrategicFundingInstanceReference(String strategicFundingInstanceReference) {
    this.strategicFundingInstanceReference = strategicFundingInstanceReference;
  }


  /**
   * Get strategicFundingInstanceRecord
   * @return strategicFundingInstanceRecord
  **/

  public BQStrategicFundingCaptureInputModelStrategicFundingInstanceRecord getStrategicFundingInstanceRecord() {
    return strategicFundingInstanceRecord;
  }

  public void setStrategicFundingInstanceRecord(BQStrategicFundingCaptureInputModelStrategicFundingInstanceRecord strategicFundingInstanceRecord) {
    this.strategicFundingInstanceRecord = strategicFundingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return strategicFundingCaptureActionTaskRecord
  **/

  public Object getStrategicFundingCaptureActionTaskRecord() {
    return strategicFundingCaptureActionTaskRecord;
  }

  public void setStrategicFundingCaptureActionTaskRecord(Object strategicFundingCaptureActionTaskRecord) {
    this.strategicFundingCaptureActionTaskRecord = strategicFundingCaptureActionTaskRecord;
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

