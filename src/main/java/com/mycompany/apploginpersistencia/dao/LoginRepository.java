/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apploginpersistencia.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mycompany.apploginpersistencia.modelo.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
    
}
