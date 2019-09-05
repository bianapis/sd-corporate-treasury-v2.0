package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanInitiateInputModel
 */
public class CRCorporateTreasuryManagementPlanInitiateInputModel   {
  private String corporateTreasuryServicingSessionReference = null;

  private Object corporateTreasuryManagementPlanInitiateActionRecord = null;

  private String corporateTreasuryManagementPlanInstanceStatus = null;

  private CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateTreasuryManagementPlanInitiateActionRecord
  **/

  public Object getCorporateTreasuryManagementPlanInitiateActionRecord() {
    return corporateTreasuryManagementPlanInitiateActionRecord;
  }

  public void setCorporateTreasuryManagementPlanInitiateActionRecord(Object corporateTreasuryManagementPlanInitiateActionRecord) {
    this.corporateTreasuryManagementPlanInitiateActionRecord = corporateTreasuryManagementPlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Treasury Management Plan instance (e.g. initialised, pending, active) 
   * @return corporateTreasuryManagementPlanInstanceStatus
  **/

  public String getCorporateTreasuryManagementPlanInstanceStatus() {
    return corporateTreasuryManagementPlanInstanceStatus;
  }

  public void setCorporateTreasuryManagementPlanInstanceStatus(String corporateTreasuryManagementPlanInstanceStatus) {
    this.corporateTreasuryManagementPlanInstanceStatus = corporateTreasuryManagementPlanInstanceStatus;
  }


  /**
   * Get corporateTreasuryManagementPlanInstanceRecord
   * @return corporateTreasuryManagementPlanInstanceRecord
  **/

  public CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord getCorporateTreasuryManagementPlanInstanceRecord() {
    return corporateTreasuryManagementPlanInstanceRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceRecord(CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord) {
    this.corporateTreasuryManagementPlanInstanceRecord = corporateTreasuryManagementPlanInstanceRecord;
  }


}

