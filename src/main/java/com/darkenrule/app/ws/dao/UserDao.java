package com.darkenrule.app.ws.dao;

import org.springframework.data.repository.CrudRepository;

import com.darkenrule.app.ws.entity.User;

public interface UserDao extends CrudRepository<User, Integer> {

}
