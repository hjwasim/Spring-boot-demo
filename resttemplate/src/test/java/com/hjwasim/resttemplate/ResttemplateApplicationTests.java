package com.hjwasim.resttemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ResttemplateApplicationTests {

    private static final String API_URL = "http://localhost:3000";

    @Test
    public void test_restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(API_URL + "/ping", String.class);
        Assertions.assertEquals(response.getBody(),"pong!");
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void test_resTemplatePojo(){
        RestTemplate restTemplate = new RestTemplate();
        Post response = restTemplate.getForObject(API_URL+"/post/1",Post.class);
        Assertions.assertNotNull(response);
        Assertions.assertEquals(response.getId(), 1);
        Assertions.assertEquals(response.getTitle(), "delectus aut autem");
    }
}
