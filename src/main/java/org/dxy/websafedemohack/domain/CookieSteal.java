package org.dxy.websafedemohack.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "demo_cookies")
@Getter
@Setter
public class CookieSteal extends BootDomain {

    public static CookieSteal of() {
        CookieSteal o = new CookieSteal();
        return o;
    }

    public CookieSteal setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }

    protected String cookie;
}
