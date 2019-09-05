package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStrategicFundingRetrieveInputModelStrategicFundingInstanceAnalysis;
import org.bian.dto.BQStrategicFundingRetrieveInputModelStrategicFundingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingRetrieveInputModel
 */
public class BQStrategicFundingRetrieveInputModel   {
  private Object strategicFundingRetrieveActionTaskRecord = null;

  private String strategicFundingRetrieveActionRequest = null;

  private BQStrategicFundingRetrieveInputModelStrategicFundingInstanceReport strategicFundingInstanceReport = null;

  private BQStrategicFundingRetrieveInputModelStrategicFundingInstanceAnalysis strategicFundingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return strategicFundingRetrieveActionTaskRecord
  **/

  public Object getStrategicFundingRetrieveActionTaskRecord() {
    return strategicFundingRetrieveActionTaskRecord;
  }

  public void setStrategicFundingRetrieveActionTaskRecord(Object strategicFundingRetrieveActionTaskRecord) {
    this.strategicFundingRetrieveActionTaskRecord = strategicFundingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return strategicFundingRetrieveActionRequest
  **/

  public String getStrategicFundingRetrieveActionRequest() {
    return strategicFundingRetrieveActionRequest;
  }

  public void setStrategicFundingRetrieveActionRequest(String strategicFundingRetrieveActionRequest) {
    this.strategicFundingRetrieveActionRequest = strategicFundingRetrieveActionRequest;
  }


  /**
   * Get strategicFundingInstanceReport
   * @return strategicFundingInstanceReport
  **/

  public BQStrategicFundingRetrieveInputModelStrategicFundingInstanceReport getStrategicFundingInstanceReport() {
    return strategicFundingInstanceReport;
  }

  public void setStrategicFundingInstanceReport(BQStrategicFundingRetrieveInputModelStrategicFundingInstanceReport strategicFundingInstanceReport) {
    this.strategicFundingInstanceReport = strategicFundingInstanceReport;
  }


  /**
   * Get strategicFundingInstanceAnalysis
   * @return strategicFundingInstanceAnalysis
  **/

  public BQStrategicFundingRetrieveInputModelStrategicFundingInstanceAnalysis getStrategicFundingInstanceAnalysis() {
    return strategicFundingInstanceAnalysis;
  }

  public void setStrategicFundingInstanceAnalysis(BQStrategicFundingRetrieveInputModelStrategicFundingInstanceAnalysis strategicFundingInstanceAnalysis) {
    this.strategicFundingInstanceAnalysis = strategicFundingInstanceAnalysis;
  }


}

