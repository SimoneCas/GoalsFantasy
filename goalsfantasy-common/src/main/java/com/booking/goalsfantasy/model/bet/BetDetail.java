package com.booking.goalsfantasy.model.bet;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import com.booking.goalsfantasy.match.Match;
import com.booking.goalsfantasy.registry.Player;

@Embeddable
public class BetDetail {

	private String betDetailId;
	
	@ManyToOne
	private Match match;
	
	private Integer homeScore;
	
	private Integer awayScore;
	
	private Boolean usedJolly;
	
	private Boolean usedScoreInverted;
	
	@ManyToOne
	private Player homePlayer;
	
	@ManyToOne
	private Player awayPlayer;
	
	public BetDetail() {
		
	}

	public BetDetail(String betDetailId, Match match, Integer homeScore, Integer awayScore, Boolean usedJolly,
			Boolean usedScoreInverted, Player homePlayer, Player awayPlayer) {
		super();
		this.betDetailId = betDetailId;
		this.match = match;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.usedJolly = usedJolly;
		this.usedScoreInverted = usedScoreInverted;
		this.homePlayer = homePlayer;
		this.awayPlayer = awayPlayer;
	}

	public String getBetDetailId() {
		return betDetailId;
	}

	public void setBetDetailId(String betDetailId) {
		this.betDetailId = betDetailId;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Integer getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}

	public Integer getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}

	public Boolean getUsedJolly() {
		return usedJolly;
	}

	public void setUsedJolly(Boolean usedJolly) {
		this.usedJolly = usedJolly;
	}

	public Boolean getUsedScoreInverted() {
		return usedScoreInverted;
	}

	public void setUsedScoreInverted(Boolean usedScoreInverted) {
		this.usedScoreInverted = usedScoreInverted;
	}

	public Player getHomePlayer() {
		return homePlayer;
	}

	public void setHomePlayer(Player homePlayer) {
		this.homePlayer = homePlayer;
	}

	public Player getAwayPlayer() {
		return awayPlayer;
	}

	public void setAwayPlayer(Player awayPlayer) {
		this.awayPlayer = awayPlayer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awayPlayer == null) ? 0 : awayPlayer.hashCode());
		result = prime * result + ((awayScore == null) ? 0 : awayScore.hashCode());
		result = prime * result + ((betDetailId == null) ? 0 : betDetailId.hashCode());
		result = prime * result + ((homePlayer == null) ? 0 : homePlayer.hashCode());
		result = prime * result + ((homeScore == null) ? 0 : homeScore.hashCode());
		result = prime * result + ((match == null) ? 0 : match.hashCode());
		result = prime * result + ((usedJolly == null) ? 0 : usedJolly.hashCode());
		result = prime * result + ((usedScoreInverted == null) ? 0 : usedScoreInverted.hashCode());
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
		BetDetail other = (BetDetail) obj;
		if (awayPlayer == null) {
			if (other.awayPlayer != null)
				return false;
		} else if (!awayPlayer.equals(other.awayPlayer))
			return false;
		if (awayScore == null) {
			if (other.awayScore != null)
				return false;
		} else if (!awayScore.equals(other.awayScore))
			return false;
		if (betDetailId == null) {
			if (other.betDetailId != null)
				return false;
		} else if (!betDetailId.equals(other.betDetailId))
			return false;
		if (homePlayer == null) {
			if (other.homePlayer != null)
				return false;
		} else if (!homePlayer.equals(other.homePlayer))
			return false;
		if (homeScore == null) {
			if (other.homeScore != null)
				return false;
		} else if (!homeScore.equals(other.homeScore))
			return false;
		if (match == null) {
			if (other.match != null)
				return false;
		} else if (!match.equals(other.match))
			return false;
		if (usedJolly == null) {
			if (other.usedJolly != null)
				return false;
		} else if (!usedJolly.equals(other.usedJolly))
			return false;
		if (usedScoreInverted == null) {
			if (other.usedScoreInverted != null)
				return false;
		} else if (!usedScoreInverted.equals(other.usedScoreInverted))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BetDetail [betDetailId=" + betDetailId + ", match=" + match + ", homeScore=" + homeScore
				+ ", awayScore=" + awayScore + ", usedJolly=" + usedJolly + ", usedScoreInverted=" + usedScoreInverted
				+ ", homePlayer=" + homePlayer + ", awayPlayer=" + awayPlayer + "]";
	}
}
