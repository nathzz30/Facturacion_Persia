package Entity;
import java.util.ArrayList;



public class Inventory {

	private ArrayList<Article> articles = new ArrayList<Article>();
	

	public Inventory(ArrayList<Article> articles) {
		super();
		this.articles = articles;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}


	public boolean DeleteArticle (int code) 
	{
		
		for(int i=0; i<articles.size() ; i++)
		{
			
			if(articles.get(i).getCode() == code)
			{
				articles.remove(i);
				return true;
			}
		}
		return false;
	}
}
