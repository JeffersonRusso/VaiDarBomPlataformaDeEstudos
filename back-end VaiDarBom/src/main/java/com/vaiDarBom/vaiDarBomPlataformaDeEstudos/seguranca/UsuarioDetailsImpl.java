package com.vaiDarBom.vaiDarBomPlataformaDeEstudos.seguranca;

import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.vaiDarBom.vaiDarBomPlataformaDeEstudos.model.Usuario;

public class UsuarioDetailsImpl implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private List < GrantedAuthority > authorities;
	
	public UsuarioDetailsImpl(Usuario user) {
		this.userName = user.getNome();
		this.password = user.getSenha();
	}
	
	public UsuarioDetailsImpl() {}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
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