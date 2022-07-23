package com.emids.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.emids.exception.InvalidHandlerException;

@Component
public class MyInterceptor implements HandlerInterceptor{
   
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("PreHandle....");
		if(request.getHeader("test-auth-key")==null||request.getParameter("id")==null) {
			System.out.println(request.getHeader("test-auth-key")+"--"+request.getParameter("id"));
			throw new InvalidHandlerException("Invalid Request");
		}
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
}