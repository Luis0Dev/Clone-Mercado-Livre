package com.Luis0DEV.Domain.Interface.Repositories;

import com.Luis0DEV.Domain.Entity.tb_usr_user;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface irepository_user extends JpaRepository<tb_usr_user, Integer> {
}
