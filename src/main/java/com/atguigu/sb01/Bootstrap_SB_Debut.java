package com.atguigu.sb01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootstrap_SB_Debut {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap_SB_Debut.class, args);
    }

}

/*
经过试验表明，把这个类放在 controller 包的同一级目录下面，运行以后，可以扫描到 controller 包里面的控制器组件。
在 controller 包的同一级目录下建立另一个包 bower，把本类放在 bower 包下面，那么本类运行以后，不会去扫描 controller 包里面的控制器组件。
 */