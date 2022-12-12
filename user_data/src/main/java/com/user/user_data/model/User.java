package com.user.user_data.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data

// @Document(collection = "user")
@Document(collection = "users")

public class User {

    // private String id;
    // private String name;
    // private String email;
    // private Integer age;
    private String objectId;
    private boolean accountNonLocked;
    private Integer lockedAt;
    private Integer loginAttempts;
    
}
