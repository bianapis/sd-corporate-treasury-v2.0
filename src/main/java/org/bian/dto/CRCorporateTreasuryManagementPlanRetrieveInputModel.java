package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceAnalysis;
import org.bian.dto.CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanRetrieveInputModel
 */
public class CRCorporateTreasuryManagementPlanRetrieveInputModel   {
  private Object corporateTreasuryManagementPlanRetrieveActionTaskRecord = null;

  private String corporateTreasuryManagementPlanRetrieveActionRequest = null;

  private CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceReportRecord corporateTreasuryManagementPlanInstanceReportRecord = null;

  private CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceAnalysis corporateTreasuryManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateTreasuryManagementPlanRetrieveActionTaskRecord
  **/

  public Object getCorporateTreasuryManagementPlanRetrieveActionTaskRecord() {
    return corporateTreasuryManagementPlanRetrieveActionTaskRecord;
  }

  public void setCorporateTreasuryManagementPlanRetrieveActionTaskRecord(Object corporateTreasuryManagementPlanRetrieveActionTaskRecord) {
    this.corporateTreasuryManagementPlanRetrieveActionTaskRecord = corporateTreasuryManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateTreasuryManagementPlanRetrieveActionRequest
  **/

  public String getCorporateTreasuryManagementPlanRetrieveActionRequest() {
    return corporateTreasuryManagementPlanRetrieveActionRequest;
  }

  public void setCorporateTreasuryManagementPlanRetrieveActionRequest(String corporateTreasuryManagementPlanRetrieveActionRequest) {
    this.corporateTreasuryManagementPlanRetrieveActionRequest = corporateTreasuryManagementPlanRetrieveActionRequest;
  }


  /**
   * Get corporateTreasuryManagementPlanInstanceReportRecord
   * @return corporateTreasuryManagementPlanInstanceReportRecord
  **/

  public CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceReportRecord getCorporateTreasuryManagementPlanInstanceReportRecord() {
    return corporateTreasuryManagementPlanInstanceReportRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceReportRecord(CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceReportRecord corporateTreasuryManagementPlanInstanceReportRecord) {
    this.corporateTreasuryManagementPlanInstanceReportRecord = corporateTreasuryManagementPlanInstanceReportRecord;
  }


  /**
   * Get corporateTreasuryManagementPlanInstanceAnalysis
   * @return corporateTreasuryManagementPlanInstanceAnalysis
  **/

  public CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceAnalysis getCorporateTreasuryManagementPlanInstanceAnalysis() {
    return corporateTreasuryManagementPlanInstanceAnalysis;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysis(CRCorporateTreasuryManagementPlanRetrieveInputModelCorporateTreasuryManagementPlanInstanceAnalysis corporateTreasuryManagementPlanInstanceAnalysis) {
    this.corporateTreasuryManagementPlanInstanceAnalysis = corporateTreasuryManagementPlanInstanceAnalysis;
  }


}

