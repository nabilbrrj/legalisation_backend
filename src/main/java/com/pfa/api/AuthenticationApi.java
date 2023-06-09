package com.pfa.api;

import com.pfa.dtos.LoginDTO;
import com.pfa.dtos.SignupDTO;
import com.pfa.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RequestMapping("auth")
public interface AuthenticationApi {

    @PostMapping("login")
    ResponseEntity generateToken(@RequestBody LoginDTO data) throws UserNotFoundException;

    @GetMapping("check_availability")
    ResponseEntity<Boolean> checkLoginAvailability(@RequestParam String login);

    @PostMapping("register")
    ResponseEntity<?> signup(@RequestBody SignupDTO signupDTO);

    @GetMapping("get_user_info")
    ResponseEntity<?> getUserInfo();
}
