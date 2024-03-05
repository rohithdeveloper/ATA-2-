package com.example.routeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.routeservice.model.Route;

public interface RouteRepository extends JpaRepository<Route, Integer>{

}
