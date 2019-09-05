/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateTreasuryApiService {

	SDCorporateTreasuryActivateOutputModel activate(SDCorporateTreasuryActivateInputModel request);
	
	BQLiquidityCaptureOutputModel captureLiquidity(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLiquidityCaptureInputModel request);
	
	BQStrategicFundingCaptureOutputModel captureStrategicfunding(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStrategicFundingCaptureInputModel request);
	
	CRCorporateTreasuryManagementPlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCorporateTreasuryManagementPlanCaptureInputModel request);
	
	SDCorporateTreasuryConfigureOutputModel configure(String sdReferenceId, SDCorporateTreasuryConfigureInputModel request);
	
	SDCorporateTreasuryFeedbackOutputModel feedback(String sdReferenceId, SDCorporateTreasuryFeedbackInputModel request);
	
	CRCorporateTreasuryManagementPlanInitiateOutputModel initiate(String sdReferenceId, CRCorporateTreasuryManagementPlanInitiateInputModel request);
	
	CRCorporateTreasuryManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBankRatesRetrieveOutputModel retrieveBankrates(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQLiquidityRetrieveOutputModel retrieveLiquidity(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSecuritizationRetrieveOutputModel retrieveSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQStrategicFundingRetrieveOutputModel retrieveStrategicfunding(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTacticalFundingRetrieveOutputModel retrieveTacticalfunding(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorporateTreasuryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorporateTreasuryManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateTreasuryManagementPlanUpdateInputModel request);
	
	BQSecuritizationUpdateOutputModel updateSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationUpdateInputModel request);
	
}
