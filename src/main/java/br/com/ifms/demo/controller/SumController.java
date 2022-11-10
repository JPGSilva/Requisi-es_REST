package br.com.ifms.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ifms.demo.model.Somar;

@Controller
@RequestMapping(value = "calculator")
public class SumController {

    @GetMapping("/list")
    public String hello() {
        System.out.println("hello word Baby!");
        return "hello";
    }

    @GetMapping("/{n1}/{n2}")
    public ResponseEntity< Integer> sum(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2) {
        Somar somar = new Somar(n1, n2);
        return ResponseEntity.ok(somar.Getsoma());
    }

    @PostMapping("/greeting")
    public ResponseEntity<Integer> sumpost(@RequestBody Somar sumpost){
        Somar sum_post = new Somar(sumpost.getNum1(), sumpost.getNum2());
        return ResponseEntity.ok(sum_post.Getsoma());
    }

}
