package dto;

public class Article {
	Integer num;
	String title;
	String content;
	String writer;
	String writerName;
	
	public Article() {
		
	}
	
	public Article(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
	public Article(Integer num, String title, String content, String writer, String writerName) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writerName = writerName;
	}
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return this.writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriterName() {
		return this.writerName;
	}
	
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
	@Override
	public String toString() {
		return "Article [num=" + num + ", title=" + title+", content=" + content+", writer=" + writer+", writerName=" + writerName+"]";
	}

}
