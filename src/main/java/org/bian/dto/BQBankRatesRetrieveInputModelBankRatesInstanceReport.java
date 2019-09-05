package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankRatesRetrieveInputModelBankRatesInstanceReport
 */
public class BQBankRatesRetrieveInputModelBankRatesInstanceReport   {
  private String bankRatesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return bankRatesInstanceReportReference
  **/

  public String getBankRatesInstanceReportReference() {
    return bankRatesInstanceReportReference;
  }

  public void setBankRatesInstanceReportReference(String bankRatesInstanceReportReference) {
    this.bankRatesInstanceReportReference = bankRatesInstanceReportReference;
  }


}

