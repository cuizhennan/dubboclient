package demo.action;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.IDemoService;

/**
 * @author zhennan-cui @date 2015年9月16日
 */
@Controller
@RequestMapping("/say")
public class ChatAction {

    Logger logger = LoggerFactory.getLogger(ChatAction.class);

    @Autowired
    IDemoService demoService;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        logger.info("sayHell start");
        return demoService.sayHello("Morning" + "1:==> " + Calendar.getInstance().getTime());
    }
}
