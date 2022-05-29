package com.login.login.repo;

import com.login.login.entity.SignUpEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<SignUpEntity, Long> {

    @Override
    <S extends SignUpEntity> List<S> findAll(Example<S> example);

    @Override
    <S extends SignUpEntity> S save(S entity);
}
