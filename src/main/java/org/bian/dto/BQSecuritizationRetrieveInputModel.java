package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSecuritizationRetrieveInputModelSecuritizationInstanceAnalysis;
import org.bian.dto.BQSecuritizationRetrieveInputModelSecuritizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSecuritizationRetrieveInputModel
 */
public class BQSecuritizationRetrieveInputModel   {
  private Object securitizationRetrieveActionTaskRecord = null;

  private String securitizationRetrieveActionRequest = null;

  private BQSecuritizationRetrieveInputModelSecuritizationInstanceReport securitizationInstanceReport = null;

  private BQSecuritizationRetrieveInputModelSecuritizationInstanceAnalysis securitizationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return securitizationRetrieveActionTaskRecord
  **/

  public Object getSecuritizationRetrieveActionTaskRecord() {
    return securitizationRetrieveActionTaskRecord;
  }

  public void setSecuritizationRetrieveActionTaskRecord(Object securitizationRetrieveActionTaskRecord) {
    this.securitizationRetrieveActionTaskRecord = securitizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return securitizationRetrieveActionRequest
  **/

  public String getSecuritizationRetrieveActionRequest() {
    return securitizationRetrieveActionRequest;
  }

  public void setSecuritizationRetrieveActionRequest(String securitizationRetrieveActionRequest) {
    this.securitizationRetrieveActionRequest = securitizationRetrieveActionRequest;
  }


  /**
   * Get securitizationInstanceReport
   * @return securitizationInstanceReport
  **/

  public BQSecuritizationRetrieveInputModelSecuritizationInstanceReport getSecuritizationInstanceReport() {
    return securitizationInstanceReport;
  }

  public void setSecuritizationInstanceReport(BQSecuritizationRetrieveInputModelSecuritizationInstanceReport securitizationInstanceReport) {
    this.securitizationInstanceReport = securitizationInstanceReport;
  }


  /**
   * Get securitizationInstanceAnalysis
   * @return securitizationInstanceAnalysis
  **/

  public BQSecuritizationRetrieveInputModelSecuritizationInstanceAnalysis getSecuritizationInstanceAnalysis() {
    return securitizationInstanceAnalysis;
  }

  public void setSecuritizationInstanceAnalysis(BQSecuritizationRetrieveInputModelSecuritizationInstanceAnalysis securitizationInstanceAnalysis) {
    this.securitizationInstanceAnalysis = securitizationInstanceAnalysis;
  }


}

