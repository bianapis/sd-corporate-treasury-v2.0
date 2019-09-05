package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLiquidityRetrieveInputModelLiquidityInstanceAnalysis;
import org.bian.dto.BQLiquidityRetrieveInputModelLiquidityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLiquidityRetrieveInputModel
 */
public class BQLiquidityRetrieveInputModel   {
  private Object liquidityRetrieveActionTaskRecord = null;

  private String liquidityRetrieveActionRequest = null;

  private BQLiquidityRetrieveInputModelLiquidityInstanceReport liquidityInstanceReport = null;

  private BQLiquidityRetrieveInputModelLiquidityInstanceAnalysis liquidityInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return liquidityRetrieveActionTaskRecord
  **/

  public Object getLiquidityRetrieveActionTaskRecord() {
    return liquidityRetrieveActionTaskRecord;
  }

  public void setLiquidityRetrieveActionTaskRecord(Object liquidityRetrieveActionTaskRecord) {
    this.liquidityRetrieveActionTaskRecord = liquidityRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return liquidityRetrieveActionRequest
  **/

  public String getLiquidityRetrieveActionRequest() {
    return liquidityRetrieveActionRequest;
  }

  public void setLiquidityRetrieveActionRequest(String liquidityRetrieveActionRequest) {
    this.liquidityRetrieveActionRequest = liquidityRetrieveActionRequest;
  }


  /**
   * Get liquidityInstanceReport
   * @return liquidityInstanceReport
  **/

  public BQLiquidityRetrieveInputModelLiquidityInstanceReport getLiquidityInstanceReport() {
    return liquidityInstanceReport;
  }

  public void setLiquidityInstanceReport(BQLiquidityRetrieveInputModelLiquidityInstanceReport liquidityInstanceReport) {
    this.liquidityInstanceReport = liquidityInstanceReport;
  }


  /**
   * Get liquidityInstanceAnalysis
   * @return liquidityInstanceAnalysis
  **/

  public BQLiquidityRetrieveInputModelLiquidityInstanceAnalysis getLiquidityInstanceAnalysis() {
    return liquidityInstanceAnalysis;
  }

  public void setLiquidityInstanceAnalysis(BQLiquidityRetrieveInputModelLiquidityInstanceAnalysis liquidityInstanceAnalysis) {
    this.liquidityInstanceAnalysis = liquidityInstanceAnalysis;
  }


}

