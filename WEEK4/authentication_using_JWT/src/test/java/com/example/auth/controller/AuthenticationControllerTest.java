package com.example.auth.controller;

import java.util.Base64;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.auth.util.JwtUtil;

@WebMvcTest(AuthenticationController.class)
class AuthenticationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private JwtUtil jwtUtil;

    @Test
    void testAuthenticateSuccess() throws Exception {
        String credentials = "user:pwd";
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
        
        // Mock JWT token generation
        when(jwtUtil.generateToken(anyString())).thenReturn("mock.jwt.token");
        
        mockMvc.perform(post("/authenticate")
                .with(csrf()) // Add CSRF token for test
                .header("Authorization", "Basic " + encodedCredentials))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value("mock.jwt.token"));
    }

    @Test
    void testAuthenticateFailure() throws Exception {
        String credentials = "user:wrongpassword";
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());
        
        mockMvc.perform(post("/authenticate")
                .with(csrf()) // Add CSRF token for test
                .header("Authorization", "Basic " + encodedCredentials))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void testAuthenticateNoHeader() throws Exception {
        mockMvc.perform(post("/authenticate")
                .with(csrf())) // Add CSRF token for test
                .andExpect(status().isUnauthorized());
    }
}
