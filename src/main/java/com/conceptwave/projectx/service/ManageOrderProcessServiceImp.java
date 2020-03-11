package com.conceptwave.projectx.service;

import com.conceptwave.projectx.consumer.ManageOrderProcessConsumer;
import com.conceptwave.projectx.producer.ManageOrderProcessProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.turktelekom.ManageOrderProcessRequest;
import tr.com.turktelekom.ManageOrderProcessResponse;

@Service
public class ManageOrderProcessServiceImp implements ManageOrderProcessService {
    @Autowired
    private ManageOrderProcessProducer manageOrderProcessProducer;

    @Autowired
    private ManageOrderProcessConsumer manageOrderProcessConsumer;

    @Override
    public void send(ManageOrderProcessRequest manageOrderProcessRequest) {
        manageOrderProcessProducer.send(manageOrderProcessRequest);
    }

    @Override
    public ManageOrderProcessResponse receive() {
        return manageOrderProcessConsumer.receive();
    }
}
