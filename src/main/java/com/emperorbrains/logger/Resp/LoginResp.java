package com.emperorbrains.logger.Resp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emperorbrains.logger.Model.Login;

@Repository
public interface LoginResp extends CrudRepository<Login, Integer>{

}
