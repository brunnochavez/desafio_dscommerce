package com.devsuperior.dscommerce.dto;

public interface UserDetailsProjection {

    String getUserName();
    String getPassword();
    Long getRoleId();
    String getAuthority();
}
