package com.nhan.service;

import com.nhan.models.Sandwich;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {

    public String show(Sandwich sandwich) {
        String result = "";
        if (sandwich.isLettuce()) {
            result += "lettuce";
        }
        if (sandwich.isTomato()) {
            result += ", tomato";
        }
        if (sandwich.isMustard()) {
            result += ", mustard";
        }
        if (sandwich.isSprouts()) {
            result += ", sprouts";
        }
        return result;
    }

    public String getList(Sandwich sandwich) {
        List<String> list = new ArrayList<String>();
        StringBuilder result = new StringBuilder();
        if (sandwich.isLettuce()) {
            list.add("lettuce, ");
        }
        if (sandwich.isTomato()) {
            list.add("tomato, ");
        }
        if (sandwich.isMustard()) {
            list.add("mustard, ");
        }
        if (sandwich.isSprouts()) {
            list.add("spouts, ");
        }
        for (String condiment : list) {
            result.append(condiment);
        }
        return result.toString();

    }
}
