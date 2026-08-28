import java.util.List;

import dao.ArticleDao;
import dto.Article;

public class ArticleMain {

	public static void main(String[] args) {
		ArticleDao articleDao = new ArticleDao();
		
		// 1. insert

//		articleDao.insertArticle(new Article("제목1", "내용1", "hong"));
//		articleDao.insertArticle(new Article("제목2", "내용2", "song"));
//		articleDao.insertArticle(new Article("제목3", "내용3", "hong"));
//		articleDao.insertArticle(new Article("제목4", "내용4", "song"));
//		articleDao.insertArticle(new Article("제목5", "내용5", "hong"));
//		
		
//		// 2. delete
//		articleDao.deleteArticle(1);
//		
////		// 3. select
//		Article article = articleDao.selectArticle(2);
//		System.out.println(article);
////		
////		// 4. update
//		Article article2 = articleDao.selectArticle(2);
//		article2.setTitle("제목하이");
//		article2.setContent("내용수정");
//		articleDao.updateArticle(article2);
//		System.out.println(article2);
//		
//		// 5. 작성자가 hong인 글 조회
//		List<Article> list = articleDao.selectByWriterId("hong");
//		for(Article a : list) {
//			System.out.println(a);
//		}
//		
		// 6. 작성자 이름이 송길동인 글 조회
		List<Article> list2 = articleDao.selectByWriterName("송길동");
		for(Article a: list2) {
			System.out.println(a);
		}
	}

}
