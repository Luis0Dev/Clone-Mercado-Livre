package com.Luis0DEV.Domain.Interface.Services;

import com.Luis0DEV.Domain.Entity.tb_usr_user;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface iservice_user {
    public tb_usr_user get_by_id(UUID id);
    public tb_usr_user get_by_email(String email);
    public tb_usr_user get_by_username(String username);
    public tb_usr_user get_by_password(String password);
}
