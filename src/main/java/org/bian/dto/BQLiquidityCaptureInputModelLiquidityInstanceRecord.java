package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLiquidityCaptureInputModelLiquidityInstanceRecord
 */
public class BQLiquidityCaptureInputModelLiquidityInstanceRecord   {
  private String enterpriseLargePaymentTransactionRecords = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of large transactions that impact the treasury position that need to be considered individually  
   * @return enterpriseLargePaymentTransactionRecords
  **/

  public String getEnterpriseLargePaymentTransactionRecords() {
    return enterpriseLargePaymentTransactionRecords;
  }

  public void setEnterpriseLargePaymentTransactionRecords(String enterpriseLargePaymentTransactionRecords) {
    this.enterpriseLargePaymentTransactionRecords = enterpriseLargePaymentTransactionRecords;
  }


}

