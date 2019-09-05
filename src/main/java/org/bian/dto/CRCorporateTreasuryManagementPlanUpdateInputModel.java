package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanUpdateInputModel
 */
public class CRCorporateTreasuryManagementPlanUpdateInputModel   {
  private String corporateTreasuryServicingSessionReference = null;

  private String corporateTreasuryManagementPlanInstanceReference = null;

  private CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;

  private Object corporateTreasuryManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord getCorporateTreasuryManagementPlanInstanceRecord() {
    return corporateTreasuryManagementPlanInstanceRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceRecord(CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord) {
    this.corporateTreasuryManagementPlanInstanceRecord = corporateTreasuryManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateTreasuryManagementPlanUpdateActionTaskRecord
  **/

  public Object getCorporateTreasuryManagementPlanUpdateActionTaskRecord() {
    return corporateTreasuryManagementPlanUpdateActionTaskRecord;
  }

  public void setCorporateTreasuryManagementPlanUpdateActionTaskRecord(Object corporateTreasuryManagementPlanUpdateActionTaskRecord) {
    this.corporateTreasuryManagementPlanUpdateActionTaskRecord = corporateTreasuryManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

