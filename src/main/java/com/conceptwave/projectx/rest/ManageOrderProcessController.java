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

    @GetMapping("/subscriptionId")
    @CrossOrigin(origins = "http://localhost:8081")
    public ManageOrderProcessResponse get(@RequestParam(defaultValue="145646456456") String subscriptionId) {
        ManageOrderProcessRequest manageOrderProcessRequest = new ManageOrderProcessRequest();
        manageOrderProcessRequest.setRequestId("23423234234");
        manageOrderProcessRequest.setSubscriptionId(subscriptionId);
        manageOrderProcessService.send(manageOrderProcessRequest);
        return manageOrderProcessService.receive();
    }
}
