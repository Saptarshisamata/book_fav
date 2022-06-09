package com.wipro.BookAppFavorite.Service;

import com.wipro.BookAppFavorite.Model.AuthenticatedResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthenticationService {
    RestTemplate restTemplate;

    public AuthenticationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String URL = "http://localhost:3009/api/v1/auth/authenticate";

    public AuthenticatedResponse Authenticate(String token){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization",token);
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<AuthenticatedResponse> authenticatedResponse = restTemplate.exchange(URL, HttpMethod.GET,
                request, AuthenticatedResponse.class);
        return  authenticatedResponse.getBody();
    }
}
