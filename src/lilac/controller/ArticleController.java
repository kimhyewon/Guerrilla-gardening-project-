package lilac.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import lilac.model.Article;
import lilac.model.ArticleComment;
import lilac.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import core.exception.InsertTargetRecordNotFoundException;

@Controller
public class ArticleController {
	@Autowired private ArticleService articleService;
	
	// article 보여주기
	@RequestMapping(value = "/{articleId}", method = RequestMethod.GET)
	public String listGet(Model model, @PathVariable("articleId") String articleId, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		Article article = articleService.getArticle(Integer.parseInt(articleId));
//		List<ArticleComment> comments = articleService.getComments(article.getId());
		
		model.addAttribute("article", article);
//		model.addAttribute("comments", comments);
		return "showArticle";
	}
	
	// article create form 보내주기
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String wirteGet(Model model, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
//		Article article = articleService.getArticle(Integer.parseInt(articleId));
		
//		model.addAttribute("article", article);
		model.addAttribute("user", userId);
		
		
		return "articleForm";
	}

	// article create form에서 정보 받아오기
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public ModelAndView writePost(Article article, HttpSession session, Model model) {
		articleService.insertArticle(article);
		return new ModelAndView("redirect:/"+article.getId());
	}
	
	// article 수정 form 보내주기
	@RequestMapping(value = "/update/{articleId}", method = RequestMethod.GET)
	public String updateGet(Model model, @PathVariable("articleId") String articleId, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		Article article = articleService.getArticle(Integer.parseInt(articleId));
		
		model.addAttribute("article", article);
		return "updateBoardForm";
	}

	// article 수정 form 받아오기
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView articleUpdatePost(Model model, Article article) {
		articleService.updateArticle(article);
		return new ModelAndView("redirect:/article/"+article.getId());
	}

	// article 본문 삭제 구현
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView articleDeletePost(Integer articleId) {
		Article article = null;
		article = articleService.getArticle(articleId);
		articleService.deleteArticle(article.getId());
		return new ModelAndView("redirect:/");
	}
}
