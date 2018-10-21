/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface OpenItemManagementApiService {

	OpenItemProcedureBaseWithIdAndRoot executePost(OpenItemProcedureBase request);
	
	OpenItemProcedureBaseWithIdAndRoot executePut(String crReferenceId, OpenItemProcedureBase request);
	
	OpenItemRecordResponse record(String crReferenceId, OpenItemRecordRequest request);
	
	OpenItemTrackingBaseWIthIds requestPost(OpenItemTrackingBase request);
	
	OpenItemTrackingBaseWIthIds requestPut(String crReferenceId, OpenItemTrackingBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	OpenItemProcedureBaseWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	OpenItemTrackingBaseWIthIds retrieveTrackings(String crReferenceId, String bqReferenceId);
	
	OpenItemProcedureUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	OpenItemRecordBaseWithIdAndRoot retrieveRecords(String crReferenceId, String bqReferenceId);
	
	OpenItemProcedureUpdateBaseWithIdAndRoot update(String crReferenceId, OpenItemProcedureUpdateBase request);
	
}
