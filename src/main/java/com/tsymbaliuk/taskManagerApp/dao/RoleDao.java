package com.tsymbaliuk.taskManagerApp.dao;

import com.tsymbaliuk.taskManagerApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tsymbaliuk Serhii on 20.12.2016.
 */
public interface RoleDao extends JpaRepository<Role, Long>{
}
