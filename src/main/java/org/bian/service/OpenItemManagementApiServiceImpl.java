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
public class OpenItemManagementApiServiceImpl implements OpenItemManagementApiService {

	public OpenItemProcedureBaseWithIdAndRoot executePost(OpenItemProcedureBase request){
		return JsonReader.read("executePost-OpenItemProcedureBaseWithIdAndRoot.json",new TypeReference<OpenItemProcedureBaseWithIdAndRoot>(){});
	}
	
	public OpenItemProcedureBaseWithIdAndRoot executePut(String crReferenceId, OpenItemProcedureBase request){
		return JsonReader.read("executePut-OpenItemProcedureBaseWithIdAndRoot.json",new TypeReference<OpenItemProcedureBaseWithIdAndRoot>(){});
	}
	
	public OpenItemRecordResponse record(String crReferenceId, OpenItemRecordRequest request){
		return JsonReader.read("record-OpenItemRecordResponse.json",new TypeReference<OpenItemRecordResponse>(){});
	}
	
	public OpenItemTrackingBaseWIthIds requestPost(OpenItemTrackingBase request){
		return JsonReader.read("requestPost-OpenItemTrackingBaseWIthIds.json",new TypeReference<OpenItemTrackingBaseWIthIds>(){});
	}
	
	public OpenItemTrackingBaseWIthIds requestPut(String crReferenceId, OpenItemTrackingBase request){
		return JsonReader.read("requestPut-OpenItemTrackingBaseWIthIds.json",new TypeReference<OpenItemTrackingBaseWIthIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public OpenItemProcedureBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-OpenItemProcedureBaseWithIdAndRoot.json",new TypeReference<OpenItemProcedureBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public OpenItemTrackingBaseWIthIds retrieveTrackings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OpenItemTrackingBaseWIthIds.json",new TypeReference<OpenItemTrackingBaseWIthIds>(){});
	}
	
	public OpenItemProcedureUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OpenItemProcedureUpdateBaseWithIdAndRoot.json",new TypeReference<OpenItemProcedureUpdateBaseWithIdAndRoot>(){});
	}
	
	public OpenItemRecordBaseWithIdAndRoot retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OpenItemRecordBaseWithIdAndRoot.json",new TypeReference<OpenItemRecordBaseWithIdAndRoot>(){});
	}
	
	public OpenItemProcedureUpdateBaseWithIdAndRoot update(String crReferenceId, OpenItemProcedureUpdateBase request){
		return JsonReader.read("update-OpenItemProcedureUpdateBaseWithIdAndRoot.json",new TypeReference<OpenItemProcedureUpdateBaseWithIdAndRoot>(){});
	}
	
}
