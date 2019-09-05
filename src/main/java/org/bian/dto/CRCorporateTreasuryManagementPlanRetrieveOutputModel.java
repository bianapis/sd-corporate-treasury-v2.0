package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord;
import org.bian.dto.CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceAnalysis;
import org.bian.dto.CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTreasuryManagementPlanRetrieveOutputModel
 */
public class CRCorporateTreasuryManagementPlanRetrieveOutputModel   {
  private CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord = null;

  private String corporateTreasuryManagementPlanRetrieveActionTaskReference = null;

  private Object corporateTreasuryManagementPlanRetrieveActionTaskRecord = null;

  private String corporateTreasuryManagementPlanRetrieveActionResponse = null;

  private CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceReportRecord corporateTreasuryManagementPlanInstanceReportRecord = null;

  private CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceAnalysis corporateTreasuryManagementPlanInstanceAnalysis = null;


  /**
   * Get corporateTreasuryManagementPlanInstanceRecord
   * @return corporateTreasuryManagementPlanInstanceRecord
  **/

  public CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord getCorporateTreasuryManagementPlanInstanceRecord() {
    return corporateTreasuryManagementPlanInstanceRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceRecord(CRCorporateTreasuryManagementPlanInitiateInputModelCorporateTreasuryManagementPlanInstanceRecord corporateTreasuryManagementPlanInstanceRecord) {
    this.corporateTreasuryManagementPlanInstanceRecord = corporateTreasuryManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Treasury Management Plan instance retrieve service call 
   * @return corporateTreasuryManagementPlanRetrieveActionTaskReference
  **/

  public String getCorporateTreasuryManagementPlanRetrieveActionTaskReference() {
    return corporateTreasuryManagementPlanRetrieveActionTaskReference;
  }

  public void setCorporateTreasuryManagementPlanRetrieveActionTaskReference(String corporateTreasuryManagementPlanRetrieveActionTaskReference) {
    this.corporateTreasuryManagementPlanRetrieveActionTaskReference = corporateTreasuryManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateTreasuryManagementPlanRetrieveActionResponse
  **/

  public String getCorporateTreasuryManagementPlanRetrieveActionResponse() {
    return corporateTreasuryManagementPlanRetrieveActionResponse;
  }

  public void setCorporateTreasuryManagementPlanRetrieveActionResponse(String corporateTreasuryManagementPlanRetrieveActionResponse) {
    this.corporateTreasuryManagementPlanRetrieveActionResponse = corporateTreasuryManagementPlanRetrieveActionResponse;
  }


  /**
   * Get corporateTreasuryManagementPlanInstanceReportRecord
   * @return corporateTreasuryManagementPlanInstanceReportRecord
  **/

  public CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceReportRecord getCorporateTreasuryManagementPlanInstanceReportRecord() {
    return corporateTreasuryManagementPlanInstanceReportRecord;
  }

  public void setCorporateTreasuryManagementPlanInstanceReportRecord(CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceReportRecord corporateTreasuryManagementPlanInstanceReportRecord) {
    this.corporateTreasuryManagementPlanInstanceReportRecord = corporateTreasuryManagementPlanInstanceReportRecord;
  }


  /**
   * Get corporateTreasuryManagementPlanInstanceAnalysis
   * @return corporateTreasuryManagementPlanInstanceAnalysis
  **/

  public CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceAnalysis getCorporateTreasuryManagementPlanInstanceAnalysis() {
    return corporateTreasuryManagementPlanInstanceAnalysis;
  }

  public void setCorporateTreasuryManagementPlanInstanceAnalysis(CRCorporateTreasuryManagementPlanRetrieveOutputModelCorporateTreasuryManagementPlanInstanceAnalysis corporateTreasuryManagementPlanInstanceAnalysis) {
    this.corporateTreasuryManagementPlanInstanceAnalysis = corporateTreasuryManagementPlanInstanceAnalysis;
  }


}

