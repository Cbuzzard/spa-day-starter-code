package org.launchcode.spaday.controllers.s3;

import org.launchcode.spaday.models.s3.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("s3")
public class SpaDayControllerS3 {

    @GetMapping
    public String displayClientForm (Model model) {
        return "s3/serviceSelection";
    }

    @PostMapping
    public String processClientForm(@RequestParam String skintype, @RequestParam String manipedi, Model model) {
        Client newClient = new Client(skintype, manipedi);
        newClient.setAppropriateFacials(skintype);
        model.addAttribute("client" , newClient);

        return "s3/menu";
    }
}
