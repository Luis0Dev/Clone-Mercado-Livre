package com.Luis0DEV.Domain.Services;

import com.Luis0DEV.Domain.Entity.tb_add_address;
import com.Luis0DEV.Domain.Interface.Services.iservice_address;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class service_address implements iservice_address {
    public tb_add_address get_by_id(UUID id){
        return null;
    }
    public tb_add_address get_by_zipcode(String zipcode){
        return null;
    }
    public tb_add_address add_address(){
        return null;
    }
    public tb_add_address update_address(){
        return null;
    }
    public tb_add_address delete_address(){
        return null;
    }
}
