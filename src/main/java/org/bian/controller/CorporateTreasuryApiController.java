/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class CorporateTreasuryApiController {

	@Autowired
	CorporateTreasuryApiService service;
	
	@Manage.Activate
	public BianResponse<SDCorporateTreasuryActivateOutputModel> activate(@RequestBody BianRequest<SDCorporateTreasuryActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("liquidity")
	@Manage.Capture
	public BianResponse<BQLiquidityCaptureOutputModel> captureLiquidity(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLiquidityCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureLiquidity(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("strategicfunding")
	@Manage.Capture
	public BianResponse<BQStrategicFundingCaptureOutputModel> captureStrategicfunding(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStrategicFundingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureStrategicfunding(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Capture
	public BianResponse<CRCorporateTreasuryManagementPlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateTreasuryManagementPlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDCorporateTreasuryConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorporateTreasuryConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDCorporateTreasuryFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorporateTreasuryFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Initiate
	public BianResponse<CRCorporateTreasuryManagementPlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCorporateTreasuryManagementPlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Retrieve
	public BianResponse<CRCorporateTreasuryManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("bankrates")
	@Manage.Retrieve
	public BianResponse<BQBankRatesRetrieveOutputModel> retrieveBankrates(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBankrates(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("liquidity")
	@Manage.Retrieve
	public BianResponse<BQLiquidityRetrieveOutputModel> retrieveLiquidity(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLiquidity(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("securitization")
	@Manage.Retrieve
	public BianResponse<BQSecuritizationRetrieveOutputModel> retrieveSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSecuritization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("strategicfunding")
	@Manage.Retrieve
	public BianResponse<BQStrategicFundingRetrieveOutputModel> retrieveStrategicfunding(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStrategicfunding(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("tacticalfunding")
	@Manage.Retrieve
	public BianResponse<BQTacticalFundingRetrieveOutputModel> retrieveTacticalfunding(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTacticalfunding(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDCorporateTreasuryRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRCorporateTreasuryManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorporateTreasuryManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitization")
	@Manage.Update
	public BianResponse<BQSecuritizationUpdateOutputModel> updateSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSecuritizationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSecuritization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
