package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.UserSearchRequest;
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

	
	@GetMapping("user/search")
	public String searchUser(Model model) {
	    model.addAttribute("userSearchRequest", new UserSearchRequest()); // 空の UserSearchRequest をモデルに追加
	    model.addAttribute("user", new User());  // User オブジェクトも初期化
	    return "user/search";
	}


	/*ユーザー情報検索
	 *  @param userSearchRequest リクエストデータ
	 *  @param Model model
	 *  @return ユーザー情報一覧画面
	 *  */
	@PostMapping("user/search")
	public String oneUser(@ModelAttribute UserSearchRequest userSearchRequest,  Model model) {
		User user = userService.searchByIdUser(userSearchRequest);
			model.addAttribute("user",user);
			return "user/search";
	}
}
