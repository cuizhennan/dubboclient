package demo.main;

import demo.action.ChatAction;

/**
 * @author zhennan-cui @date 2015年9月16日
 */
//@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //        SpringApplication.run(Main.class, args);

        new ChatAction().sayHello();
    }
}
