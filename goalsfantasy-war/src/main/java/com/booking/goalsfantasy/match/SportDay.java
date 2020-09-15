package com.booking.goalsfantasy.match;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SportDay {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sportDayId;
	
	private Integer sportDaySequence;
	
	public SportDay() {
		
	}

	public SportDay(Long sportDayId, Integer sportDaySequence) {
		super();
		this.sportDayId = sportDayId;
		this.sportDaySequence = sportDaySequence;
	}

	public Long getSportDayId() {
		return sportDayId;
	}

	public void setSportDayId(Long sportDayId) {
		this.sportDayId = sportDayId;
	}

	public Integer getSportDaySequence() {
		return sportDaySequence;
	}

	public void setSportDaySequence(Integer sportDaySequence) {
		this.sportDaySequence = sportDaySequence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sportDayId == null) ? 0 : sportDayId.hashCode());
		result = prime * result + ((sportDaySequence == null) ? 0 : sportDaySequence.hashCode());
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
		SportDay other = (SportDay) obj;
		if (sportDayId == null) {
			if (other.sportDayId != null)
				return false;
		} else if (!sportDayId.equals(other.sportDayId))
			return false;
		if (sportDaySequence == null) {
			if (other.sportDaySequence != null)
				return false;
		} else if (!sportDaySequence.equals(other.sportDaySequence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SportDay [sportDayId=" + sportDayId + ", sportDaySequence=" + sportDaySequence + "]";
	}
}
