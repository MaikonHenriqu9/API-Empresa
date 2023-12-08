package com.devsuperior.userdep.refatories;

import com.devsuperior.userdep.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
