������ڵĶ��ŷ��͹�����
����Ĵ���

Ŀǰֻ֧�ְ�����ڵ�ģ����ŷ���
�����������ڽ�����  
��ǰ�汾V1.0.0

ʹ�÷���:
ǰ��׼��
����һ�����ģ���࣬����
Template.java
```
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: �º���.
 * Date: 2018/1/19.
 * Time: ���� 11:45.
 * Explain:
 */
@Data
public class Template {
    private String authcode;
    private String uifname;
}
```
����������ֶ������ڰ����ڶ���ģ���������ֶΣ�ע�����ֶ��ϡ�  

��������������
��Ҫ�̳�AlidayuAccountConfig����Ҫ�Ĳ�����AlidayuAccountConfig���У������и�ֵ  

����Ŀ��ʼ��ʼ�� 
```
 AlidayuExecutorService.setExecutorService(Executors.newFixedThreadPool(50));//�߳���
        AlidayuInitServiceImpl alidayuInitService = new AlidayuInitServiceImpl();
        alidayuInitService.setAlidayuAccountConfig(new MyConfig());//��ʼ�������������
```

���Ͷ��� - ע�⣬����ķ��Ͷ�����Ҫ�����߳����У������޷����ͳɹ�
```
 AlidayuExecutorService alidayuExecutorService = new AlidayuExecutorService();
        //��ʽһ
//        alidayuExecutorService.runCallable(new AlidayuTemplateImpl<String>("{\"uifname\":\"chenhaoxiang\",\"authcode\":\"123456\"}","139****86"));

        //��ʽ��
        Template template = new Template();
        template.setAuthcode("654321");
        template.setUifname("�º���");
        Object back = alidayuExecutorService.runCallableAndBack(new AlidayuTemplateImpl<Template>(template,"139****86"));
        System.out.println(back.toString());
```


��Maven������
```
<dependency>
    <groupId>com.uifuture</groupId>
    <artifactId>alidayu-tools</artifactId>
    <version>1.0.0</version>
</dependency>
```



����ͬ������һ�𿪷�,�������߼���QQ:619699629

