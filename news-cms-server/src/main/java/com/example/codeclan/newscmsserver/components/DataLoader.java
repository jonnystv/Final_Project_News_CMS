package com.example.codeclan.newscmsserver.components;

import com.example.codeclan.newscmsserver.models.*;
import com.example.codeclan.newscmsserver.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User bobsmith = new User("Bob", "Smith", "bobsmith", "bobsmith@gmail.com", UserType.ADMINISTRATOR);
        userRepository.save(bobsmith);
        User jimbrown = new User("Jim", "Brown", "jimbrown", "jimbrown@gmail.com", UserType.READER);
        userRepository.save(jimbrown);
        User anngreen = new User("Ann", "Green", "anngreen", "anngreen@gmail.com", UserType.EDITOR);
        userRepository.save(anngreen);
        User jillduffy = new User("Jill", "Duffy", "jillduffy", "jillduffy@gmail.com", UserType.CONTRIBUTOR);
        userRepository.save(jillduffy);

        Article article1 = new Article("The Philosophy of Tech", "The Philosophy of Tech", "Well, she turned me into a newt.", "The Knights Who Say Ni demand a sacrifice! It's only a model. It's only a model. The nose? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Did you dress her up like this? And the hat. She's a witch! Well, how'd you become king, then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Look, my liege! On second thoughts, let's not go there. It is a silly place. How do you know she is a witch? Did you dress her up like this? Why? I have to push the pram a lot. Be quiet! Well, Mercia's a temperate zone!", bobsmith, "12/03/2021");
        articleRepository.save(article1);
        Article article2 = new Article("Technology is Great", "Technology is Great", "And this isn't my nose. This is a false one.", "Listen. Strange women lying in ponds distributing swords is no basis for a system of government. Supreme executive power derives from a mandate from the masses, not from some farcical aquatic ceremony. Why? The Lady of the Lake, her arm clad in the purest shimmering samite, held aloft Excalibur from the bosom of the water, signifying by divine providence that I, Arthur, was to carry Excalibur. That is why I am your king. Well, I got better. Shh! Knights, I bid you welcome to your new home. Let us ride to Camelot! Who's that then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Well, I didn't vote for you.", bobsmith, "11/04/2021");
        articleRepository.save(article2);
        Article article3 = new Article("Computers are King", "Computers are King", "Why do you think that she is a witch?", "What a strange person. We found them. Look, my liege! You don't vote for kings. Burn her! Who's that then? And this isn't my nose. This is a false one. How do you know she is a witch? Knights of Ni, we are but simple travelers who seek the enchanter who lives beyond these woods. A newt? On second thoughts, let's not go there. It is a silly place. Why do you think that she is a witch? The Lady of the Lake, her arm clad in the purest shimmering samite, held aloft Excalibur from the bosom of the water, signifying by divine providence that I, Arthur, was to carry Excalibur. That is why I am your king. A newt? Camelot! Where'd you get the coconuts? Shut up! Will you shut up?! Well, I got better.", jimbrown, "13/03/2021");
        articleRepository.save(article3);
        Article article4 = new Article("Back to the Stone Age", "Back to the Stone Age", "A newt? Camelot! Where'd you get the coconuts?", "The Knights Who Say Ni demand a sacrifice! I dunno. Must be a king. We found them. Where'd you get the coconuts? Well, I didn't vote for you. Burn her anyway! Ni! Ni! Ni! Ni! Why? Burn her anyway! Bring her forward! Found them? In Mercia?! The coconut's tropical! Shut up! Will you shut up?! Well, I didn't vote for you. Well, I didn't vote for you. Listen. Strange women lying in ponds distributing swords is no basis for a system of government. Supreme executive power derives from a mandate from the masses, not from some farcical aquatic ceremony. Why?", anngreen, "21/03/2021");
        articleRepository.save(article4);
        Article article5 = new Article("Quantum Computing Now", "Quantum Computing Now", "Burn her anyway! Ni! Ni! Ni! Ni!", "Shh! Knights, I bid you welcome to your new home. Let us ride to Camelot! Who's that then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Well, I didn't vote for you. Look, my liege! I dunno. Must be a king. Now, look here, my good man. Burn her anyway! Well, she turned me into a newt. Well, Mercia's a temperate zone! Where'd you get the coconuts? Why do you think that she is a witch? I am your king. It's only a model. Camelot! Well, we did do the nose. Why do you think that she is a witch? I dunno. Must be a king. The Knights Who Say Ni demand a sacrifice!", anngreen, "08/03/2021");
        articleRepository.save(article5);
        Article article6 = new Article("10 Top JavaScript Frameworks", "10 Top JavaScript Frameworks", "Shh! Knights, I bid you welcome to your new home.", "And the hat. She's a witch! Well, how'd you become king, then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Look, my liege! On second thoughts, let's not go there. It is a silly place. How do you know she is a witch? Did you dress her up like this? Why? I have to push the pram a lot. Be quiet! Well, Mercia's a temperate zone! On second thoughts, let's not go there. It is a silly place. Oh, ow! Why? Bring her forward! I have to push the pram a lot. We want a shrubbery!! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! He hasn't got shit all over him. You don't vote for kings.", anngreen, "06/03/2021");
        articleRepository.save(article6);
        Article article7 = new Article("Developing on Windows", "Developing on Windows", "You don't frighten us, English pig-dogs!", "You don't frighten us, English pig-dogs! Go and boil your bottoms, sons of a silly person! I blow my nose at you, so-called Ah-thoor Keeng, you and all your silly English K-n-n-n-n-n-n-n-niggits! Well, how'd you become king, then? Found them? In Mercia?! The coconut's tropical! Where'd you get the coconuts? And the hat. She's a witch! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! What a strange person. We found them. Look, my liege! You don't vote for kings. Burn her! Who's that then?", jillduffy, "02/03/2021");
        articleRepository.save(article7);
        Article article8 = new Article("Hybrid, Electric or Hydrogen?", "Hybrid, Electric or Hydrogen?", "On second thoughts, let's not go there.", "We want a shrubbery!! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! He hasn't got shit all over him. You don't vote for kings. You don't frighten us, English pig-dogs! Go and boil your bottoms, sons of a silly person! I blow my nose at you, so-called Ah-thoor Keeng, you and all your silly English K-n-n-n-n-n-n-n-niggits! Well, how'd you become king, then? Found them? In Mercia?! The coconut's tropical! Where'd you get the coconuts? And the hat. She's a witch! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you!", jillduffy, "06/03/2021");
        articleRepository.save(article8);

        Category cat1 = new Category("Politics", article1);
        categoryRepository.save(cat1);
        Category cat2 = new Category("Technology", article1);
        categoryRepository.save(cat2);
        Category cat3 = new Category("Health", article2);
        categoryRepository.save(cat3);
        Category cat4 = new Category("Environment", article3);
        categoryRepository.save(cat4);
        Category cat5 = new Category("Sport", article1);
        categoryRepository.save(cat5);
        Category cat6 = new Category("Lifestyle", article1);
        categoryRepository.save(cat6);
        Category cat7 = new Category("Business", article4);
        categoryRepository.save(cat7);
        Category cat8 = new Category("Entertainment", article1);
        categoryRepository.save(cat8);

        Comment comment1 = new Comment("Best Post Ever", "Look, I can take you as far as Anchorhead. You can get a transport there to Mos Eisley or wherever you're going. Still, she's got a lot of spirit. I don't know, what do you think? No! Alderaan is peaceful. We have no weapons. You can't possibly…", bobsmith, "23/03/2021", article1);
        commentRepository.save(comment1);
        Comment comment2 = new Comment("Pile of Nonsense", "Red Five standing by. In my experience, there is no such thing as luck.", jillduffy, "03/03/2021", article1);
        commentRepository.save(comment2);
        Comment comment3 = new Comment("You're 'avin' a larf!", "Don't act so surprised, Your Highness. You weren't on any mercy mission this time.", jimbrown, "24/03/2021", article1);
        commentRepository.save(comment3);
        Comment comment4 = new Comment("You go girl!", "I don't know what you're talking about. I am a member of the Imperial Senate on a diplomatic mission to Alderaan", bobsmith, "23/05/2021", article1);
        commentRepository.save(comment4);
        Comment comment5 = new Comment("Utter Bollocks", "Kid, I've flown from one side of this galaxy to the other. I've seen a lot of strange stuff", anngreen, "23/02/2021", article1);
        commentRepository.save(comment5);
        Comment comment6 = new Comment("Lovely Stuff", "You're all clear, kid. Let's blow this thing and go home!", anngreen, "23/03/2021", article1);
        commentRepository.save(comment6);
        Comment comment7 = new Comment("Not Worth Reading", "Well, take care of yourself, Han. I guess that's what you're best at, ain't it?", jillduffy, "23/06/2021", article1);
        commentRepository.save(comment7);
        Comment comment8 = new Comment("Worst Post Ever", "Don't be too proud of this technological terror you've constructed. The ability to destroy a planet is insignificant next to the power of the Force.", jimbrown, "14/03/2021", article1);
        commentRepository.save(comment8);
        Comment comment9 = new Comment("Third Worst Ever", "Look, I ain't in this for your revolution, and I'm not in it for you, Princess. I expect to be well paid.", bobsmith, "23/01/2021", article1);
        commentRepository.save(comment9);
        Comment comment10 = new Comment("WTF!", "A tremor in the Force. The last time I felt it was in the presence of my old master.", jillduffy, "20/01/2021", article1);
        commentRepository.save(comment10);

        article1.addCategory(cat1);
        article1.addCategory(cat3);
        article1.addComment(comment1);
        article1.addComment(comment4);
        article1.addComment(comment8);
        article1.addComment(comment9);
        articleRepository.save(article1);

        article2.addCategory(cat2);
        article2.addCategory(cat3);
        article1.addComment(comment2);
        article1.addComment(comment3);
        articleRepository.save(article2);

        article3.addCategory(cat1);
        article3.addCategory(cat4);
        article1.addComment(comment10);
        article1.addComment(comment6);
        articleRepository.save(article3);

        article4.addCategory(cat2);
        article4.addCategory(cat3);
        article4.addCategory(cat4);
        article1.addComment(comment1);
        article1.addComment(comment10);
        articleRepository.save(article4);

        article5.addCategory(cat1);
        article5.addCategory(cat3);
        article1.addComment(comment8);
        article1.addComment(comment9);
        articleRepository.save(article5);

        article6.addCategory(cat2);
        article6.addCategory(cat8);
        article1.addComment(comment5);
        article1.addComment(comment7);
        articleRepository.save(article6);

        article7.addCategory(cat6);
        article7.addCategory(cat7);
        article1.addComment(comment3);
        article1.addComment(comment9);
        articleRepository.save(article7);

        article8.addCategory(cat8);
        article8.addCategory(cat6);
        article1.addComment(comment9);
        article1.addComment(comment6);
        articleRepository.save(article8);

    }

}
