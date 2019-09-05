package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTacticalFundingRetrieveInputModelTacticalFundingInstanceAnalysis
 */
public class BQTacticalFundingRetrieveInputModelTacticalFundingInstanceAnalysis   {
  private String tacticalFundingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return tacticalFundingInstanceAnalysisReference
  **/

  public String getTacticalFundingInstanceAnalysisReference() {
    return tacticalFundingInstanceAnalysisReference;
  }

  public void setTacticalFundingInstanceAnalysisReference(String tacticalFundingInstanceAnalysisReference) {
    this.tacticalFundingInstanceAnalysisReference = tacticalFundingInstanceAnalysisReference;
  }


}

