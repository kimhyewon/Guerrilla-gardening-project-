package lilac.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import lilac.model.Article;
import lilac.model.ArticleComment;
import lilac.model.FileInfo;
import lilac.model.Notice;
import lilac.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import core.exception.ForignKeyException;
import core.exception.InsertTargetRecordNotFoundException;
import core.exception.NotSupportFileSizeException;
import core.exception.NotSupportFileTypeException;
import core.util.ModelAndViewUtils;

@Controller
public class ArticleController {
	@Autowired private ArticleService articleService;
	
	// article 보여주기
	@RequestMapping(value = "/{articleId}", method = RequestMethod.GET)
	public String listGet(Model model, @PathVariable("articleId") String articleId, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		Article article = articleService.getArticle(Integer.parseInt(articleId));
		List<ArticleComment> comments = articleService.getComments(article.getId());

		model.addAttribute("article", article);
		model.addAttribute("comments", comments);
		return "showArticle";
	}
	
	// article create form 보내주기
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String wirteGet(Model model, HttpSession session) {
//		String userId = (String) session.getAttribute("userId");
//		Article article = articleService.getArticle(Integer.parseInt(articleId));
		
//		model.addAttribute("article", article);
//		model.addAttribute("user", userId);
		
		
		return "articleForm";
	}
	
//	@RequestMapping(value = "/create", method = RequestMethod.POST)
//	public ModelAndView writePost(Product product, FileInfo fileInfo, @PathVariable("shopUrl") String url) {
//			fileInfo.checkUploadFIle();
//
//			fileInfo.setFileNameByUUID();
//		fileInfo.updateLocalLocation();
//		product.setImgUrl(fileInfo.getLocalLocation());
//
//		productService.representImage(fileInfo, product);
//
//		return new ModelAndView("redirect:/shop/"+url+"/category/"+product.getCategoryId());
//	}

	// article create form에서 정보 받아오기
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public ModelAndView writePost(Article article, FileInfo fileInfo) {
//		articleService.insertArticle(article);
		try{
			fileInfo.checkUploadFIle();
		} catch (NotSupportFileSizeException | NotSupportFileTypeException e) {
			return ModelAndViewUtils.renderToNotice(new Notice("error", e.getMessage()));
		}
		fileInfo.setFileNameByUUID();
		fileInfo.updateLocalLocation();
		article.setBeforeImg(fileInfo.getLocalLocation());
		try {
			articleService.representImage(fileInfo, article);
		} catch (Exception e) {
			return ModelAndViewUtils.renderToNoticeForSeller(new Notice("Fail", "상품을 등록을 다시 시도해 주세요 "));
		}
		return new ModelAndView("redirect:/");
	}	
	
	
	// article 수정 form 보내주기
	@RequestMapping(value = "/update/{articleId}", method = RequestMethod.GET)
	public String updateGet(Model model, @PathVariable("articleId") String articleId, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		Article article = articleService.getArticle(Integer.parseInt(articleId));
		
		model.addAttribute("article", article);
		return "updateArticleForm";
	}

	// article 수정 form 받아오기
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView articleUpdatePost(Model model, Article article) {
		articleService.updateArticle(article);
		return new ModelAndView("redirect:/"+article.getId());
	}

	// article 본문 삭제 구현
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView articleDeletePost(Integer articleId) {
		Article article = null;
		article = articleService.getArticle(articleId);
		articleService.deleteArticle(article.getId());
		return new ModelAndView("redirect:/");
	}
	
	//댓글 등록 구현
	@RequestMapping(value = "/save/answer", method = RequestMethod.POST)
	protected String commentPost(String articleId, String userId, String content,
			HttpSession session, Model model) throws ServletException,
			IOException, ForignKeyException {
			
		ArticleComment articleComment = new ArticleComment(Integer.parseInt(articleId), userId, content);
		articleService.insertArticleCommnet(articleComment);
			
		return "redirect:/"+articleId;
	}
		
	//댓글 삭제 구현
	@RequestMapping(value = "/delete/answer", method = RequestMethod.POST)
	protected String commentDeletePost(String articleId, String userId, String commentTime,
			HttpSession session, Model model) throws ServletException,
			IOException, ForignKeyException {
			
		articleService.deleteArticleComment(Integer.parseInt(articleId), userId, commentTime);
		
		return "redirect:/"+articleId;
	}
}
