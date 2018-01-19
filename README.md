阿里大于的短信发送工具类
简化你的代码

目前只支持阿里大于的模板短信发送
其他功能尚在进行中  
当前版本V1.0.0

使用方法:
前期准备
创建一个你的模板类，例如
Template.java
```
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 11:45.
 * Explain:
 */
@Data
public class Template {
    private String authcode;
    private String uifname;
}
```
里面的两个字段是我在阿大于短信模板中留的字段，注意名字对上。  

接下来是配置类
需要继承AlidayuAccountConfig，需要的参数在AlidayuAccountConfig中有，请自行赋值  

在项目开始初始化 
```
 AlidayuExecutorService.setExecutorService(Executors.newFixedThreadPool(50));//线程数
        AlidayuInitServiceImpl alidayuInitService = new AlidayuInitServiceImpl();
        alidayuInitService.setAlidayuAccountConfig(new MyConfig());//初始化阿里大于配置
```

发送短信 - 注意，下面的发送短信需要在主线程运行，否则无法发送成功
```
 AlidayuExecutorService alidayuExecutorService = new AlidayuExecutorService();
        //方式一
//        alidayuExecutorService.runCallable(new AlidayuTemplateImpl<String>("{\"uifname\":\"chenhaoxiang\",\"authcode\":\"123456\"}","13973553186"));

        //方式二
        Template template = new Template();
        template.setAuthcode("654321");
        template.setUifname("陈浩翔");
        Object back = alidayuExecutorService.runCallableAndBack(new AlidayuTemplateImpl<Template>(template,"13973553186"));
        System.out.println(back.toString());
```







邀请同道中人一起开发,有意向者加我QQ:619699629

