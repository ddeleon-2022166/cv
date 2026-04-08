package com.diegodeleon.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CvController {

    @GetMapping("/")
    public String mostrarCv(Model model) {

        model.addAttribute("nombre", "Diego Alejandro de León García");
        model.addAttribute("titulo", "Programador");
        model.addAttribute("descripcion", "Desarrollador en formación con conocimientos en Java y Spring Boot, enfocado en el desarrollo de aplicaciones backend. \n" +
                "He desarrollado proyectos personales que incluyen APIs REST, manejo de bases de datos y autenticación de usuarios. \n" +
                "Me destaco por mi responsabilidad, ganas de aprender y pasión por la tecnología. ");
        model.addAttribute("email", "ddeleon-2022166@kinal.edu.gt");
        model.addAttribute("telefono", "+502 8956 2309");

        return "cv";
    }
}