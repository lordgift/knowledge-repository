package app.fordict.bean;

public class Thai2Eng {
	/**
	 * primary key(running number)
	 */
	private int _id;
	
	/**
	 * searching string in <I>thai</I>
	 */
	private String tsearch;
	
	/**
	 * searching string in <I>thai</I>#2
	 */
	private String tentry;
	
	/**
	 * meaning in <I>english</I>
	 */
	private String eentry;
	
	/**
	 * <p>Lexical Category</p>
	 * a category to which a word is assigned in accordance with its syntactic functions. 
	 * In English the main parts of speech are noun, pronoun, adjective, determiner, verb, adverb, preposition, conjunction, and interjection. 
	 * <p>Also called word class, Part of Speech</p>
	 */
	private String tcat;
	
	/**
	 * Synonym, a word or phrase that means exactly or nearly the same as another word or phrase in the same language
	 */
	private String tsyn;
	
	/**
	 * more meaning
	 */
	private String tenglish;
	
	/**
	 * Antonym, a word opposite in meaning to another
	 */
	private String tant;
	
	/**
	 * Type of quality call Ex. à¸­à¸±à¸? à¸?à¸´à¹?à¸? 
	 */
	private String tnum;
	
	/**
	 * definition of meaning
	 */
	private String tdef;
	
	/**
	 * sample sentence of vocabulary
	 */
	private String tsample;

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
	 * @return {@link #tsearch} - String
	 */
	public String getTsearch() {
		return tsearch;
	}

	public void setTsearch(String tsearch) {
		this.tsearch = tsearch;
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
	 * @return {@link #eentry} - String
	 */
	public String getEentry() {
		return eentry;
	}

	public void setEentry(String eentry) {
		this.eentry = eentry;
	}

	/**
	 * @return {@link #tcat} - String
	 */
	public String getTcat() {
		return tcat;
	}

	public void setTcat(String tcat) {
		this.tcat = tcat;
	}

	/**
	 * @return {@link #tsyn} - String
	 */
	public String getTsyn() {
		return tsyn;
	}

	public void setTsyn(String tsyn) {
		this.tsyn = tsyn;
	}

	/**
	 * @return {@link #tenglish} - String
	 */
	public String getTenglish() {
		return tenglish;
	}

	public void setTenglish(String tenglish) {
		this.tenglish = tenglish;
	}

	/**
	 * @return {@link #tant} - String
	 */
	public String getTant() {
		return tant;
	}

	public void setTant(String tant) {
		this.tant = tant;
	}

	/**
	 * @return {@link #tnum} - String
	 */
	public String getTnum() {
		return tnum;
	}

	public void setTnum(String tnum) {
		this.tnum = tnum;
	}

	/**
	 * @return {@link #tdef} - String
	 */
	public String getTdef() {
		return tdef;
	}

	public void setTdef(String tdef) {
		this.tdef = tdef;
	}

	/**
	 * @return {@link #tsample} - String
	 */
	public String getTsample() {
		return tsample;
	}

	public void setTsample(String tsample) {
		this.tsample = tsample;
	}

}
