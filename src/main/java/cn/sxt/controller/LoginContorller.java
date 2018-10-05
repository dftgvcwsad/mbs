package cn.sxt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sxt.domain.Operator;
import cn.sxt.service.OperatorService;
import cn.sxt.vo.OperatorVo;

@Controller
@RequestMapping("login")
public class LoginContorller {

	@Autowired
	private OperatorService operatorService;

	@RequestMapping("toLogin")
	public String toLogin() {
		return "main/login";
	}

	@RequestMapping("login")
	public String login(HttpSession session, OperatorVo operatorVo, Model model) {
		Operator operator = operatorService.selectById(operatorVo.getOperatorId());
		if (null == operator) {
			model.addAttribute("error", "帐号不存在");
			return "main/login";
		} else {
			if (!operator.getOperatorPwd().equals(operatorVo.getOperatorPwd())) {
				model.addAttribute("error", "密码错误");
				return "main/login";
			} else {
				session.setAttribute("operator", operator);
				return "main/index";
			}
		}
	}

}
