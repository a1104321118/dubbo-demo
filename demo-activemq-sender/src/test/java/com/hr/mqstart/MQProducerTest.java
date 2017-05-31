package com.hr.mqstart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hr.params.MailParam;
import com.hr.sender.MQProducer;

/**
 * 
 * @描述: ActiveMQ测试启动类 .
 * @作者: WuShuicheng .
 * @创建时间: 2015-3-17,上午2:25:20 .
 * @版本号: V1.0 .
 */
public class MQProducerTest {
	private static final Log log = LogFactory.getLog(MQProducerTest.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();

			MQProducer mqProducer = (MQProducer) context.getBean("mqProducer");
			// 邮件发送
			MailParam mail = new MailParam();
			//这个邮箱不需要开启smtp服务，但是发送邮件的那一方要开启
			mail.setTo("1104321118@qq.com");
			mail.setSubject("ActiveMQ测试");
			mail.setContent("通过ActiveMQ异步发送邮件！");
			
			//此处是发送消息，不是发送邮件
			mqProducer.sendMessage(mail);

			context.stop();
		} catch (Exception e) {
			log.error("==>MQ context start error:", e);
			System.exit(0);
		} finally {
			log.info("===>System.exit");
			System.exit(0);
		}
	}
}
