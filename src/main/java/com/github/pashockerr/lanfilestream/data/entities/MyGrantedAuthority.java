package com.github.pashockerr.lanfilestream.data.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "authorities")
public class MyGrantedAuthority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private UUID id;

    private final String authority;

    public MyGrantedAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    @Getter
    @Setter
    @ManyToMany(mappedBy = "authorities")
    private Set<User> users = new HashSet<>();

    public void addUser(User user){
        users.add(user);
    }
}
