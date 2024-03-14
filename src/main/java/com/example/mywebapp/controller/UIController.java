import com.example.mywebapp.model.User;
import com.example.mywebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UIController {

    @Autowired
    private UserService userService;

    @GetMapping("/userlist")
    public String getUserList(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users"; // Return the name of the Thymeleaf template
    }
}
