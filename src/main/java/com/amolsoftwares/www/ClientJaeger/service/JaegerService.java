package com.amolsoftwares.www.ClientJaeger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JaegerService {

    @Autowired
    RestTemplate restTemplate;

    public String get(Integer id) {
        return restTemplate
                .getForObject("http://localhost:8082/jaeger/server/" + id, String.class);
    }
}
