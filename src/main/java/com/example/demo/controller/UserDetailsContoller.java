package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserServices;

@RestController
@RequestMapping("/user")
public class UserDetailsContoller {

	@Autowired
	
	private UserServices userServices;
	
	@GetMapping("/getallusers")
	public List<UserDetails> getAllUsers()
	{
		return userServices.getAllUsers();
	}
	
	@PostMapping("/adduser/{id}/{orgid}/{personalid}/{cardid}/{docid}/{flid}")
	public UserDetails addUser(@RequestBody UserDetails userDetails, @PathVariable int id, @PathVariable int orgid, @PathVariable int personalid, @PathVariable int cardid,
			@PathVariable int docid, @PathVariable int flid)
	{
		return userServices.addUser(userDetails, id, orgid, personalid, cardid, docid, flid);
	}
	
	@PutMapping("/edituser")
	public UserDetails updateUser(@RequestBody UserDetails userDetails, @PathVariable int id)
	{
		return userServices.updateUser(userDetails, id);
	}
	
	@DeleteMapping("/deleteuser")
	public void deleteUser(@PathVariable int id)
	{
		userServices.deleteUser(id);
	}
}
