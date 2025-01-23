package com.geppetto.testdevapp3.dao.daoimpl;

import com.geppetto.testdevapp3.repository.UserRepository;
import com.geppetto.testdevapp3.dao.UserDao;

import java.util.Optional;
import com.geppetto.testapp.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
* Implementation of the {@link UserDao} interface.
* Provides methods to interact with the {@link UserRepository} for CRUD operations on {@link User } entities.
*/
@Service
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;
    /**
     * Constructs a new {@code UserDaoImpl} with the specified repository.
     *
     * @param userRepository The repository used for accessing {@link User} entities. Must not be {@code null}.
     */
    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    {GpCreate=/**
     * Creates new user.
     *
     * @param user The {@link User} entity to create. Must not be {@code null}.
     * @return The created {@link User} entity.
     */, GpGetEntityById=/**
     * Retrieves user by its ID.
     *
     * @param id The ID of the user to retrieve. Must not be {@code null}.
     * @return An {@link Optional} containing the user if found, or an empty {@code Optional} if not.
     */, GpUpdate=/**
     * Retrieves user by its ID for update purposes.
     *
     * @param id The ID of the user to retrieve. Must not be {@code null}.
     * @return An {@link Optional} containing the user if found, or an empty {@code Optional} if not.
     */, GpDelete=/**
     * Deletes user by its ID.
     *
     * @param id The ID of the user to delete. Must not be {@code null}.
     */, GpGetAllValues= /**
     * Retrieves all user from the repository.
     *
     * @return A list of all {@link User} entities.
     */, GpFileUpload=/**
     * Uploads user associated with a file.
     *
     * @param fileEvent The {@link User} entity containing file information to upload. Must not be {@code null}.
     * @return The {@link User} entity with the uploaded file.
     */, GpFileDownload=/**
     * Retrieves user by its file name.
     *
     * @param fileName The name of the file associated with the user. Must not be {@code null}.
     * @return An {@link Optional} containing the user if found, or an empty {@code Optional} if not.
     */}
    @Override
    public {GpUpdate=Optional<User>, GpFileUpload=User, GpGetAllValues=Page<User>, GpCreate=User, GpGetEntityById=Optional<User>, GpFileDownload=Optional<User>, GpDelete=void} {GpCreate=createUser, GpGetEntityById=getUserById, GpUpdate=updateUser, GpDelete=deleteUser, GpGetAllValues=getAllUser, GpFileUpload=fileUploadUser, GpFileDownload=fileDownloadUser}({GpCreate=User user, GpUpdate=String id, GpGetEntityById=String id, GpDelete=String id, GpGetAllValues=Pageable pageable, GpFileUpload=User fileEvent, GpFileDownload=String fileName}) {
        {GpUpdate=return userRepository.findById(id), GpFileUpload=return userRepository.save(fileEvent), GpGetAllValues=return userRepository.findAll(pageable), GpCreate=return userRepository.save(user), GpGetEntityById=return userRepository.findById(id), GpFileDownload=return userRepository.findByFileName(fileName), GpDelete=userRepository.deleteById(id)};
    }


}


