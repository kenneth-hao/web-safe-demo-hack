package org.dxy.websafedemohack.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "demo_comment")
@Getter
@Setter
public class Comment extends BootDomain {

    public static Comment of(String username, String comment) {
        Comment o = new Comment();
        o.username = username;
        o.comment = comment;
        return o;
    }

    private String username;

    private String comment;

}
