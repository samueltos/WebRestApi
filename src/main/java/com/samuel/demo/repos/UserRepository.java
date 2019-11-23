package com.samuel.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.samuel.demo.model.MusicList;

public interface UserRepository extends CrudRepository<MusicList, Integer> {

}
