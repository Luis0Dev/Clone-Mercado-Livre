package com.Luis0DEV.Domain.Interface.Repositories;

import com.Luis0DEV.Domain.Entity.tb_add_address;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface irepository_address extends JpaRepository<tb_add_address, Integer> {
}
