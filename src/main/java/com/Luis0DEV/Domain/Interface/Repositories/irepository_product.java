package com.Luis0DEV.Domain.Interface.Repositories;

import com.Luis0DEV.Domain.Entity.tb_prd_product;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface irepository_product  extends JpaRepository<tb_prd_product, Integer> {
}
