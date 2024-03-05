package com.example.routeservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Route_microservice")
public class Route {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private int routeId;
	@Column
    private String destination;
	@Column
    private String distance;
	@Column
    private String duration;
	@Column
    private String source;

    public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor
    public Route(int routeId, String destination, String distance, String duration,String source) {
        this.routeId = routeId;
        this.destination = destination;
        this.distance = distance;
        this.duration = duration;
        this.source=source;
    }

    // Getters and setters
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
    
    
}
