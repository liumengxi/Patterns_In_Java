package adapterPatterns.outLibrary;

import java.util.HashMap;
import java.util.Map;

/**
 * 外部图书馆系统实现类
 * @author liumengxi
 *
 */
public class OutLibraryBooks implements OutLibrary {
	
	

	@Override
	public Map<String, String> ComputerBooks() {
		Map<String,String> mapCom = new HashMap<String, String>();
		
		mapCom.put("Java", "Think in Java");
		return mapCom;
	}

	@Override
	public Map<String, String> LetterBooks() {
		Map<String,String> mapLetter = new HashMap<String, String>();
		
		mapLetter.put("letter", "Old man with sea");
		return mapLetter;
	}

	@Override
	public Map<String, String> CookingBooks() {
		
		Map<String,String> mapCooking = new HashMap<String, String>();
		mapCooking.put("cooking", "westFoodsBook");
		return mapCooking;
	}

}
