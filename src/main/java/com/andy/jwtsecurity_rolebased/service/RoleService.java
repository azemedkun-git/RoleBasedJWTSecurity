package com.andy.jwtsecurity_rolebased.service;

import com.andy.jwtsecurity_rolebased.dao.RoleDao;
import com.andy.jwtsecurity_rolebased.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
