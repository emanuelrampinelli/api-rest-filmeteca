package com.api.filmeteca.security.jwt.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.api.filmeteca.model.Usuario;

public class DetalheUsuarioData implements UserDetails {

    private final Optional<Usuario> usuario;

    public DetalheUsuarioData(Optional<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return new ArrayList<>();
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        // Se o usuario for vazio, retorne novo usuario.getSenha()
        return usuario.orElse(new Usuario()).getSenha();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        // Se o usuario for vazio, retorne novo usuario.getEmail()
        return usuario.orElse(new Usuario()).getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

}
