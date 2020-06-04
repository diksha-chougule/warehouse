package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;

@Controller // =Object + HTTP Request
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	
	//1. Show Register Page
		/**
		 *  URL :/register, Type:GET 
		 *  Goto Page ShipmentTypeRegister.html
		 */
		@GetMapping("/register")
		public String showRegister() {
			return "ShipmentTypeRegister";
		}
		
		
		//2. save : on click submit
		/**
		 * URL: /save, Type: POST
		 * Goto : ShipmentTypeRegister
		 */
		@PostMapping("/save")
		public String save(
				//read from Data from UI(given by container)
				@ModelAttribute ShipmentType shipmentType,
				Model model //to send data to UI
				)
		{
			//perform save operation
			Integer id=service.saveShipmentType(shipmentType);
			//construct one message
			String message="ShipmentType '"+id+"' saved successfully";
			//send message to UI
			model.addAttribute("message", message);
			//Goto Page
			return "ShipmentTypeRegister";
		}
		
		//3. Display data
		//4. Remove one by Id
		//5. Show Edit Page with data
		//6. Update: on click update
}
