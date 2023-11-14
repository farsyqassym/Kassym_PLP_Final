package com.ndoto_ajira.security.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;


//  .........................  method ya ku register APPLICANT...............///.
    @PostMapping("/registerNewApplicant")
    public ResponseEntity<AuthenticationResponse> registerApplicant(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(service.registerApplicant(request));
    }


    //  .........................  method ya ku register STAFF...............///.
    @PostMapping("/registerNewStaff")
    public ResponseEntity<AuthenticationResponse> registerStaff(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(service.registerStaff(request));
    }


    //  .........................  method ya ku LOGIN...............///.
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));
    }
}
