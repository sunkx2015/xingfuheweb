package cc.xingfuhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SunKuiXing
 * @Description:
 * @package: cc.xingfuhe.controller
 * @date 2020-12-01 15:15
 */
@Controller
@RequestMapping
public class MainController {

    @RequestMapping("/")
    public String indexRequest(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("/{path}")
    public String anyRequest(HttpServletRequest request,@PathVariable("path") String path){
        System.out.println(path);
        return path;
    }
}
