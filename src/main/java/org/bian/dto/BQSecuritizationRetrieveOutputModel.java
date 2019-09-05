package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSecuritizationRetrieveOutputModelSecuritizationInstanceAnalysis;
import org.bian.dto.BQSecuritizationRetrieveOutputModelSecuritizationInstanceRecord;
import org.bian.dto.BQSecuritizationRetrieveOutputModelSecuritizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSecuritizationRetrieveOutputModel
 */
public class BQSecuritizationRetrieveOutputModel   {
  private BQSecuritizationRetrieveOutputModelSecuritizationInstanceRecord securitizationInstanceRecord = null;

  private String securitizationRetrieveActionTaskReference = null;

  private Object securitizationRetrieveActionTaskRecord = null;

  private String securitizationRetrieveActionResponse = null;

  private BQSecuritizationRetrieveOutputModelSecuritizationInstanceReport securitizationInstanceReport = null;

  private BQSecuritizationRetrieveOutputModelSecuritizationInstanceAnalysis securitizationInstanceAnalysis = null;


  /**
   * Get securitizationInstanceRecord
   * @return securitizationInstanceRecord
  **/

  public BQSecuritizationRetrieveOutputModelSecuritizationInstanceRecord getSecuritizationInstanceRecord() {
    return securitizationInstanceRecord;
  }

  public void setSecuritizationInstanceRecord(BQSecuritizationRetrieveOutputModelSecuritizationInstanceRecord securitizationInstanceRecord) {
    this.securitizationInstanceRecord = securitizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Securitization instance retrieve service call 
   * @return securitizationRetrieveActionTaskReference
  **/

  public String getSecuritizationRetrieveActionTaskReference() {
    return securitizationRetrieveActionTaskReference;
  }

  public void setSecuritizationRetrieveActionTaskReference(String securitizationRetrieveActionTaskReference) {
    this.securitizationRetrieveActionTaskReference = securitizationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return securitizationRetrieveActionResponse
  **/

  public String getSecuritizationRetrieveActionResponse() {
    return securitizationRetrieveActionResponse;
  }

  public void setSecuritizationRetrieveActionResponse(String securitizationRetrieveActionResponse) {
    this.securitizationRetrieveActionResponse = securitizationRetrieveActionResponse;
  }


  /**
   * Get securitizationInstanceReport
   * @return securitizationInstanceReport
  **/

  public BQSecuritizationRetrieveOutputModelSecuritizationInstanceReport getSecuritizationInstanceReport() {
    return securitizationInstanceReport;
  }

  public void setSecuritizationInstanceReport(BQSecuritizationRetrieveOutputModelSecuritizationInstanceReport securitizationInstanceReport) {
    this.securitizationInstanceReport = securitizationInstanceReport;
  }


  /**
   * Get securitizationInstanceAnalysis
   * @return securitizationInstanceAnalysis
  **/

  public BQSecuritizationRetrieveOutputModelSecuritizationInstanceAnalysis getSecuritizationInstanceAnalysis() {
    return securitizationInstanceAnalysis;
  }

  public void setSecuritizationInstanceAnalysis(BQSecuritizationRetrieveOutputModelSecuritizationInstanceAnalysis securitizationInstanceAnalysis) {
    this.securitizationInstanceAnalysis = securitizationInstanceAnalysis;
  }


}

