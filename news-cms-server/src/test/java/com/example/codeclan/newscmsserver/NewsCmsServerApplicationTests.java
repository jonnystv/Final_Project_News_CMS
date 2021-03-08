package com.example.codeclan.newscmsserver;

import com.example.codeclan.newscmsserver.models.Article;
import com.example.codeclan.newscmsserver.models.User;
import com.example.codeclan.newscmsserver.models.UserType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NewsCmsServerApplicationTests {

	@Test
	void contextLoads() {
	}

	//USER TESTS
	@Test
	public void userHasFirstName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals("Bob", user1.getFirstName());
	}

	@Test
	public void userCanSetFirstName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		user1.setFirstName("Bill");
		assertEquals("Bill", user1.getFirstName());
	}

	@Test
	public void userHasLastName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals("Smith", user1.getLastName());
	}

	@Test
	public void userCanSetLastName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		user1.setLastName("Green");
		assertEquals("Green", user1.getLastName());
	}

	@Test
	public void userHasUserName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals("bobsmith", user1.getUserName());
	}

	@Test
	public void userCanSetUserName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		user1.setUserName("smith_bob");
		assertEquals("smith_bob", user1.getUserName());
	}

	@Test
	public void userHasEmail() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals("bob@smith.com", user1.getEmail());
	}

	@Test
	public void userCanSetEmail() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		user1.setEmail("bobsmith@gmail.com");
		assertEquals("bobsmith@gmail.com", user1.getEmail());
	}

	@Test
	public void userHasType() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals(UserType.ADMINISTRATOR, user1.getType());
	}

	@Test
	public void UserTypeHasValueString() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals("Administrator", user1.getEnumValue() );
	}

	@Test
	public void userCanSetType() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		user1.setType(UserType.EDITOR);
		assertEquals(UserType.EDITOR, user1.getType());
	}

	@Test
	public void userStartsWithNoArticles() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		assertEquals(0, user1.getUserArticleCount());
	}

	@Test
	public void canAddArticleToUser() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Article article2 = new Article("Bigger News", "Tons of Stuff Happened", "This is the next summary...", "This is the full text of the article2", user1, "13-03-2021");
		Article article3 = new Article("Biggest News", "Much Stuff Happened", "This is another summary...", "This is the full text of the article3", user1, "14-03-2021");
		user1.addArticle(article1);
		user1.addArticle(article2);
		assertEquals(2, user1.getUserArticleCount());
	}

	@Test
	public void canRemoveArticleFromUser() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Article article2 = new Article("Bigger News", "Tons of Stuff Happened", "This is the next summary...", "This is the full text of the article2", user1, "13-03-2021");
		Article article3 = new Article("Biggest News", "Much Stuff Happened", "This is another summary...", "This is the full text of the article3", user1, "14-03-2021");
		user1.addArticle(article1);
		user1.addArticle(article2);
		user1.removeArticle(article1);
		assertEquals(1, user1.getUserArticleCount());
	}

}
