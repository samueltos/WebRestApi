package com.samuel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samuel.demo.model.MusicList;
import com.samuel.demo.repos.UserRepository;


@Controller 
public class MusicController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewSong(@RequestParam String songTitle, @RequestParam double songDuration, @RequestParam String artist) {
		MusicList musicList = new MusicList();
		musicList.setSongTitle(songTitle);
		musicList.setSongDuration(songDuration);
		musicList.setArtist(artist);
		userRepository.save(musicList);
		return "saved";
		
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<MusicList> getAllMusicList(){
		return userRepository.findAll();
	}
	

	@RequestMapping(path="/add")
	public @ResponseBody String add(MusicList mL) { 
		userRepository.save(mL);
		return "saved";
		
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
}
