package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.Models.User;

@Service
public class UserService {
private List<User> store=new ArrayList<>();

public UserService() {
	store.add(new User(UUID.randomUUID().toString(),"Abdul","abdul@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"faiz","faiz@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"ubaid","ubaid@gmail.com"));
	store.add(new User(UUID.randomUUID().toString(),"tahir","tahir@gmail.com"));
}
public List<User> getUser(){
	return this.store;
	
}
}
