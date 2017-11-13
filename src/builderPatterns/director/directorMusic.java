package builderPatterns.director;

import java.util.ArrayList;

import builderPatterns.abstractMusic.chineseMusicModel;
import builderPatterns.abstractMusic.englishMusicModel;
import builderPatterns.abstractMusicBuilder.chineseMusicBuilder;
import builderPatterns.abstractMusicBuilder.englishMusicBuilder;


/**
 * �������ִ����˳��
 * @author liumengxi
 * ����Ĺ����ǹ���ʲô���������������̣��������һ������������
 * ���շ��ع������ʵ��
 *
 */
public class directorMusic {
	
	
	private ArrayList<String> sequeueMusicList = new ArrayList<String>();
	//���ĸ���������
	private chineseMusicBuilder cmb = new chineseMusicBuilder();
	//Ӣ�ĸ���������
	private englishMusicBuilder emb = new englishMusicBuilder();
	
	/**
	 * �����й��������ܹ���
	 * @return
	 */
	public chineseMusicModel makeChineseMusic(){
		
		//sequeueMusicListΪȫ�ֱ���������ʱ�������������
		sequeueMusicList.clear();
		
		//���ȣ��������ָ��
		sequeueMusicList.add("musicWord");
		//������������
		sequeueMusicList.add("musicName");
		//������������
		sequeueMusicList.add("musicDesc");
		//��������MV
		sequeueMusicList.add("musicMV");
		
		this.cmb.setSequeueList(sequeueMusicList);
		
		return this.cmb.makeMusic();
		
	}
	
	
	/**
	 * ����Ӣ�׷������ܹ���
	 * @return
	 */
	public englishMusicModel makeEnglishMusic(){
		
		//sequeueMusicListΪȫ�ֱ���������ʱ�������������
		sequeueMusicList.clear();
		
		//���ȣ��������ָ��
		sequeueMusicList.add("musicName");
		//�������ֱ�������
		sequeueMusicList.add("musicDesc");
		//������������
		sequeueMusicList.add("musicWord");
		//��������MV
		sequeueMusicList.add("musicMV");
		
		this.emb.setSequeueList(sequeueMusicList);
		
		return this.emb.makeMusic();
		
	}


}
