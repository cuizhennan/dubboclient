package demo.action;

import java.util.Calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.IDemoService;

/**
 * @author zhennan-cui @date 2015年9月16日
 */
public class ChatAction {

    private ClassPathXmlApplicationContext context;

    //    @Resource
    //    IDemoService demoService;

    public void sayHello() {
        context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
        context.start();

        IDemoService demoService = (IDemoService) context.getBean("demoService");

        System.out.println("client:"
                + demoService.sayHello("Morning" + "1:==> " + Calendar.getInstance().getTime())
                + " ==>3:" + Calendar.getInstance().getTime());
    }
}
