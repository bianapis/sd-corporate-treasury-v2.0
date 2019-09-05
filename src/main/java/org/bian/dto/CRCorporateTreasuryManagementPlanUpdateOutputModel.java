package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanUpdateOutputModel
 */
public class CRCorporateTreasuryManagementPlanUpdateOutputModel   {
  private CRCorporateTreasuryManagementPlanInitiateOutputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;

  private String corporateTreasuryManagementPlanUpdateActionTaskReference = null;

  private Object corporateTreasuryManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateTreasuryManagementPlanUpdateActionTaskReference
  **/

  public String getCorporateTreasuryManagementPlanUpdateActionTaskReference() {
    return corporateTreasuryManagementPlanUpdateActionTaskReference;
  }

  public void setCorporateTreasuryManagementPlanUpdateActionTaskReference(String corporateTreasuryManagementPlanUpdateActionTaskReference) {
    this.corporateTreasuryManagementPlanUpdateActionTaskReference = corporateTreasuryManagementPlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

