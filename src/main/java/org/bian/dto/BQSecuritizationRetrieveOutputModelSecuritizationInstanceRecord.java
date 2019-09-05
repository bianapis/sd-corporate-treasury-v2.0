package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritizationRetrieveOutputModelSecuritizationInstanceRecord
 */
public class BQSecuritizationRetrieveOutputModelSecuritizationInstanceRecord   {
  private String bankSecuritizationPoliciesandguidelines = null;

  private String securitizationTrancheReference = null;

  private Object securitizationTrancheRecord = null;

  private String securitizationTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and guidelines that determine when and how asset securitization will be considered 
   * @return bankSecuritizationPoliciesandguidelines
  **/

  public String getBankSecuritizationPoliciesandguidelines() {
    return bankSecuritizationPoliciesandguidelines;
  }

  public void setBankSecuritizationPoliciesandguidelines(String bankSecuritizationPoliciesandguidelines) {
    this.bankSecuritizationPoliciesandguidelines = bankSecuritizationPoliciesandguidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a selected group of bank balance sheet assets that are bundled into a tranche for securitization 
   * @return securitizationTrancheReference
  **/

  public String getSecuritizationTrancheReference() {
    return securitizationTrancheReference;
  }

  public void setSecuritizationTrancheReference(String securitizationTrancheReference) {
    this.securitizationTrancheReference = securitizationTrancheReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of the bundled balance sheet items that are to be securitized 
   * @return securitizationTrancheRecord
  **/

  public Object getSecuritizationTrancheRecord() {
    return securitizationTrancheRecord;
  }

  public void setSecuritizationTrancheRecord(Object securitizationTrancheRecord) {
    this.securitizationTrancheRecord = securitizationTrancheRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of a response initiated by corporate treasury 
   * @return securitizationTask
  **/

  public String getSecuritizationTask() {
    return securitizationTask;
  }

  public void setSecuritizationTask(String securitizationTask) {
    this.securitizationTask = securitizationTask;
  }


}

