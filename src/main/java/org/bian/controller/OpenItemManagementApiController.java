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
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class OpenItemManagementApiController {

	@Autowired
	OpenItemManagementApiService service;
	
	@Process.ExecutePost
	public BianResponse<OpenItemProcedureBaseWithIdAndRoot> executePost(@RequestBody BianRequest<OpenItemProcedureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<OpenItemProcedureBaseWithIdAndRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OpenItemProcedureBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<OpenItemRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OpenItemRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<OpenItemTrackingBaseWIthIds> requestPost(@RequestBody BianRequest<OpenItemTrackingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<OpenItemTrackingBaseWIthIds> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OpenItemTrackingBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.Retrieve
	public BianResponse<OpenItemProcedureBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("trackings")
	@Process.Retrieve
	public BianResponse<OpenItemTrackingBaseWIthIds> retrieveTrackings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTrackings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Process.Retrieve
	public BianResponse<OpenItemProcedureUpdateBaseWithIdAndRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@BQ("records")
	@Process.Retrieve
	public BianResponse<OpenItemRecordBaseWithIdAndRoot> retrieveRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRecords(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<OpenItemProcedureUpdateBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OpenItemProcedureUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
