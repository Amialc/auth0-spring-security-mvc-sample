package com.auth0.example;

import com.auth0.Auth0User;
import com.auth0.SessionUtils;
import com.auth0.spring.security.mvc.Auth0JWTToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Map;

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

}
