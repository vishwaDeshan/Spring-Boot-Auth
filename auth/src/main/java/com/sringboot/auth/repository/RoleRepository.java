package com.sringboot.auth.repository;

import com.sringboot.auth.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String > {
}
