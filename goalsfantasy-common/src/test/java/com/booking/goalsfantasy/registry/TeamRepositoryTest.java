package com.booking.goalsfantasy.registry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class TeamRepositoryTest {

	@Autowired
	private TeamRepository teamRepository;
	
	@Test
	public void testSaveNewTeamWithoutPlayers() {
		Team team = new Team();
		team.setTeamId("1");
		team.setName("LAZIO");
		team.setPlayers(null);
		
		teamRepository.save(team);
		
		assertEquals(1, teamRepository.count());
		Iterable<Team> result = teamRepository.findAll();
		result.forEach(t -> System.out.println("******" + t));
	}
}
