package com.example.demo.apigateway.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import com.example.demo.apigateway.util.JwtUtil;
import com.google.common.net.HttpHeaders;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

	@Autowired
	private RouteValidator validator;
	
//	@Autowired
//	private RestTemplate template;
	
	@Autowired
	private JwtUtil jwtUtil;

	public AuthenticationFilter() {
		super(Config.class);
		// TODO Auto-generated constructor stub
	}

	public static class Config {

	}

	@Override
	public GatewayFilter apply(Config config) {
		// TODO Auto-generated method stub
		return ((exchange, chain) -> {
			if (validator.isSecured.test(exchange.getRequest())) {
				// header contains token or not
				if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
					throw new RuntimeException("Missing authorization header");
				}

				String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
				if(authHeader!=null && authHeader.startsWith("Bearer")) {
					authHeader=authHeader.substring(7);
				}
				try {
					//REST call to auth service
					//template.getForObject("http://IDENTITY-SERVICE/validate?token"+authHeader, String.class);
					jwtUtil.validateToken(authHeader);
				}catch(Exception e) {
					System.out.println("Invalid access");
					throw new RuntimeException("un authorized access to application");
				}
				
			}

			return chain.filter(exchange);
		});
	}

}
