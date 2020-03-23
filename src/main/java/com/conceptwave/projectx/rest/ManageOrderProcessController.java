package com.conceptwave.projectx.rest;

import com.conceptwave.projectx.service.ManageOrderProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.turktelekom.ManageOrderProcessRequest;
import tr.com.turktelekom.ManageOrderProcessResponse;

@RestController
@RequestMapping("jms/mop")
public class ManageOrderProcessController {
    @Autowired
    private ManageOrderProcessService manageOrderProcessService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ManageOrderProcessResponse get(@RequestParam("subscriptionId") String subscriptionId, @RequestParam("requestId") String requestId) {
        ManageOrderProcessRequest manageOrderProcessRequest = new ManageOrderProcessRequest();
        manageOrderProcessRequest.setRequestId(requestId);
        manageOrderProcessRequest.setSubscriptionId(subscriptionId);
        manageOrderProcessService.send(manageOrderProcessRequest);
        return manageOrderProcessService.receive();
    }
}
