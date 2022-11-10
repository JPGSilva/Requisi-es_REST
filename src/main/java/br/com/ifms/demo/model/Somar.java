package br.com.ifms.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Somar {
    private Integer num1;
    private Integer num2;

    public Integer Getsoma() {
        return num1 + num2;
    }

 
}
