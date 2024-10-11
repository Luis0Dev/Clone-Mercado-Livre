package com.Luis0DEV.Domain.Interface.Repositories;

import com.Luis0DEV.Domain.Entity.tb_geo_geocode;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface irepository_geocode extends JpaRepository<tb_geo_geocode, Integer> {
}
