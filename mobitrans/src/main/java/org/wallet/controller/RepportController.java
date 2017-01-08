package org.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("rapport")
public class RepportController {

	 @RequestMapping(value = "/", method = RequestMethod.GET)
	public String rapport(Model model){
		return "rapports/rapports";
	}
}
