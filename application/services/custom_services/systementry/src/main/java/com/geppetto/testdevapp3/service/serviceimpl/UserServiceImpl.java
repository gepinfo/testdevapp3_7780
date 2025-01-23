package com.geppetto.testdevapp3.service.serviceimpl;

import com.geppetto.testdevapp3.dao.UserDao;
import com.geppetto.testdevapp3.dto.UserDto;
import com.geppetto.testdevapp3.exception.EntityNotFoundException;
import com.geppetto.testdevapp3.model.User;
import com.geppetto.testdevapp3.service.UserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


/**
* Implementation of the {@link UserService} interface.
* Provides services related to User, including CRUD operations and file uploads/downloads.
*/

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    /**
     * Constructs a {@code UserServiceImpl} with the specified DAO and MongoTemplate.
     *
     * @param userDao The DAO for accessing the data.
     * @param mongoTemplate The MongoTemplate for interacting with MongoDB.
     */
  private final UserDao userDao;
  private final MongoTemplate mongoTemplate;

  public UserServiceImpl(UserDao  userDao, MongoTemplate mongoTemplate) {
    this. userDao =  userDao;
    this.mongoTemplate = mongoTemplate;
  }
    
    false
  @Override
  public false falsefalse {
    log.info("Enter into false method");
  false
  }
    

}
