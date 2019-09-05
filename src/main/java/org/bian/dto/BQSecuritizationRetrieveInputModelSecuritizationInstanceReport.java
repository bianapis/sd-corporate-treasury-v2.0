package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritizationRetrieveInputModelSecuritizationInstanceReport
 */
public class BQSecuritizationRetrieveInputModelSecuritizationInstanceReport   {
  private String securitizationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return securitizationInstanceReportReference
  **/

  public String getSecuritizationInstanceReportReference() {
    return securitizationInstanceReportReference;
  }

  public void setSecuritizationInstanceReportReference(String securitizationInstanceReportReference) {
    this.securitizationInstanceReportReference = securitizationInstanceReportReference;
  }


}

