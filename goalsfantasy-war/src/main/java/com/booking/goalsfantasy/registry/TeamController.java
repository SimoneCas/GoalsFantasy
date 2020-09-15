package com.booking.goalsfantasy.registry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@GetMapping(path = "/", produces = "application/json")
	public ResponseEntity<String> index() {
		List<Team> teams = new ArrayList<Team>();
		Iterable<Team> teamsIterable = teamRepository.findAll();
		teamsIterable.forEach(teams::add);
		
		ObjectMapper mapper = new ObjectMapper();
		String result;
		try {
			result = mapper.writeValueAsString(teams);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return new ResponseEntity<>("Invalid teams", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping(path = "/", consumes = "application/json")
	public ResponseEntity<String> saveTeam(@RequestBody String payload) {
		System.out.println("---------------" + payload);
		Team team;
		ObjectMapper mapper = new ObjectMapper();
		try {
			team = mapper.readValue(payload, Team.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return new ResponseEntity<>("Invalid teams", HttpStatus.BAD_REQUEST);
		}

		teamRepository.save(team);
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
