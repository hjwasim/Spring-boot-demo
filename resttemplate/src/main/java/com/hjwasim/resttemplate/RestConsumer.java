package com.hjwasim.resttemplate;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Hjwasim
 */
@Component
public class RestConsumer {
    private static final String resourceURL = "http://localhost:3000/post/";

    public List<Post> getPosts(Integer id) {
        RestTemplate restTemplate = new RestTemplate();

        //Headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        //

        HttpEntity<List<Post>> httpEntity = new HttpEntity<>(httpHeaders);

        ResponseEntity<List<Post>> response = restTemplate.exchange(resourceURL + id, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<>() {
        });
        return response.getBody();
    }

    public ResponseDto createPost(Post post) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Post> request = new HttpEntity<Post>(post, httpHeaders);
        ResponseEntity<ResponseDto> response;
        try {
            response = restTemplate.exchange(resourceURL, HttpMethod.POST, request, ResponseDto.class);
            return response.getBody();
        } catch (HttpClientErrorException.BadRequest e) {
            return e.getResponseBodyAs(ResponseDto.class);
        }
    }
}
