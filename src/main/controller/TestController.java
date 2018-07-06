package controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


@Controller
@RequestMapping(value="/Test")
public class TestController {

    @RequestMapping(value = "/ceshi", method= RequestMethod.POST)
    @ResponseBody
    public JSONObject ceshi(String name){
        System.out.println(name);
        HashMap<String,Object> map=new HashMap<>();
        map.put("name","张三");
        map.put("age",19);
        map.put("addr","羊城岁月");
        return JSONObject.fromObject(map);
    }
}
