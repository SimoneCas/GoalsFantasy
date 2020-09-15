package com.booking.goalsfantasy.match;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.booking.goalsfantasy.registry.Team;

@Entity
public class Match {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long matchId;
	
	@ManyToOne
	private Team homeTeam;
	@ManyToOne
	private Team awayTeam;
	
	@ManyToOne
	private SportDay sportDay;
	
	public Match() {
		
	}

	

	public Match(Long matchId, Team homeTeam, Team awayTeam, SportDay sportDay) {
		super();
		this.matchId = matchId;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.sportDay = sportDay;
	}



	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public SportDay getSportDay() {
		return sportDay;
	}

	public void setSportDay(SportDay sportDay) {
		this.sportDay = sportDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + ((matchId == null) ? 0 : matchId.hashCode());
		result = prime * result + ((sportDay == null) ? 0 : sportDay.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		if (awayTeam == null) {
			if (other.awayTeam != null)
				return false;
		} else if (!awayTeam.equals(other.awayTeam))
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (matchId == null) {
			if (other.matchId != null)
				return false;
		} else if (!matchId.equals(other.matchId))
			return false;
		if (sportDay == null) {
			if (other.sportDay != null)
				return false;
		} else if (!sportDay.equals(other.sportDay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", sportDay="
				+ sportDay + "]";
	}
}
