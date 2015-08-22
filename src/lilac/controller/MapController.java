package lilac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MapController {
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String showArticleList(Model model, HttpSession session) throws ServletException, IOException {
		
		return "map";
	}
}
