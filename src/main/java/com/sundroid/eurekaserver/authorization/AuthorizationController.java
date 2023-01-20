package com.sundroid.eurekaserver.authorization;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {









    @GetMapping("/user")
    public String userDetails(){

      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth.isAuthenticated()){
            Jwt principal = ((Jwt) auth.getPrincipal());
            return "User is Authenticated " + principal.getClaims().get("email");
        }
        else{
            return "User not authenticated";
        }
    }
    @GetMapping("welcome")
    public String welcome(){
        return "welcome";
    }
}
