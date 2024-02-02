package com.elhassen.cabbookdriver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.elhassen.cabbookdriver.constants.AppConstant;

@Service
public class CabLocationService {
    
    private static Logger logger = LoggerFactory.getLogger(CabLocationService.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location){
        logger.info("I'm inside of update location methode");
        logger.error("Hi, don't stop the server");
        kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
        return true;
    }
}