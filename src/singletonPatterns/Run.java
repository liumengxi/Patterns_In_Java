package singletonPatterns;

import singletonPatterns.innerClassSingleton.innerClassSingletonThread;
import singletonPatterns.lazySingleton.lazySingletonThread;
import singletonPatterns.rightNowSingleton.rightNowSingletonThread;

public class Run {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/**
		 * ���Զ���ģʽ����
		 * ѭ����������ģʽ�̣߳���ӡ���ö����hashֵ����������hashֵ����һ�µġ� 
		 *
		 */
		System.out.println("������������/����ģʽ����ʾ��");
		Thread [] thread = new Thread[5];
		rightNowSingletonThread[] r = new rightNowSingletonThread[5];
		for(int i = 0; i < 5; i++){
			
            r[i] = new rightNowSingletonThread(); 
			thread[i] = new Thread(r[i]);
			thread[i].start();
		}				
		
		
		Thread.sleep(5000);
		
		/**
		 * ��������ģʽ����
		 * ѭ����������ģʽ�̣߳���ӡhashֵ
		 * 
		 * ##ע��һ��##��
		 * �˴�����ӳټ���/����ģʽ�еĻ�ȡʵ���������û�����ͬ���ؼ��ֵĻ������̲߳�����ʱ�򣬻����
		 * hashֵ��һ�µ������Ҳ����˵���ӳټ���/����ģʽ�ĵ����ڶ��̲߳��������£������Ͻ�������ֶ�ʵ���������
		 * ���Ҫ���������⣺��Ҫ�ڴ���ʵ���ķ����м���synchronized�ؼ��ֽ���ͬ����
		 * ʵ�ַ������ lazySingleton���е�getLazySingleton()�����е�ͬ��ʵ��
		 * Ϊ���Ч�ʣ��˴�ʹ�õ�ͬ�������Ǵ�������ʽ����ʹ��˫������(DCL)
		 * 
		 */
		System.out.println("�����ӳټ���/����ģʽ����ʾ��");
		Thread [] threadLazy = new Thread[5];
		lazySingletonThread [] lazySlt = new lazySingletonThread[5];
		for(int i = 0; i < 5; i ++){
			lazySlt[i] = new lazySingletonThread();
			threadLazy[i] = new Thread(lazySlt[i]);
			threadLazy[i].start();
		}
		
		
		Thread.sleep(5000);
		/**
		 * ���Ծ�̬�ڲ���ĵ������ģʽ
		 * �������̲߳�������
		 */
		System.out.println("���Ծ�̬�ڲ��൥��ʾ��");
		Thread [] innerThread = new Thread[5];
		innerClassSingletonThread []innClassSlt = new innerClassSingletonThread[5];
		for(int i = 0 ; i < 5; i ++){
			innClassSlt[i] = new innerClassSingletonThread();
			innerThread[i] = new Thread(innClassSlt[i]);
			innerThread[i].start();
			
		}

	}

}
