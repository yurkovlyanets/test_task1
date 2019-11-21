package yurkovlyanets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import yurkovlyanets.Model.Order;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@Controller
public class MainController {

    List<Order> orders = new ArrayList<>();

    @GetMapping("/carrier")
    public String carrierview(){
        return "carrier";
    }

    @GetMapping("/operator")
    public String operatormodel(Model model) {
        model.addAttribute("orders", orders);
        return "operator";
    }

    @PostMapping("carrier")
    public String addorder(
            @RequestParam("orderNumber") int orderNumber
    ){
        orders.add(new Order(orderNumber));
        return "redirect:/carrier";
    }
}
