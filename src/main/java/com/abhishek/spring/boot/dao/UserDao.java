package com.abhishek.spring.boot.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.abhishek.spring.boot.model.User;

@Repository
public class UserDao {

	private static final List<User> userList = new ArrayList<User>();

	static {
		createUser();
	}

	private static void createUser() {

		User user1 = new User(1, "Heidi", "Pitts", "heidi.com", "Costa Rica");
		User user2 = new User(2, "Daphne", "Workman", "daphne.com", "UK");
		User user3 = new User(3, "Jemima", "Duffy", "jemima.com", "Colombia");
		User user4 = new User(4, "Roary", "Berg", "roary.com", "US");
		User user5 = new User(5, "Byron", "Benjamin", "byron.com", "Germany");
		User user6 = new User(6, "Hermann", "Pardon", "hermann.com", "Poland");
		User user7 = new User(7, "Rossie", "Giovannini", "rossie.com", "Russia");
		User user8 = new User(8, "Killian", "Brotherheed", "killian.com", "Indonesia");
		User user9 = new User(9, "Marga", "Tice", "marga.com", "Spain");
		User user10 = new User(10, "Khalil", "Edelheit", "khalil.com", "China");
		User user11 = new User(11, "Rebecka", "Bavage", "rebecka.com", "Azerbaijan");
		User user12 = new User(12, "Athene", "Errigo", "athene.com", "Canada");
		User user13 = new User(13, "Jarrod", "Sterling", "jarrod.com", "Sweden");
		User user14 = new User(14, "Robinet", "Furmonger", "robinet.com", "Portugal");
		User user15 = new User(15, "Abhishek", "Singh", "abhishek.com", "Tanzania");
		User user16 = new User(16, "Filia", "Withrington", "filia.com", "Bulgaria");
		User user17 = new User(17, "Padget", "Cornish", "padget.com", "Belarus");
		User user18 = new User(18, "Olivie", "Isabell", "olivie.com", "Greece");
		User user19 = new User(19, "John", "Partlett", "john.com", "Argentina");
		User user20 = new User(20, "Tabbie", "Cartan", "tabbie.com", "Singapore");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		userList.add(user7);
		userList.add(user8);
		userList.add(user9);
		userList.add(user10);
		userList.add(user11);
		userList.add(user12);
		userList.add(user13);
		userList.add(user14);
		userList.add(user15);
		userList.add(user16);
		userList.add(user17);
		userList.add(user18);
		userList.add(user19);
		userList.add(user20);
	}

	public User getUser(int id) {
		return userList.get(id);
	}

	public User addUser(User user) {
		userList.add(user);
		return user;
	}

	public User updateUser(User user) {
		userList.set(user.getId(), user);
		return user;
	}

	public void deleteUser(int id) {
		userList.remove(id);
	}

	public List<User> getAllUsers() {
		Collection<User> c = userList.stream().collect(Collectors.toList());
		List<User> list = new ArrayList<User>();
		list.addAll(c);
		return list;
	}
}
