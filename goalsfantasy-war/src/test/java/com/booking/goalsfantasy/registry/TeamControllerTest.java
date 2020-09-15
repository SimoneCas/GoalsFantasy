package com.booking.goalsfantasy.registry;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TeamControllerTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private TeamController teamController;
	
	@Test
	public void testContextLoads () throws Exception {
		assertThat(teamController).isNotNull();
	}
	
	@Test
	public void testSaveTeam() throws Exception {
		Team team = new Team();
		team.setName("LAZIO");
		team.setPlayers(null);
		
		String uri = "http://localhost:" + port + "/team/";
		
		ObjectMapper mapper = new ObjectMapper();
		String teamPayload = mapper.writeValueAsString(team);
		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-type", "application/json");
		HttpEntity<String> request = 
			      new HttpEntity<String>(teamPayload, headers);
		
		ResponseEntity<Object> postForEntity = this.restTemplate.postForEntity(uri, request, null);
		System.out.println("************ " + postForEntity.getStatusCodeValue());
		
		String response = this.restTemplate.getForObject("http://localhost:" + port + "/team/",
				String.class);
		System.out.println("+++++++++++++++++++++++++++++++ " + response);
	}
}
