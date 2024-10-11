package com.Luis0DEV.Domain.Services;

import com.Luis0DEV.Domain.Entity.tb_usr_user;
import com.Luis0DEV.Domain.Interface.Services.iservice_user;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class service_user implements iservice_user {
    public tb_usr_user get_by_id(UUID id){
        return null;
    }
    public tb_usr_user get_by_email(String email){
        return null;
    }
    public tb_usr_user get_by_username(String username){
        return null;
    }
    public tb_usr_user get_by_password(String password){
        return null;
    }
}
