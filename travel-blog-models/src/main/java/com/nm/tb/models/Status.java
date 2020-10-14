package com.nm.tb.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "status")
@Data
public class Status {

	@Column(name = "activity")
	private String acivity;

	@Column(name = "location_id")
	private Long locationId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "is_public_status")
	private boolean publicStatus;

	/** Creation date */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date")
	private Calendar creationDate;
}
