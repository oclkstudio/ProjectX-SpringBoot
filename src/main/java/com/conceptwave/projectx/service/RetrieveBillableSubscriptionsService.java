package com.conceptwave.projectx.service;

import tr.com.turktelekom.RetrieveBillableSubscriptionsRequest;
import tr.com.turktelekom.RetrieveBillableSubscriptionsResponse;

public interface RetrieveBillableSubscriptionsService {
    public void send(RetrieveBillableSubscriptionsRequest retrieveBillableSubscriptionsRequest);
    public RetrieveBillableSubscriptionsResponse receive();
}
