package com.example.codeclan.newscmsserver;

import com.example.codeclan.newscmsserver.models.*;
import com.example.codeclan.newscmsserver.repositories.ArticleRepository;
import com.example.codeclan.newscmsserver.repositories.CategoryRepository;
//import com.example.codeclan.newscmsserver.repositories.CommentRepository;
import com.example.codeclan.newscmsserver.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class NewsCmsServerApplicationTests {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	CategoryRepository categoryRepository;

//	@Autowired
//	CommentRepository commentRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

//	public void createUserArticleCategoryThenSaveCategory(){
//		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
//		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
//		Category cat1 = new Category("Politics", article1);
//	}

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
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Article article2 = new Article("Tons of Stuff Happened", "This is the next summary...", "This is the full text of the article2", user1, "13-03-2021");
		Article article3 = new Article("Much Stuff Happened", "This is another summary...", "This is the full text of the article3", user1, "14-03-2021");
		user1.addArticle(article1);
		user1.addArticle(article2);
		assertEquals(2, user1.getUserArticleCount());
	}

	@Test
	public void canRemoveArticleFromUser() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Article article2 = new Article("Tons of Stuff Happened", "This is the next summary...", "This is the full text of the article2", user1, "13-03-2021");
		Article article3 = new Article("Much Stuff Happened", "This is another summary...", "This is the full text of the article3", user1, "14-03-2021");
		user1.addArticle(article1);
		user1.addArticle(article2);
		user1.removeArticle(article1);
		assertEquals(1, user1.getUserArticleCount());
	}

	//ARTICLE TESTS
	@Test
	public void articleHasHeadline() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("Loads of Stuff Happened", article1.getHeadline());
	}

	@Test
	public void canSetArticleHeadline() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setHeadline("Loads of Other Stuff Happened");
		assertEquals("Loads of Other Stuff Happened", article1.getHeadline());
	}

	@Test
	public void articleHasSummary() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("This is the summary...", article1.getSummary());
	}

	@Test
	public void canSetArticleSummary() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setSummary("This is the sunny summary...");
		assertEquals("This is the sunny summary...", article1.getSummary());
	}

	@Test
	public void articleHasFullText() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("This is the full text of the article", article1.getFullText());
	}

	@Test
	public void canSetFullText() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setFullText("This is the full text of the article and a bit more");
		assertEquals("This is the full text of the article and a bit more", article1.getFullText());
	}

	@Test
	public void articleHasAuthor() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals(user1, article1.getUser());
	}

	@Test
	public void canSetArticleAuthor() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		User user2 = new User("Jim", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setUser(user2);
		assertEquals(user2, article1.getUser());
	}

	@Test
	public void articleHasDate() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("12-03-2021", article1.getDate());
	}

	@Test
	public void canSetDate() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		article1.setDate("20-03-2021");
		assertEquals("20-03-2021", article1.getDate());
	}

	@Test
	public void canAddCategoryToArticle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		Category cat1 = new Category("Politics", article1);
		article1.addCategory(cat1);
		assertEquals(1, article1.getCategoryCount());
	}

	@Test
	public void canRemoveCategoryFromArticle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		Category cat1 = new Category("Politics", article1);
		Category cat2 = new Category("Technology", article1);
		article1.addCategory(cat1);
		article1.addCategory(cat2);
		article1.removeCategory(cat1);
		assertEquals(1, article1.getCategoryCount());
	}

	//CATEGORY TESTS
	@Test
	public void categoryHasName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Category cat1 = new Category("Politics", article1);
		assertEquals("Politics", cat1.getCategoryName());
	}

	@Test
	public void categoryCanSetFirstName() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Category cat1 = new Category("Politics", article1);
		cat1.setCategoryName("Technology");
		assertEquals("Technology", cat1.getCategoryName());
	}


}
