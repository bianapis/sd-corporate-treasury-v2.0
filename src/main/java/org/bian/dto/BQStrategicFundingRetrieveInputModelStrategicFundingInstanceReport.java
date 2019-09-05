package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStrategicFundingRetrieveInputModelStrategicFundingInstanceReport
 */
public class BQStrategicFundingRetrieveInputModelStrategicFundingInstanceReport   {
  private String strategicFundingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return strategicFundingInstanceReportReference
  **/

  public String getStrategicFundingInstanceReportReference() {
    return strategicFundingInstanceReportReference;
  }

  public void setStrategicFundingInstanceReportReference(String strategicFundingInstanceReportReference) {
    this.strategicFundingInstanceReportReference = strategicFundingInstanceReportReference;
  }


}

