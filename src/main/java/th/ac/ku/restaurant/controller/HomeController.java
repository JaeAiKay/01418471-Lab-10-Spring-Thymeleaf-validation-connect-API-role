package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model) {
        // ส่งค่า
        model.addAttribute("greeting", "Sawaddee");
        model.addAttribute("hay", "Hayyyyy");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนีี้คืนค่าเป็น home.html
        return "home";
    }

}