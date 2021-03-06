package tabToXml;

public interface TabInterface {

	/**
	 * Converts a Note
	 * C > C#/Db > D > D#/Eb > E > F > F#/Gb > G > G#/Ab > A > A#/Bb > B > Loops back to C
	 * @param Note
	 * @return
	 */
	public static String translate(String string, int fret) {
		String[] table = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};			
		//find location in table
		int location = 0;
		for(int i = 0; i < table.length; i++) {
			if(string.substring(0,1).equals(table[i])) {
				location = i;
				break;
			}
		}
		
		int startingOctave = Integer.parseInt(string.substring(1));
		int octave = startingOctave;
		while(fret > 0) {
			location++;
			fret--;
			if(location == table.length) {
				location = 0;
				octave++;
			}
		}		
		String newNote = table[location]+octave;
		return newNote;
	}
}
