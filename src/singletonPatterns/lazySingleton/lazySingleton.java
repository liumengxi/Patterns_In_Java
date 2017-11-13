package singletonPatterns.lazySingleton;

/**
 * �������ģʽ
 * �ӳټ���/����ģʽ
 * @author liumengxi
 * ����ģʽ����������ȥ��ʵ��������ֻ����Ҫʹ�õ��ö����ʱ���ȥʵ�����˶���
 * �磺����getLazySingleton()�������Ż�new����ʵ������
 * ʹ��DCL˫������ʵ�ֶ��̻߳����еĵ������ģʽ
 *
 */
public class lazySingleton {
	
	private static lazySingleton lazySlt = null;
	
	private lazySingleton(){
		
	}
	
    public  static lazySingleton getLazySingleton(){
    	
    	synchronized(lazySingleton.class){
    		if(lazySlt == null){
          			lazySlt = new lazySingleton();
    	  }
    	}
    	return lazySlt;
    }
}
