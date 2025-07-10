package com.example.auth.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        try {
            // Step 1: Read Authorization header and decode username/password
            String authHeader = request.getHeader("Authorization");
            
            if (authHeader == null || !authHeader.startsWith("Basic ")) {
                return ResponseEntity.status(401).body("Missing or invalid Authorization header");
            }

            // Extract the Base64 encoded credentials
            String encodedCredentials = authHeader.substring("Basic ".length());
            String decodedCredentials = new String(Base64.getDecoder().decode(encodedCredentials), StandardCharsets.UTF_8);
            
            // Split username and password
            String[] credentials = decodedCredentials.split(":", 2);
            if (credentials.length != 2) {
                return ResponseEntity.status(401).body("Invalid credentials format");
            }
            
            String username = credentials[0];
            String password = credentials[1];
            
            // Step 2: Validate credentials (simple validation for demo)
            if (!isValidUser(username, password)) {
                return ResponseEntity.status(401).body("Invalid credentials");
            }
            
            // Step 3: Generate JWT token
            String token = jwtUtil.generateToken(username);
            
            // Return token in the expected format
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            
            return ResponseEntity.ok(response);
            
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Authentication failed: " + e.getMessage());
        }
    }

    /**
     * Simple user validation - in real applications, this would check against a database
     * For demo purposes, we'll accept any user with password "pwd"
     */
    private boolean isValidUser(String username, String password) {
        // Simple validation - accept any username with password "pwd"
        // In real applications, this would check against a user database
        return "pwd".equals(password);
    }
}
