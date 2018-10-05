package cn.sxt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;

import cn.sxt.constast.MBS_Constast;
import cn.sxt.domain.Operator;
import cn.sxt.service.OperatorService;
import cn.sxt.uitls.DataGridView;
import cn.sxt.vo.OperatorVo;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 阿银
 * @since 2018-10-01
 */
@Controller
@RequestMapping("/operator")
public class OperatorController {
	
	@Autowired
	private OperatorService operatorService;
	
	@RequestMapping("toDeskManager")
	public String toDeskManager() {
		return "main/deskManager";
	}
	
	@RequestMapping("toOperatorManager")
	public String toOperatorManager(HttpSession session,Model model) {
		Operator attribute = (Operator) session.getAttribute("operator");
		if(attribute.getIsAdmin().equals(MBS_Constast.OPERATOR_TYPE_ADMIN)) {
			return "operator/operatorManager";
		}else {
			model.addAttribute("error", "你不是管理员无妨访问这个功能");
			return "main/deskManager";
		}
	}
	
	@RequestMapping("queryAllOperator")
	@ResponseBody
	public DataGridView  queryAllOperator(OperatorVo operatorVo) {
		Wrapper<Operator> wrapper=new EntityWrapper<Operator>(operatorVo);
		Page<Operator> page =new Page<>(operatorVo.getPage(), operatorVo.getLimit());
		 Page<Operator> selectPage = operatorService.selectPage(page, wrapper);
		return new DataGridView(page.getTotal(), selectPage.getRecords());
	}
	
}

