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

        Article article1 = new Article("The Philosophy of Tech", "Well, she turned me into a newt.", "The Knights Who Say Ni demand a sacrifice! It's only a model. It's only a model. The nose? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Did you dress her up like this? And the hat. She's a witch! Well, how'd you become king, then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Look, my liege! On second thoughts, let's not go there. It is a silly place. How do you know she is a witch? Did you dress her up like this? Why? I have to push the pram a lot. Be quiet! Well, Mercia's a temperate zone!", bobsmith, "12/03/2021");
        articleRepository.save(article1);
        Article article2 = new Article("Technology is Great", "And this isn't my nose. This is a false one.", "Listen. Strange women lying in ponds distributing swords is no basis for a system of government. Supreme executive power derives from a mandate from the masses, not from some farcical aquatic ceremony. Why? The Lady of the Lake, her arm clad in the purest shimmering samite, held aloft Excalibur from the bosom of the water, signifying by divine providence that I, Arthur, was to carry Excalibur. That is why I am your king. Well, I got better. Shh! Knights, I bid you welcome to your new home. Let us ride to Camelot! Who's that then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Well, I didn't vote for you.", bobsmith, "11/04/2021");
        articleRepository.save(article2);
        Article article3 = new Article("Computers are King", "Why do you think that she is a witch?", "What a strange person. We found them. Look, my liege! You don't vote for kings. Burn her! Who's that then? And this isn't my nose. This is a false one. How do you know she is a witch? Knights of Ni, we are but simple travelers who seek the enchanter who lives beyond these woods. A newt? On second thoughts, let's not go there. It is a silly place. Why do you think that she is a witch? The Lady of the Lake, her arm clad in the purest shimmering samite, held aloft Excalibur from the bosom of the water, signifying by divine providence that I, Arthur, was to carry Excalibur. That is why I am your king. A newt? Camelot! Where'd you get the coconuts? Shut up! Will you shut up?! Well, I got better.", jimbrown, "13/03/2021");
        articleRepository.save(article3);
        Article article4 = new Article("Back to the Stone Age", "A newt? Camelot! Where'd you get the coconuts?", "The Knights Who Say Ni demand a sacrifice! I dunno. Must be a king. We found them. Where'd you get the coconuts? Well, I didn't vote for you. Burn her anyway! Ni! Ni! Ni! Ni! Why? Burn her anyway! Bring her forward! Found them? In Mercia?! The coconut's tropical! Shut up! Will you shut up?! Well, I didn't vote for you. Well, I didn't vote for you. Listen. Strange women lying in ponds distributing swords is no basis for a system of government. Supreme executive power derives from a mandate from the masses, not from some farcical aquatic ceremony. Why?", anngreen, "21/03/2021");
        articleRepository.save(article4);
        Article article5 = new Article("Quantum Computing Now", "Burn her anyway! Ni! Ni! Ni! Ni!", "Shh! Knights, I bid you welcome to your new home. Let us ride to Camelot! Who's that then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Well, I didn't vote for you. Look, my liege! I dunno. Must be a king. Now, look here, my good man. Burn her anyway! Well, she turned me into a newt. Well, Mercia's a temperate zone! Where'd you get the coconuts? Why do you think that she is a witch? I am your king. It's only a model. Camelot! Well, we did do the nose. Why do you think that she is a witch? I dunno. Must be a king. The Knights Who Say Ni demand a sacrifice!", anngreen, "08/03/2021");
        articleRepository.save(article5);
        Article article6 = new Article("10 Top JavaScript Frameworks", "Shh! Knights, I bid you welcome to your new home.", "And the hat. She's a witch! Well, how'd you become king, then? You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! Look, my liege! On second thoughts, let's not go there. It is a silly place. How do you know she is a witch? Did you dress her up like this? Why? I have to push the pram a lot. Be quiet! Well, Mercia's a temperate zone! On second thoughts, let's not go there. It is a silly place. Oh, ow! Why? Bring her forward! I have to push the pram a lot. We want a shrubbery!! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! He hasn't got shit all over him. You don't vote for kings.", anngreen, "06/03/2021");
        articleRepository.save(article6);
        Article article7 = new Article("Developing on Windows", "You don't frighten us, English pig-dogs!", "You don't frighten us, English pig-dogs! Go and boil your bottoms, sons of a silly person! I blow my nose at you, so-called Ah-thoor Keeng, you and all your silly English K-n-n-n-n-n-n-n-niggits! Well, how'd you become king, then? Found them? In Mercia?! The coconut's tropical! Where'd you get the coconuts? And the hat. She's a witch! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! What a strange person. We found them. Look, my liege! You don't vote for kings. Burn her! Who's that then?", jillduffy, "02/03/2021");
        articleRepository.save(article7);
        Article article8 = new Article("Hybrid, Electric or Hydrogen?", "On second thoughts, let's not go there.", "We want a shrubbery!! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you! He hasn't got shit all over him. You don't vote for kings. You don't frighten us, English pig-dogs! Go and boil your bottoms, sons of a silly person! I blow my nose at you, so-called Ah-thoor Keeng, you and all your silly English K-n-n-n-n-n-n-n-niggits! Well, how'd you become king, then? Found them? In Mercia?! The coconut's tropical! Where'd you get the coconuts? And the hat. She's a witch! You can't expect to wield supreme power just 'cause some watery tart threw a sword at you!", jillduffy, "06/03/2021");
        articleRepository.save(article8);

        Category cat1 = new Category("Politics", article6);
        categoryRepository.save(cat1);
        Category cat2 = new Category("Technology", article6);
        categoryRepository.save(cat2);
        Category cat3 = new Category("Health", article6);
        categoryRepository.save(cat3);
        Category cat4 = new Category("Environment", article5);
        categoryRepository.save(cat4);
        Category cat5 = new Category("Sport", article4);
        categoryRepository.save(cat5);
        Category cat6 = new Category("Lifestyle", article3);
        categoryRepository.save(cat6);
        Category cat7 = new Category("Business", article1);
        categoryRepository.save(cat7);
        Category cat8 = new Category("Entertainment", article1);
        categoryRepository.save(cat8);

        article1.addCategory(cat1);
        article1.addCategory(cat3);
        articleRepository.save(article1);

        article2.addCategory(cat2);
        article2.addCategory(cat3);
        articleRepository.save(article2);

        article3.addCategory(cat1);
        article3.addCategory(cat4);
        articleRepository.save(article3);

        article4.addCategory(cat2);
        article4.addCategory(cat3);
        article4.addCategory(cat4);
        articleRepository.save(article4);

        article5.addCategory(cat1);
        article5.addCategory(cat3);
        articleRepository.save(article5);

        article6.addCategory(cat2);
        article6.addCategory(cat8);
        articleRepository.save(article6);

        article7.addCategory(cat6);
        article7.addCategory(cat7);
        articleRepository.save(article7);

        article8.addCategory(cat8);
        article8.addCategory(cat6);
        articleRepository.save(article8);

    }

}
