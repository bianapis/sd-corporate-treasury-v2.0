package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingCaptureOutputModel
 */
public class BQStrategicFundingCaptureOutputModel   {
  private String strategicFundingCaptureActionTaskReference = null;

  private Object strategicFundingCaptureActionTaskRecord = null;

  private String strategicFundingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Strategic Funding instance capture service call 
   * @return strategicFundingCaptureActionTaskReference
  **/

  public String getStrategicFundingCaptureActionTaskReference() {
    return strategicFundingCaptureActionTaskReference;
  }

  public void setStrategicFundingCaptureActionTaskReference(String strategicFundingCaptureActionTaskReference) {
    this.strategicFundingCaptureActionTaskReference = strategicFundingCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Strategic Funding structured input transaction/record 
   * @return strategicFundingCaptureRecordReference
  **/

  public String getStrategicFundingCaptureRecordReference() {
    return strategicFundingCaptureRecordReference;
  }

  public void setStrategicFundingCaptureRecordReference(String strategicFundingCaptureRecordReference) {
    this.strategicFundingCaptureRecordReference = strategicFundingCaptureRecordReference;
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

