package com.example.secure.secureApp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {
          List<student> students=new ArrayList<>(List.of(
                  new student(1,"abc","java"),
                  new student(2,"xyz","python")
                  ));
          @GetMapping("/student")
    public  List<student> getStudents(){
              return students;
          }
          @PostMapping("/student")
    public  String addStudent(@RequestBody student student ){
              return "addded";
          }
          @GetMapping("csrfToken")
    public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest){
              return (CsrfToken) httpServletRequest.getAttribute("_csrf");
          }
}
