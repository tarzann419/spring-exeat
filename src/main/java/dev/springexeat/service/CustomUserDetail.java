package dev.springexeat.service;

import dev.springexeat.models.UserModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class CustomUserDetail implements UserDetails {

    private UserModel user;


    public CustomUserDetail(UserModel user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(()-> user.getRole() );
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    public String getFullname(){
        return user.getFirst_name() + " " + user.getLast_name();
    }

    public String getMatNo() {
        return user.getMat_no();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
