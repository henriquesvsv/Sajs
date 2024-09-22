package com.henriquesv.simpleauthent.repository;

import com.henriquesv.simpleauthent.entity.SaJsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaJsRepository extends CrudRepository<SaJsEntity, Long> {

    Optional<SaJsEntity> findByusername(String username);
}
