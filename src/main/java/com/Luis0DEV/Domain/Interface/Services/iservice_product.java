package com.Luis0DEV.Domain.Interface.Services;

import com.Luis0DEV.Domain.Entity.tb_prd_product;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface iservice_product {
    public tb_prd_product get_product_by_id(UUID id);
    public tb_prd_product get_product_by_name(String product_name);
}
