package com.conceptwave.projectx.rest;

import com.conceptwave.projectx.service.RetrieveBillableSubscriptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.turktelekom.RetrieveBillableSubscriptionsRequest;
import tr.com.turktelekom.RetrieveBillableSubscriptionsResponse;

@RestController
@RequestMapping("jms/rbs")
public class RetrieveBillableSubscriptionsController {
    @Autowired
    private RetrieveBillableSubscriptionsService retrieveBillableSubscriptionsService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public RetrieveBillableSubscriptionsResponse get(@RequestParam String projectCode) {
        RetrieveBillableSubscriptionsRequest retrieveBillableSubscriptionsRequest = new RetrieveBillableSubscriptionsRequest();
        retrieveBillableSubscriptionsRequest.setRequestId("23423234234");
        retrieveBillableSubscriptionsRequest.setTurnKeyProjectCode(projectCode);
        retrieveBillableSubscriptionsService.send(retrieveBillableSubscriptionsRequest);
        return retrieveBillableSubscriptionsService.receive();
    }
}