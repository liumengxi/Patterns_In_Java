package statePatterns.state;

import java.awt.Color;

import statePatterns.context.Context;

/**
 * ״̬�л���
 * State�Ķ���: ��ͬ��״̬,��ͬ����Ϊ;����˵,ÿ��״̬������Ӧ����Ϊ.
 * ��ʱʹ�ã�
 * Stateģʽ��ʵ��ʹ���бȽ϶�,�ʺ�"״̬���л�".��Ϊ���Ǿ�����ʹ��If elseif else ����״̬�л�, 
 * ������״̬�������ж��л���������,���Ǿ�Ҫ���뵽�Ƿ���Բ�ȡStateģʽ��.
 * ��ֻ�Ǹ���״̬,Ҳ�и�������.���ĳ����������Բ�ͬ,�������Ϊ�Ͳ�һ��,��������ݿ�ϵͳ�г���Ƶ�ʱȽϸ�,���Ǿ�������һ�����ݱ��β��,
 * ����property���Ժ�����ֶ�,���Ա�ʶ��¼��һЩ�������ʵļ�¼,�������Եĸı�(�л�)������ʱ���ܷ�����,���п���Ҫʹ��State.
 * @author liumengxi
 */
public abstract class State{

	public abstract void handlepush(Context c);
	public abstract void handlepull(Context c);
	public abstract Color getcolor();

	}
	 

