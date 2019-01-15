
package com.zl.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.Busers;
import com.zl.pojo.BusersCondition;
import com.zl.pojo.Demp;
import com.zl.pojo.PageVo;
import com.zl.pojo.ReturnData;
import com.zl.pojo.UserType;
import com.zl.service.IBusersService;
import com.zl.service.IDempService;
import com.zl.service.IUserTypeService;

@Controller
@RequestMapping("/user")
public class BusersController {
	@Autowired
	private  IBusersService  busersService;
	@Autowired
	private IDempService dempService;
	@Autowired
	private IUserTypeService userTypeService;
	
	
	@ResponseBody
	@RequestMapping("/selectAll.action")
	public  ReturnData  selectAll(String name ,String password ,HttpSession session) {
		Busers  buser = busersService.selectALL(name,password);
		ReturnData  rt = new ReturnData();
		if (buser != null) {
			rt.setStart("success");	
			session.setAttribute("buser", buser);
		}else {
			rt.setStart("error");
			rt.setMsg("用户名或密码错误!");
		}
		return rt;
	}
	
	@RequestMapping("/selectAllUser.action")
	public String selectAllUser(BusersCondition busersCondition, Model model ,  HttpSession session) {
		if (session.getAttribute("buser") != null) {
			Busers  buser = (Busers)session.getAttribute("buser");
			if (buser.getUtId()==2) {
				busersCondition.setdNO(buser.getDpNo());
			}
			busersCondition.setBuNo(buser.getBuNo());
			busersCondition.setUtId(buser.getUtId());
			
		}
		PageVo<Busers> pages = busersService.selectAllUser(busersCondition);
		model.addAttribute("pages", pages);
		this.qureyAll(model);
		return "index";
	}
	//ɾ��
	@RequestMapping("/deletBusers.action")
	public String deletBusers(Integer [] cid ,HttpSession	session) {
		if (cid != null ) {
			if (session.getAttribute("buser")!= null) {
				Busers  buser =(Busers)session.getAttribute("buser");
				for (Integer id : cid) {
					if (buser.getBuNo()!=id) {
						busersService.deletBusers(id);
					}
				}
			}
		}
		return "redirect:/user/selectAllUser.action";
	}
	//�鿴
	@RequestMapping("/selcetBusersId.action")
	public String  selcetBusersId(Integer cid ,Model model) {
		Busers buser = busersService.selcetBusersId(cid);
		model.addAttribute("buser", buser);
		this.qureyAll(model);
		return "serr";
	}
	//����ǰ
	@RequestMapping("/updateBusers.action")
	public String updateBusers(Integer cid ,Model model) {
		Busers buser = busersService.selcetBusersId(cid);
		model.addAttribute("buser", buser);
		this.qureyAll(model);
		return "update";
	}
	
	//�����ύ
	@RequestMapping("/updateUser.action")
	public String updateUser(Busers buser , Model model) {
		busersService.updateUser(buser);
		return "redirect:/user/selectAllUser.action";
	}
	//ע��ǰ
	@RequestMapping("/addUser.action")
	public String addUser(Model model) {
		this.qureyAll(model);
		return "add";
	}
	//ע���ύ
	@RequestMapping("/addBusers.action")
	public String addBusers(Busers buser) {
		busersService.addBusers(buser);
		return "login";
		
	}
	
	/**
	 * ������ѯ����
	 * @param model
	 */
	private  void qureyAll(Model model) {
		List<Demp> demp = dempService.selectAll();
		model.addAttribute("demp", demp);
		List<UserType> userType = userTypeService.selectAll();
		model.addAttribute("userType", userType);
	}
}
