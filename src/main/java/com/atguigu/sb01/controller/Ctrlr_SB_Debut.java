package com.atguigu.sb01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ctrlr_SB_Debut {

    private static String count;

    @ResponseBody
    @RequestMapping("/hello")
    public String handleHello(){
        if(count==null){
            count = "0";
        }
        try {
            int countInt = Integer.parseInt(count);
            countInt++;
            count = String.valueOf(countInt);
        }catch(Exception e){

        }

        String output = "You've entered class Ctrlr_SB_Debut's method handleHello.\nThis is its " + count + " time being visited.\n\n";
        System.out.print(output);
        return "Kiss you puss~";
    }

}
