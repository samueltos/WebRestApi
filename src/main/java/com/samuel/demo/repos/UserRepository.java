package com.samuel.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.demo.model.MusicList;


public interface UserRepository extends JpaRepository<MusicList, Integer> {

	public List<MusicList> findByArtist(String artist);
}
