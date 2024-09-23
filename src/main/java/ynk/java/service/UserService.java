package ynk.java.service;

import ynk.java.model.User;

public interface UserService {
	User findUserByEmail(String email);
	void saveUser(User user);
}