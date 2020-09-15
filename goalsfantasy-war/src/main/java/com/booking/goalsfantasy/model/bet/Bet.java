package com.booking.goalsfantasy.model.bet;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.booking.goalsfantasy.match.SportDay;
import com.booking.goalsfantasy.model.user.User;

@Entity
public class Bet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long betId;
	
	@ManyToOne
	private User user;
	
	@ElementCollection(fetch = FetchType.LAZY)
	private List<BetDetail> betDetails;
	
	@ManyToOne
	private SportDay sportDay;
	
	public Bet() {
		
	}

	
	public Bet(Long betId, User user, List<BetDetail> betDetails, SportDay sportDay) {
		super();
		this.betId = betId;
		this.user = user;
		this.betDetails = betDetails;
		this.sportDay = sportDay;
	}


	public Long getBetId() {
		return betId;
	}

	public void setBetId(Long betId) {
		this.betId = betId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<BetDetail> getBetDetails() {
		return betDetails;
	}

	public void setBetDetails(List<BetDetail> betDetails) {
		this.betDetails = betDetails;
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
		result = prime * result + ((betDetails == null) ? 0 : betDetails.hashCode());
		result = prime * result + ((betId == null) ? 0 : betId.hashCode());
		result = prime * result + ((sportDay == null) ? 0 : sportDay.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Bet other = (Bet) obj;
		if (betDetails == null) {
			if (other.betDetails != null)
				return false;
		} else if (!betDetails.equals(other.betDetails))
			return false;
		if (betId == null) {
			if (other.betId != null)
				return false;
		} else if (!betId.equals(other.betId))
			return false;
		if (sportDay == null) {
			if (other.sportDay != null)
				return false;
		} else if (!sportDay.equals(other.sportDay))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bet [betId=" + betId + ", user=" + user + ", betDetails=" + betDetails + ", sportDay=" + sportDay + "]";
	}

	
}
