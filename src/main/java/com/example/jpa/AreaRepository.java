/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa;

import com.example.jpa.db.Areas;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlos
 */
public interface AreaRepository extends JpaRepository<Areas, Long> {
    
}
