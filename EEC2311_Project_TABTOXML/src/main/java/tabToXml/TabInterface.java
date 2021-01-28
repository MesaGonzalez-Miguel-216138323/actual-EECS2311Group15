package tabToXml;

public interface TabInterface {

	/**
	 * Converts a Note
	 * C > C#/Db > D > D#/Eb > E > F > F#/Gb > G > G#/Ab > A > A#/Bb > B > Loops back to C
	 * @param Note
	 * @return
	 */
	public static String translate(String Note) {
		String[] table = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};		
		String letter = Note.substring(0,1);
		String number = Note.substring(1);		
		//find location in table
		int location = 0;
		for(int i = 0; i < table.length; i++) {
			if(letter.equals(table[i])) {
				location = i;
				break;
			}
		}
		int i = Integer.parseInt(number);
		int num = i;
		while(i > 0) {
			location++;
			i--;
			if(location == table.length) {
				location = 0;
				num++;
			}
		}		
		String newNote = table[location]+num;
		return newNote;
	}
}
