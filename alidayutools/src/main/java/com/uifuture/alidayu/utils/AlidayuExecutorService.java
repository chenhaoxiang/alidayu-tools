package com.uifuture.alidayu.utils;

import com.uifuture.alidayu.config.AlidayuTemplate;
import com.uifuture.alidayu.server.impl.SendAlidayuCodeServiceImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2018/1/19.
 * Time: 下午 10:37.
 * Explain: ExecutorService线程池
 */
public class AlidayuExecutorService<T> {
    private static ExecutorService executorService;
    /**
     * 初始化executorService
     * @param executorService
     */
    public static void setExecutorService(ExecutorService executorService){
        AlidayuExecutorService.executorService=executorService;
    }
    public static ExecutorService getExecutorService(){
        return AlidayuExecutorService.executorService;
    }
    /**
     * 等待多线程方法运行完获取返回值。主线程会阻塞
     * @param alidayuTemplate
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public Object runCallableAndBack(AlidayuTemplate<T> alidayuTemplate) throws ExecutionException, InterruptedException {
        Callable callable =new SendAlidayuCodeServiceImpl<T>(alidayuTemplate);
        return executorService.submit(callable).get().toString();
    }

    /**
     * 直接运行多线程方法。不阻塞主线程运行
     * @param alidayuTemplate
     * @return
     */
    public Future runCallable(AlidayuTemplate<T> alidayuTemplate){
        Callable callable =new SendAlidayuCodeServiceImpl<T>(alidayuTemplate);
        return executorService.submit(callable);
    }
}
