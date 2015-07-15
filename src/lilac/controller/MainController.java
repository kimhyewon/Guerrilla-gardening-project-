package lilac.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import lilac.model.Article;
import lilac.service.ArticleService;
import lilac.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@Autowired private ArticleService articleService;
	@Autowired private MainService mainService;
	
	// article list 보여줌
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showArticleList(Model model, HttpSession session) throws ServletException, IOException {
		List<Article> articles = mainService.getArticles();

		model.addAttribute("articles", articles);
		
		return "index";
	}
		
	// 마이페이지 
//	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
//	public String myPageForCustomer(Model model, HttpSession session) {
//		String userId = (String) session.getAttribute("userId");
//		Customer customer = shopService.getMyInfo(url, userId);
//
//		model.addAttribute("user", customer);
	
//		return "mypage";
//	}
}
