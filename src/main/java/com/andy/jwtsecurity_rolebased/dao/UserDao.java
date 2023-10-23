package com.andy.jwtsecurity_rolebased.dao;

import com.andy.jwtsecurity_rolebased.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
