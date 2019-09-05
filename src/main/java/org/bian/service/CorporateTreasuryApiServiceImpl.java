/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorporateTreasuryApiServiceImpl implements CorporateTreasuryApiService {

	public SDCorporateTreasuryActivateOutputModel activate(SDCorporateTreasuryActivateInputModel request){
		return JsonReader.read("activate-SDCorporateTreasuryActivateOutputModel.json",new TypeReference<SDCorporateTreasuryActivateOutputModel>(){});
	}
	
	public BQLiquidityCaptureOutputModel captureLiquidity(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLiquidityCaptureInputModel request){
		return JsonReader.read("capture-BQLiquidityCaptureOutputModel.json",new TypeReference<BQLiquidityCaptureOutputModel>(){});
	}
	
	public BQStrategicFundingCaptureOutputModel captureStrategicfunding(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStrategicFundingCaptureInputModel request){
		return JsonReader.read("capture-BQStrategicFundingCaptureOutputModel.json",new TypeReference<BQStrategicFundingCaptureOutputModel>(){});
	}
	
	public CRCorporateTreasuryManagementPlanCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCorporateTreasuryManagementPlanCaptureInputModel request){
		return JsonReader.read("capture-CRCorporateTreasuryManagementPlanCaptureOutputModel.json",new TypeReference<CRCorporateTreasuryManagementPlanCaptureOutputModel>(){});
	}
	
	public SDCorporateTreasuryConfigureOutputModel configure(String sdReferenceId, SDCorporateTreasuryConfigureInputModel request){
		return JsonReader.read("configure-SDCorporateTreasuryConfigureOutputModel.json",new TypeReference<SDCorporateTreasuryConfigureOutputModel>(){});
	}
	
	public SDCorporateTreasuryFeedbackOutputModel feedback(String sdReferenceId, SDCorporateTreasuryFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorporateTreasuryFeedbackOutputModel.json",new TypeReference<SDCorporateTreasuryFeedbackOutputModel>(){});
	}
	
	public CRCorporateTreasuryManagementPlanInitiateOutputModel initiate(String sdReferenceId, CRCorporateTreasuryManagementPlanInitiateInputModel request){
		return JsonReader.read("initiate-CRCorporateTreasuryManagementPlanInitiateOutputModel.json",new TypeReference<CRCorporateTreasuryManagementPlanInitiateOutputModel>(){});
	}
	
	public CRCorporateTreasuryManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorporateTreasuryManagementPlanRetrieveOutputModel.json",new TypeReference<CRCorporateTreasuryManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBankRatesRetrieveOutputModel retrieveBankrates(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBankRatesRetrieveOutputModel.json",new TypeReference<BQBankRatesRetrieveOutputModel>(){});
	}
	
	public BQLiquidityRetrieveOutputModel retrieveLiquidity(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLiquidityRetrieveOutputModel.json",new TypeReference<BQLiquidityRetrieveOutputModel>(){});
	}
	
	public BQSecuritizationRetrieveOutputModel retrieveSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSecuritizationRetrieveOutputModel.json",new TypeReference<BQSecuritizationRetrieveOutputModel>(){});
	}
	
	public BQStrategicFundingRetrieveOutputModel retrieveStrategicfunding(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStrategicFundingRetrieveOutputModel.json",new TypeReference<BQStrategicFundingRetrieveOutputModel>(){});
	}
	
	public BQTacticalFundingRetrieveOutputModel retrieveTacticalfunding(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTacticalFundingRetrieveOutputModel.json",new TypeReference<BQTacticalFundingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorporateTreasuryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorporateTreasuryRetrieveOutputModel.json",new TypeReference<SDCorporateTreasuryRetrieveOutputModel>(){});
	}
	
	public CRCorporateTreasuryManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateTreasuryManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRCorporateTreasuryManagementPlanUpdateOutputModel.json",new TypeReference<CRCorporateTreasuryManagementPlanUpdateOutputModel>(){});
	}
	
	public BQSecuritizationUpdateOutputModel updateSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationUpdateInputModel request){
		return JsonReader.read("update-BQSecuritizationUpdateOutputModel.json",new TypeReference<BQSecuritizationUpdateOutputModel>(){});
	}
	
}
