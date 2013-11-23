package app.fordict.bean;

public class Eng2Thai {
	
	/**
	 * primary key(running number)
	 */
	private int _id;
	
	/**
	 * searching string in <I>english</I>
	 */
	private String esearch;
	
	/**
	 * searching string in <I>english</I> #2
	 */
	private String eentry;
	
	/**
	 * meaning in <I>thai</I>
	 */
	private String tentry;
	
	/**
	 * <p>Lexical Category</p>
	 * a category to which a word is assigned in accordance with its syntactic functions. 
	 * In English the main parts of speech are noun, pronoun, adjective, determiner, verb, adverb, preposition, conjunction, and interjection. 
	 * <p>Also called word class, Part of Speech</p>
	 */
	private String ecat;
	
	/**
	 * more meaning
	 */
	private String ethai;
	
	/**
	 * Synonym, a word or phrase that means exactly or nearly the same as another word or phrase in the same language
	 */
	private String esyn;
	
	/**
	 * Antonym, a word opposite in meaning to another
	 */
	private String eant;

	
	/**
	 * @return {@link #_id} - int
	 */
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	/**
	 * @return {@link #esearch} - String
	 */
	public String getEsearch() {
		return esearch;
	}

	public void setEsearch(String esearch) {
		this.esearch = esearch;
	}

	/**
	 * @return {@link #eentry} - String
	 */
	public String getEentry() {
		return eentry;
	}

	public void setEentry(String eentry) {
		this.eentry = eentry;
	}
	
	/**
	 * @return {@link #tentry} - String
	 */
	public String getTentry() {
		return tentry;
	}

	public void setTentry(String tentry) {
		this.tentry = tentry;
	}

	/**
	 * @return {@link #ecat} - String
	 */
	public String getEcat() {
		return ecat;
	}

	public void setEcat(String ecat) {
		this.ecat = ecat;
	}

	/**
	 * @return {@link #ethai} - String
	 */
	public String getEthai() {
		return ethai;
	}

	public void setEthai(String ethai) {
		this.ethai = ethai;
	}

	/**
	 * @return {@link #esyn} - String
	 */
	public String getEsyn() {
		return esyn;
	}

	public void setEsyn(String esyn) {
		this.esyn = esyn;
	}

	/**
	 * @return {@link #eant} - String
	 */
	public String getEant() {
		return eant;
	}

	public void setEant(String eant) {
		this.eant = eant;
	}

}
