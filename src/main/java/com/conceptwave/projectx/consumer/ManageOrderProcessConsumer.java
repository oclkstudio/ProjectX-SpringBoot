package com.conceptwave.projectx.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import tr.com.turktelekom.ManageOrderProcessResponse;

@Component
public class ManageOrderProcessConsumer {
    private static final Logger logger = LoggerFactory.getLogger(ManageOrderProcessConsumer.class);
    private boolean received = true;
    private ManageOrderProcessResponse manageOrderProcessResponse;

    @JmsListener(destination = "${mop.queue.output}")
    public void listener(ManageOrderProcessResponse manageOrderProcessResponse) {
        if(manageOrderProcessResponse != null) {
            this.received = false;
            this.manageOrderProcessResponse = manageOrderProcessResponse;
        }
    }

    public ManageOrderProcessResponse receive() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while(this.received) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        logger.info("received message='{}'", this.manageOrderProcessResponse.toString());
        this.received = true;
        return this.manageOrderProcessResponse;
    }
}
