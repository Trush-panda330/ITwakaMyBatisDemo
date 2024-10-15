package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("user/list")
	public String displayUser(Model model) {
		List<User> userList = userService.selectAllUser();
		for(User user:userList) {
			System.out.println(user);
		}
		model.addAttribute("userList", userList);
		return "user/list";
	}

	@PostMapping("user/list/{id}")
	public String oneUser(@PathVariable Long id, Model model,
			RedirectAttributes attributes) {
		User user = userService.findUserById(id);
		if (user != null) {
			model.addAttribute("user", userService.findUserById(id));
			return "user/user";
		} else {
			attributes.addFlashAttribute("msg", "退場データがありません");
			return "redirect:/list";
		}

	}
}
