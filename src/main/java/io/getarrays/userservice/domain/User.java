package io.getarrays.userservice.domain;

import java.util.ArrayList;
import java.util.Collection;

public class User {

    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private Collection<Role> roles = new ArrayList<>();

}
