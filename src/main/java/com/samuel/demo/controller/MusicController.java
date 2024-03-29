package com.samuel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samuel.demo.model.MusicList;
import com.samuel.demo.repos.UserRepository;


@Controller 
public class MusicController {
	
	@Autowired
	private UserRepository userRepository;
	
//	@PostMapping(path="/add")
//	public @ResponseBody String addNewSong(@RequestParam String songTitle, @RequestParam double songDuration, @RequestParam String artist) {
//		MusicList musicList = new MusicList();
//		musicList.setSongTitle(songTitle);
//		musicList.setSongDuration(songDuration);
//		musicList.setArtist(artist);
//		userRepository.save(musicList);
//		return "saved";
//	}
	
	@RequestMapping(path="/add")
	public @ResponseBody String add(MusicList mL) { 
		userRepository.save(mL);
		return "saved";		
	}
	
	@GetMapping("/MusicList")
	public @ResponseBody Iterable<MusicList> getAllMusicList(){
		return userRepository.findAll();
	}
	
	@RequestMapping("/MusicList/{artist}")
	@ResponseBody
	public List<MusicList> index(@PathVariable("artist") String artist) {
		return userRepository.findByArtist(artist);
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
}
