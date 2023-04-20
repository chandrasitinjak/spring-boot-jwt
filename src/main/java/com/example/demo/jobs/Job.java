package com.example.demo.jobs;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Job {
    //Task no 2
    @GetMapping(value = "/jobs")
    public List<Object> getJobs() {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
        RestTemplate restTemplate = new RestTemplate();

        Object[] jobs = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(jobs);

    }   


    //Task no 3
    @GetMapping("/job/{id}")
    public Object getJob(@PathVariable String id) {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions/"+id;
        RestTemplate restTemplate = new RestTemplate();

        Object jobs = restTemplate.getForObject(url, Object.class);
        return jobs;
    }
}
