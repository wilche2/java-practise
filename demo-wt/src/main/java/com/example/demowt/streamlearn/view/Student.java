package com.example.demowt.streamlearn.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author caowq
 * @date 2021-08-26 11:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String province;
    private int age;
    private BigDecimal money;
    private List<Integer> list;

    public Student(String province, int age) {
        this.province = province;
        this.age = age;
    }

    public Student(String province, int age, BigDecimal money) {
        this.province = province;
        this.age = age;
        this.money = money;
    }

    public Student(int age) {
        this.age = age;
    }


}
