package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceAnalysis;
import org.bian.dto.BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceRecord;
import org.bian.dto.BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTacticalFundingRetrieveOutputModel
 */
public class BQTacticalFundingRetrieveOutputModel   {
  private BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceRecord tacticalFundingInstanceRecord = null;

  private String tacticalFundingRetrieveActionTaskReference = null;

  private Object tacticalFundingRetrieveActionTaskRecord = null;

  private String tacticalFundingRetrieveActionResponse = null;

  private BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceReport tacticalFundingInstanceReport = null;

  private BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceAnalysis tacticalFundingInstanceAnalysis = null;


  /**
   * Get tacticalFundingInstanceRecord
   * @return tacticalFundingInstanceRecord
  **/

  public BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceRecord getTacticalFundingInstanceRecord() {
    return tacticalFundingInstanceRecord;
  }

  public void setTacticalFundingInstanceRecord(BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceRecord tacticalFundingInstanceRecord) {
    this.tacticalFundingInstanceRecord = tacticalFundingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tactical Funding instance retrieve service call 
   * @return tacticalFundingRetrieveActionTaskReference
  **/

  public String getTacticalFundingRetrieveActionTaskReference() {
    return tacticalFundingRetrieveActionTaskReference;
  }

  public void setTacticalFundingRetrieveActionTaskReference(String tacticalFundingRetrieveActionTaskReference) {
    this.tacticalFundingRetrieveActionTaskReference = tacticalFundingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return tacticalFundingRetrieveActionTaskRecord
  **/

  public Object getTacticalFundingRetrieveActionTaskRecord() {
    return tacticalFundingRetrieveActionTaskRecord;
  }

  public void setTacticalFundingRetrieveActionTaskRecord(Object tacticalFundingRetrieveActionTaskRecord) {
    this.tacticalFundingRetrieveActionTaskRecord = tacticalFundingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return tacticalFundingRetrieveActionResponse
  **/

  public String getTacticalFundingRetrieveActionResponse() {
    return tacticalFundingRetrieveActionResponse;
  }

  public void setTacticalFundingRetrieveActionResponse(String tacticalFundingRetrieveActionResponse) {
    this.tacticalFundingRetrieveActionResponse = tacticalFundingRetrieveActionResponse;
  }


  /**
   * Get tacticalFundingInstanceReport
   * @return tacticalFundingInstanceReport
  **/

  public BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceReport getTacticalFundingInstanceReport() {
    return tacticalFundingInstanceReport;
  }

  public void setTacticalFundingInstanceReport(BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceReport tacticalFundingInstanceReport) {
    this.tacticalFundingInstanceReport = tacticalFundingInstanceReport;
  }


  /**
   * Get tacticalFundingInstanceAnalysis
   * @return tacticalFundingInstanceAnalysis
  **/

  public BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceAnalysis getTacticalFundingInstanceAnalysis() {
    return tacticalFundingInstanceAnalysis;
  }

  public void setTacticalFundingInstanceAnalysis(BQTacticalFundingRetrieveOutputModelTacticalFundingInstanceAnalysis tacticalFundingInstanceAnalysis) {
    this.tacticalFundingInstanceAnalysis = tacticalFundingInstanceAnalysis;
  }


}

