package com.andy.jwtsecurity_rolebased.dao;

import com.andy.jwtsecurity_rolebased.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}
