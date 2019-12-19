package com.wcc.udp;
/**
 * 加入多线程，实现双向交流 模拟在线咨询
 * @author wcc
 * @Date 2019年12月18日 下午10:09:23
 */
public class TalkTeacher {
	public static void main(String[] args) {
		System.out.println("老师上线...");
		new Thread(new TalkSend(8888, "localhost", 7777)).start();//发送
		new Thread(new TalkReceive(9999,"学生")).start();//接收 
	}
}
