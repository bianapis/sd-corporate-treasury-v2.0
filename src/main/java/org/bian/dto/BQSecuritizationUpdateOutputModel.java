package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSecuritizationUpdateInputModelSecuritizationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSecuritizationUpdateOutputModel
 */
public class BQSecuritizationUpdateOutputModel   {
  private BQSecuritizationUpdateInputModelSecuritizationInstanceRecord securitizationInstanceRecord = null;

  private String securitizationUpdateActionTaskReference = null;

  private Object securitizationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return securitizationUpdateActionTaskReference
  **/

  public String getSecuritizationUpdateActionTaskReference() {
    return securitizationUpdateActionTaskReference;
  }

  public void setSecuritizationUpdateActionTaskReference(String securitizationUpdateActionTaskReference) {
    this.securitizationUpdateActionTaskReference = securitizationUpdateActionTaskReference;
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

