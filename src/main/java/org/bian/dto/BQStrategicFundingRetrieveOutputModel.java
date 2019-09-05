package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceAnalysis;
import org.bian.dto.BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceRecord;
import org.bian.dto.BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingRetrieveOutputModel
 */
public class BQStrategicFundingRetrieveOutputModel   {
  private BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceRecord strategicFundingInstanceRecord = null;

  private String strategicFundingRetrieveActionTaskReference = null;

  private Object strategicFundingRetrieveActionTaskRecord = null;

  private String strategicFundingRetrieveActionResponse = null;

  private BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceReport strategicFundingInstanceReport = null;

  private BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceAnalysis strategicFundingInstanceAnalysis = null;


  /**
   * Get strategicFundingInstanceRecord
   * @return strategicFundingInstanceRecord
  **/

  public BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceRecord getStrategicFundingInstanceRecord() {
    return strategicFundingInstanceRecord;
  }

  public void setStrategicFundingInstanceRecord(BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceRecord strategicFundingInstanceRecord) {
    this.strategicFundingInstanceRecord = strategicFundingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Strategic Funding instance retrieve service call 
   * @return strategicFundingRetrieveActionTaskReference
  **/

  public String getStrategicFundingRetrieveActionTaskReference() {
    return strategicFundingRetrieveActionTaskReference;
  }

  public void setStrategicFundingRetrieveActionTaskReference(String strategicFundingRetrieveActionTaskReference) {
    this.strategicFundingRetrieveActionTaskReference = strategicFundingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return strategicFundingRetrieveActionResponse
  **/

  public String getStrategicFundingRetrieveActionResponse() {
    return strategicFundingRetrieveActionResponse;
  }

  public void setStrategicFundingRetrieveActionResponse(String strategicFundingRetrieveActionResponse) {
    this.strategicFundingRetrieveActionResponse = strategicFundingRetrieveActionResponse;
  }


  /**
   * Get strategicFundingInstanceReport
   * @return strategicFundingInstanceReport
  **/

  public BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceReport getStrategicFundingInstanceReport() {
    return strategicFundingInstanceReport;
  }

  public void setStrategicFundingInstanceReport(BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceReport strategicFundingInstanceReport) {
    this.strategicFundingInstanceReport = strategicFundingInstanceReport;
  }


  /**
   * Get strategicFundingInstanceAnalysis
   * @return strategicFundingInstanceAnalysis
  **/

  public BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceAnalysis getStrategicFundingInstanceAnalysis() {
    return strategicFundingInstanceAnalysis;
  }

  public void setStrategicFundingInstanceAnalysis(BQStrategicFundingRetrieveOutputModelStrategicFundingInstanceAnalysis strategicFundingInstanceAnalysis) {
    this.strategicFundingInstanceAnalysis = strategicFundingInstanceAnalysis;
  }


}

