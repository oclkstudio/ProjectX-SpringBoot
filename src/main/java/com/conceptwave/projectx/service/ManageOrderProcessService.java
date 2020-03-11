package com.conceptwave.projectx.service;

import tr.com.turktelekom.ManageOrderProcessRequest;
import tr.com.turktelekom.ManageOrderProcessResponse;

public interface ManageOrderProcessService {
    public void send(ManageOrderProcessRequest manageOrderProcessRequest);
    public ManageOrderProcessResponse receive();
}
