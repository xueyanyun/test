

//public interface DataList
//{
//	public static final String dm_user_list_set = "user_list";
//	public static final String dim_book_name_re_id_set = "book_list";
//	public static final String dim_author_name_re_id_set = "author_list";
//	public static final String dim_author_book_set ="author_book";
//	public static final String dm_bookid_tag_weight_hash = "book_tags";
//	public static final String dm_authorid_tag_weight_hash = "author_tags";
//	public static final String dm_searchword_tag_weight_hash = "word_tags";
//	public static final String dim_tag_re_recomendbooks_set = "tag_books";
//	public static final String dm_user_his_book_set = "his_books";
//	public static final String dm_key_related_weight_hash = "key_related";
//}

public enum DataList {

	DM_USER_LIST_SET("user_list"),
	DIM_BOOK_NAME_RE_ID_SET("book_list"),
	DIM_AUTHOR_NAME_RE_ID_SET("author_list"),
	DIM_AUTHOR_BOOK_SET("author_book"),//可能用不到
	DM_BOOKID_TAG_WEIGHT_HASH("book_tags"),
	DM_AUTHORID_TAG_WEIGHT_HASH("author_tags"),
	DM_SEARCHWORD_TAG_WEIGHT_HASH("word_tags"),
	DIM_TAG_RE_RECOMENDBOOKS_SET("tag_books"),//可能用不到
	DM_USER_BOOK_SET("his_books"),//可能用不到
	DM_KEY_RELATED_WEIGHT_HASH("key_related");	
	
	private String name;
	private DataList(String name){
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}	
}