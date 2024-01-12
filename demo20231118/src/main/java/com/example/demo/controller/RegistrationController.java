import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.User;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
  
  @GetMapping("/form")
  public String showRegistrationForm(Model model) {
    model.addAttribute("user", new User());
    return "registrationForm";
  }
  
  @PostMapping("/submit")
  public String processRegistration(User user) {
    // 处理用户注册逻辑
    return "registrationConfirmation";
  }
}
