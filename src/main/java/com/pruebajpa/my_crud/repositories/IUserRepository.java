package com.pruebajpa.my_crud.repositories;


import com.pruebajpa.my_crud.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//los repositories
//nos permite hacer querys en base de datos
@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {


}
