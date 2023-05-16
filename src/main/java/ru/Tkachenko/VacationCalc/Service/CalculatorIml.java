/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.Tkachenko.VacationCalc.Service;

import org.springframework.stereotype.Service;
import ru.Tkachenko.VacationCalc.Entity.UserEntity;

@Service
public class CalculatorIml {
    public UserEntity vacCalculator (UserEntity userEntity)
    {
        userEntity.setVacSalary(userEntity.getSalary()*userEntity.getVacLen());
        return userEntity;
    }
}
