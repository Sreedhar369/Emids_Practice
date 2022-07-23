package com.emids.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {



	@PostMapping("/createData" )
	public ResponseEntity<Map<String,String>> getData(@RequestParam String id, @RequestHeader(value = "test-auth-key") String authcode) {
		Map<String,String> returnValue=new HashMap<String,String>();

		returnValue.put("Authorization", authcode);
        
		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	}



	/*@DeleteMapping("/deleteData")
		public String postData() {
			return "Deleting Data...";
		}
		@PostMapping("/createData")
		public String createData() {
			return "Creating Data...";
		}*/
}
