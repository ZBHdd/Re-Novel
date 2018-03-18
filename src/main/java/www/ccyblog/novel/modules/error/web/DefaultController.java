package www.ccyblog.novel.modules.error.web;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by ccy on 2017/7/31.
 * 404默认显示页面
 */
@Log4j
@Controller
public class DefaultController {
    @RequestMapping(value={"/notfound"})
    public String showIndex(Model model){
        return "notfound";
    }

}
