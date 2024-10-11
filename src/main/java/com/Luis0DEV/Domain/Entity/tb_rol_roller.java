package com.Luis0DEV.Domain.Entity;

import com.Luis0DEV.Domain.Entity.Role.tb_rol_roller_name;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.NaturalId;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "roles")
public class tb_rol_roller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public UUID rol_n_id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name = "rol_c_name")
    public tb_rol_roller_name rol_c_name;

    public tb_rol_roller(tb_rol_roller_name rol_c_name) {
        this.rol_c_name = rol_c_name;
    }
}
