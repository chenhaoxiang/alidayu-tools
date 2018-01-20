import com.uifuture.alidayu.config.impl.AlidayuTemplateImpl;
import com.uifuture.alidayu.server.impl.AlidayuInitServiceImpl;
import com.uifuture.alidayu.utils.AlidayuExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 11:49.
 * Explain:
 */
public class Main {
    //初始化
    static {
        AlidayuExecutorService.setExecutorService(Executors.newFixedThreadPool(50));
        AlidayuInitServiceImpl alidayuInitService = new AlidayuInitServiceImpl();
        alidayuInitService.setAlidayuAccountConfig(new MyConfig());
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AlidayuExecutorService alidayuExecutorService = new AlidayuExecutorService();
        //方式一
//        alidayuExecutorService.runCallable(new AlidayuTemplateImpl<String>("{\"uifname\":\"chenhaoxiang\",\"authcode\":\"123456\"}","139****86"));

        //方式二
        Template template = new Template();
        template.setAuthcode("654321");
        template.setUifname("陈浩翔");
        Object back = alidayuExecutorService.runCallableAndBack(new AlidayuTemplateImpl<Template>(template,"139*****86"));
        System.out.println(back.toString());
    }

}
