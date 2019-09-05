package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTacticalFundingRetrieveInputModelTacticalFundingInstanceAnalysis;
import org.bian.dto.BQTacticalFundingRetrieveInputModelTacticalFundingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTacticalFundingRetrieveInputModel
 */
public class BQTacticalFundingRetrieveInputModel   {
  private Object tacticalFundingRetrieveActionTaskRecord = null;

  private String tacticalFundingRetrieveActionRequest = null;

  private BQTacticalFundingRetrieveInputModelTacticalFundingInstanceReport tacticalFundingInstanceReport = null;

  private BQTacticalFundingRetrieveInputModelTacticalFundingInstanceAnalysis tacticalFundingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return tacticalFundingRetrieveActionRequest
  **/

  public String getTacticalFundingRetrieveActionRequest() {
    return tacticalFundingRetrieveActionRequest;
  }

  public void setTacticalFundingRetrieveActionRequest(String tacticalFundingRetrieveActionRequest) {
    this.tacticalFundingRetrieveActionRequest = tacticalFundingRetrieveActionRequest;
  }


  /**
   * Get tacticalFundingInstanceReport
   * @return tacticalFundingInstanceReport
  **/

  public BQTacticalFundingRetrieveInputModelTacticalFundingInstanceReport getTacticalFundingInstanceReport() {
    return tacticalFundingInstanceReport;
  }

  public void setTacticalFundingInstanceReport(BQTacticalFundingRetrieveInputModelTacticalFundingInstanceReport tacticalFundingInstanceReport) {
    this.tacticalFundingInstanceReport = tacticalFundingInstanceReport;
  }


  /**
   * Get tacticalFundingInstanceAnalysis
   * @return tacticalFundingInstanceAnalysis
  **/

  public BQTacticalFundingRetrieveInputModelTacticalFundingInstanceAnalysis getTacticalFundingInstanceAnalysis() {
    return tacticalFundingInstanceAnalysis;
  }

  public void setTacticalFundingInstanceAnalysis(BQTacticalFundingRetrieveInputModelTacticalFundingInstanceAnalysis tacticalFundingInstanceAnalysis) {
    this.tacticalFundingInstanceAnalysis = tacticalFundingInstanceAnalysis;
  }


}

