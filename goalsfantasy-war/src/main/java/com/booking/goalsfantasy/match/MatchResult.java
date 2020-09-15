package com.booking.goalsfantasy.match;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.booking.goalsfantasy.registry.Player;

@Entity
public class MatchResult {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long matchResultId;
	
	@OneToOne
	private Match match;
	
	private Integer officialHomeScore;
	
	private Integer officialAwayScore;
	
	@ManyToOne
	private Player officialHomePlayer;
	
	@ManyToOne
	private Player officalAwayPlayer;
	
	public MatchResult () {
		
	}

	

	public Long getMatchResultId() {
		return matchResultId;
	}



	public void setMatchResultId(Long matchResultId) {
		this.matchResultId = matchResultId;
	}



	public MatchResult(Long matchResultId, Match match, Integer officialHomeScore, Integer officialAwayScore,
			Player officialHomePlayer, Player officalAwayPlayer) {
		super();
		this.matchResultId = matchResultId;
		this.match = match;
		this.officialHomeScore = officialHomeScore;
		this.officialAwayScore = officialAwayScore;
		this.officialHomePlayer = officialHomePlayer;
		this.officalAwayPlayer = officalAwayPlayer;
	}



	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Integer getOfficialHomeScore() {
		return officialHomeScore;
	}

	public void setOfficialHomeScore(Integer officialHomeScore) {
		this.officialHomeScore = officialHomeScore;
	}

	public Integer getOfficialAwayScore() {
		return officialAwayScore;
	}

	public void setOfficialAwayScore(Integer officialAwayScore) {
		this.officialAwayScore = officialAwayScore;
	}

	public Player getOfficialHomePlayer() {
		return officialHomePlayer;
	}

	public void setOfficialHomePlayer(Player officialHomePlayer) {
		this.officialHomePlayer = officialHomePlayer;
	}

	public Player getOfficalAwayPlayer() {
		return officalAwayPlayer;
	}

	public void setOfficalAwayPlayer(Player officalAwayPlayer) {
		this.officalAwayPlayer = officalAwayPlayer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((match == null) ? 0 : match.hashCode());
		result = prime * result + ((matchResultId == null) ? 0 : matchResultId.hashCode());
		result = prime * result + ((officalAwayPlayer == null) ? 0 : officalAwayPlayer.hashCode());
		result = prime * result + ((officialAwayScore == null) ? 0 : officialAwayScore.hashCode());
		result = prime * result + ((officialHomePlayer == null) ? 0 : officialHomePlayer.hashCode());
		result = prime * result + ((officialHomeScore == null) ? 0 : officialHomeScore.hashCode());
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
		MatchResult other = (MatchResult) obj;
		if (match == null) {
			if (other.match != null)
				return false;
		} else if (!match.equals(other.match))
			return false;
		if (matchResultId == null) {
			if (other.matchResultId != null)
				return false;
		} else if (!matchResultId.equals(other.matchResultId))
			return false;
		if (officalAwayPlayer == null) {
			if (other.officalAwayPlayer != null)
				return false;
		} else if (!officalAwayPlayer.equals(other.officalAwayPlayer))
			return false;
		if (officialAwayScore == null) {
			if (other.officialAwayScore != null)
				return false;
		} else if (!officialAwayScore.equals(other.officialAwayScore))
			return false;
		if (officialHomePlayer == null) {
			if (other.officialHomePlayer != null)
				return false;
		} else if (!officialHomePlayer.equals(other.officialHomePlayer))
			return false;
		if (officialHomeScore == null) {
			if (other.officialHomeScore != null)
				return false;
		} else if (!officialHomeScore.equals(other.officialHomeScore))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MatchResult [matchResultId=" + matchResultId + ", match=" + match + ", officialHomeScore="
				+ officialHomeScore + ", officialAwayScore=" + officialAwayScore + ", officialHomePlayer="
				+ officialHomePlayer + ", officalAwayPlayer=" + officalAwayPlayer + "]";
	}
	
}
