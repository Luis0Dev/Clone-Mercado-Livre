package com.Luis0DEV.Domain.Interface.Services;

import com.Luis0DEV.Domain.Entity.tb_add_address;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface iservice_address {
    public tb_add_address get_by_id(UUID id);
    public tb_add_address get_by_zipcode(String zipcode);
    public tb_add_address add_address();
    public tb_add_address update_address();
    public tb_add_address delete_address();
}
