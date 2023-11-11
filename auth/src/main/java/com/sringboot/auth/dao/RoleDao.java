package com.sringboot.auth.dao;

import com.sringboot.auth.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String > {
}
