package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Article;
import dto.User;

public class ArticleDao extends DBConnection{

	public int insertArticle(Article article) {
		String sql = "insert article(title, content, writer) values(?,?,?)";
		Connection conn = DBConnection.getConnection();
		
		
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getContent());
			pstmt.setString(3, article.getWriter());
			cnt = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
			
		}
		
		return cnt;
	}
	
	public int updateArticle(Article article) {
		String sql = "update article set title=?, content=? where num =?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getContent());
			pstmt.setInt(3, article.getNum());
			cnt = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return cnt;
	}
	
	public int deleteArticle(Integer num) {
		String sql = "delete from article where num=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			cnt = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		return cnt;
	}
	
	public Article selectArticle(Integer num) {
		String sql = "select a.num, a.title, a.content, a.writer, u.name writerName from article a left join user u on(u.id = a.writer) where num=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Article article = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  num);
			rset = pstmt.executeQuery();
			if(rset!=null&& rset.next()) {
				article = new Article();
				article.setNum(rset.getInt("num"));
				article.setTitle(rset.getString("title"));
				article.setContent(rset.getString("content"));
				article.setWriter(rset.getString("writer"));
				article.setWriterName(rset.getString("writerName"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		
		return article;
	}
	
	public List<Article> selectByWriterId(String id) {
		String sql = "select a.num, a.title, a.content, a.writer, u.name writerName from article a left join user u on(u.id = a.writer) where writer=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Article> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  id);
			rset = pstmt.executeQuery();
			
			if(rset != null) {
				while(rset.next()) {
					Article article = new Article();
					article.setNum(rset.getInt("num"));
					article.setTitle(rset.getString("title"));
					article.setContent(rset.getString("content"));
					article.setWriter(rset.getString("writer"));
					article.setWriterName(rset.getString("writerName"));
					list.add(article);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}
	
	public List<Article> selectByWriterName(String name) {
		String sql = "select a.num, a.title, a.content, a.writer, u.name writerName from article a left join user u on(u.id = a.writer) where u.name = ?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Article> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  name);
			rset = pstmt.executeQuery();
			
			if(rset != null) {
				while(rset.next()) {
					Article article = new Article();
					article.setNum(rset.getInt("num"));
					article.setTitle(rset.getString("title"));
					article.setContent(rset.getString("content"));
					article.setWriter(rset.getString("writer"));
					article.setWriterName(rset.getString("writerName"));
					list.add(article);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		
		return list;
	}
	
	public List<Article> selectArticleList() {
		return null;
	}

}
