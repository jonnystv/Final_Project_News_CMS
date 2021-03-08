package com.example.codeclan.newscmsserver;

import com.example.codeclan.newscmsserver.models.*;
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

	//ARTICLE TESTS
	@Test
	public void articleHasTitle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("Big News", article1.getTitle());
	}

	@Test
	public void canSetArticleTitle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setTitle("In Other News");
		assertEquals("In Other News", article1.getTitle());
	}

	@Test
	public void articleHasHeadline() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("Loads of Stuff Happened", article1.getHeadline());
	}

	@Test
	public void canSetArticleHeadline() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setHeadline("Loads of Other Stuff Happened");
		assertEquals("Loads of Other Stuff Happened", article1.getHeadline());
	}

	@Test
	public void articleHasSummary() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("This is the summary...", article1.getSummary());
	}

	@Test
	public void canSetArticleSummary() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setSummary("This is the sunny summary...");
		assertEquals("This is the sunny summary...", article1.getSummary());
	}

	@Test
	public void articleHasFullText() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("This is the full text of the article", article1.getFullText());
	}

	@Test
	public void canSetFullText() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setFullText("This is the full text of the article and a bit more");
		assertEquals("This is the full text of the article and a bit more", article1.getFullText());
	}

	@Test
	public void articleHasAuthor() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals(user1, article1.getAuthor());
	}

	@Test
	public void canSetArticleAuthor() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		User user2 = new User("Jim", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		article1.setAuthor(user2);
		assertEquals(user2, article1.getAuthor());
	}

	@Test
	public void articleHasDate() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "12-03-2021");
		assertEquals("12-03-2021", article1.getDate());
	}

	@Test
	public void canSetDate() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		article1.setDate("20-03-2021");
		assertEquals("20-03-2021", article1.getDate());
	}

	@Test
	public void canAddCategoryToArticle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		Category cat1 = new Category("Politics");
		article1.addCategory(cat1);
		assertEquals(1, article1.getCategoryCount());
	}

	@Test
	public void canRemoveCategoryFromArticle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		Category cat1 = new Category("Politics");
		Category cat2 = new Category("Technology");
		article1.addCategory(cat1);
		article1.addCategory(cat2);
		article1.removeCategory(cat1);
		assertEquals(1, article1.getCategoryCount());
	}

	@Test
	public void canAddCommentToArticle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		article1.addComment(comment1);
		assertEquals(1, article1.getCommentCount());
	}

	@Test
	public void canRemoveCommentFromArticle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article", user1, "21-03-2021");
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		Comment comment2 = new Comment("Rubbish Post", "Best post all week", user1, "12-03-2021");
		Comment comment3 = new Comment("Brilliant Post", "Best post all week", user1, "12-03-2021");
		article1.addComment(comment1);
		article1.addComment(comment2);
		article1.addComment(comment3);
		article1.removeComment(comment1);
		assertEquals(2, article1.getCommentCount());
	}

	//ALLARTICLES TESTS

	@Test
	public void canAddArticlesToAllArticles() {
		AllArticles cms1 = new AllArticles("CMS1");
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Article article2 = new Article("Bigger News", "Tons of Stuff Happened", "This is the next summary...", "This is the full text of the article2", user1, "13-03-2021");
		Article article3 = new Article("Biggest News", "Much Stuff Happened", "This is another summary...", "This is the full text of the article3", user1, "14-03-2021");
		cms1.addArticle(article1);
		cms1.addArticle(article2);
		assertEquals(2, cms1.getArticleCount());
	}

	@Test
	public void canRemoveArticlesFromAllArticles() {
		AllArticles cms1 = new AllArticles("CMS1");
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Article article1 = new Article("Big News", "Loads of Stuff Happened", "This is the summary...", "This is the full text of the article1", user1, "12-03-2021");
		Article article2 = new Article("Bigger News", "Tons of Stuff Happened", "This is the next summary...", "This is the full text of the article2", user1, "13-03-2021");
		Article article3 = new Article("Biggest News", "Much Stuff Happened", "This is another summary...", "This is the full text of the article3", user1, "14-03-2021");
		cms1.addArticle(article1);
		cms1.addArticle(article2);
		cms1.addArticle(article3);
		cms1.removeArticle(article2);
		cms1.removeArticle(article3);
		assertEquals(1, cms1.getArticleCount());
	}

	//CATEGORY TESTS
	@Test
	public void categoryHasName() {
		Category cat1 = new Category("Politics");
		assertEquals("Politics", cat1.getCategoryName());
	}

	@Test
	public void categoryCanSetFirstName() {
		Category cat1 = new Category("Politics");
		cat1.setCategoryName("Technology");
		assertEquals("Technology", cat1.getCategoryName());
	}

	//COMMENT TESTS
	@Test
	public void commentHasTitle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		assertEquals("Great Post", comment1.getCommentTitle());
	}

	@Test
	public void commentCanSetTitle() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		comment1.setCommentTitle("Wonderful Post");
		assertEquals("Wonderful Post", comment1.getCommentTitle());
	}

	@Test
	public void commentHasText() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		assertEquals("Best post all week", comment1.getCommentText());
	}

	@Test
	public void commentCanSetText() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		comment1.setCommentText("Best post all month");
		assertEquals("Best post all month", comment1.getCommentText());
	}

	@Test
	public void commentHasAuthor() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		assertEquals(user1, comment1.getCommentAuthor());
	}

	@Test
	public void commentCanSetAuthor() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		User user2 = new User("Jim", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		comment1.setCommentAuthor(user2);
		assertEquals(user2, comment1.getCommentAuthor());
	}

	@Test
	public void commentHasDate() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		assertEquals("12-03-2021", comment1.getCommentDate());
	}

	@Test
	public void commentCanSetDate() {
		User user1 = new User("Bob", "Smith", "bobsmith", "bob@smith.com", UserType.ADMINISTRATOR);
		Comment comment1 = new Comment("Great Post", "Best post all week", user1, "12-03-2021");
		comment1.setCommentDate("21-03-2021");
		assertEquals("21-03-2021", comment1.getCommentDate());
	}

}
