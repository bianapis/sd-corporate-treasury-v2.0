package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanInitiateOutputModel
 */
public class CRCorporateTreasuryManagementPlanInitiateOutputModel   {
  private String corporateTreasuryManagementPlanInstanceReference = null;

  private String corporateTreasuryManagementPlanInitiateActionReference = null;

  private Object corporateTreasuryManagementPlanInitiateActionRecord = null;

  private String corporateTreasuryManagementPlanInstanceStatus = null;

  private CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateTreasuryManagementPlanInitiateActionReference
  **/

  public String getCorporateTreasuryManagementPlanInitiateActionReference() {
    return corporateTreasuryManagementPlanInitiateActionReference;
  }

  public void setCorporateTreasuryManagementPlanInitiateActionReference(String corporateTreasuryManagementPlanInitiateActionReference) {
    this.corporateTreasuryManagementPlanInitiateActionReference = corporateTreasuryManagementPlanInitiateActionReference;
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

  public CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord getCorporateTreasuryManagementPlanInstanceRecord() {
    return corporateTreasuryManagementPlanInstanceRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceRecord(CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord) {
    this.corporateTreasuryManagementPlanInstanceRecord = corporateTreasuryManagementPlanInstanceRecord;
  }


}

