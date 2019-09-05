package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSecuritizationUpdateInputModelSecuritizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSecuritizationUpdateInputModel
 */
public class BQSecuritizationUpdateInputModel   {
  private String corporateTreasuryManagementPlanInstanceReference = null;

  private String securitizationInstanceReference = null;

  private BQSecuritizationUpdateInputModelSecuritizationInstanceRecord securitizationInstanceRecord = null;

  private Object securitizationUpdateActionTaskRecord = null;

  private String securitizationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Securitization instance 
   * @return securitizationInstanceReference
  **/

  public String getSecuritizationInstanceReference() {
    return securitizationInstanceReference;
  }

  public void setSecuritizationInstanceReference(String securitizationInstanceReference) {
    this.securitizationInstanceReference = securitizationInstanceReference;
  }


  /**
   * Get securitizationInstanceRecord
   * @return securitizationInstanceRecord
  **/

  public BQSecuritizationUpdateInputModelSecuritizationInstanceRecord getSecuritizationInstanceRecord() {
    return securitizationInstanceRecord;
  }

  public void setSecuritizationInstanceRecord(BQSecuritizationUpdateInputModelSecuritizationInstanceRecord securitizationInstanceRecord) {
    this.securitizationInstanceRecord = securitizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return securitizationUpdateActionTaskRecord
  **/

  public Object getSecuritizationUpdateActionTaskRecord() {
    return securitizationUpdateActionTaskRecord;
  }

  public void setSecuritizationUpdateActionTaskRecord(Object securitizationUpdateActionTaskRecord) {
    this.securitizationUpdateActionTaskRecord = securitizationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return securitizationUpdateActionRequest
  **/

  public String getSecuritizationUpdateActionRequest() {
    return securitizationUpdateActionRequest;
  }

  public void setSecuritizationUpdateActionRequest(String securitizationUpdateActionRequest) {
    this.securitizationUpdateActionRequest = securitizationUpdateActionRequest;
  }


}

