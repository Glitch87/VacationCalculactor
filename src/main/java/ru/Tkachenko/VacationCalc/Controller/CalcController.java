/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.Tkachenko.VacationCalc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.Tkachenko.VacationCalc.Entity.UserEntity;
import ru.Tkachenko.VacationCalc.Service.CalculatorIml;

@Controller 
public class CalcController {
    @Autowired
    private CalculatorIml calculatorImp;
        @GetMapping
    public UserEntity getSum(UserEntity userEntity) {
        return calculatorImp.vacCalculator(userEntity);
    }
}
