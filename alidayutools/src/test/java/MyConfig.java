import com.uifuture.alidayu.config.AlidayuAccountConfig;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 11:42.
 * Explain:
 */
@Data
public class MyConfig extends AlidayuAccountConfig {
    /**
     *  成为阿里大于开发者，创建应用后系统自动生成appkey
     */
    private String appkey = "23701052";
    /**
     * 成为阿里大于开发者，创建应用后系统会自动生成secret
     */
    private String secret ="bfaff3fd0b76e61a31179907e17f246a";
    /**
     * 短信签名，传入的短信签名必须是在阿里大于“管理中心-短信签名管理”中的可用签名。
     * 如“阿里大于”已在短信签名管理中通过审核，
     * 则可传入”阿里大于“（传参时去掉引号）作为短信签名。短信效果示例：【阿里大于】欢迎使用阿里大于服务。
     */
    private String smsFreeSignName ="UI未来";
    /**
     * 短信模板ID，传入的模板必须是在阿里大于
     * “管理中心-短信模板管理”中的可用模板。示例：SMS_585014
     */
    private String smsTemplateCode="SMS_56180142";
}
