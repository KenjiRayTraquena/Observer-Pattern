import java.util.ArrayList;
import java.util.List;
public class NewsAgency{
    private List<Observer> subscribers = new ArrayList<>();
    private String latestNews;
    
    public void registerObserver(Observer observer){
        subscribers.add(observer);
        System.out.println("A new subscriber has joined.");
    }
    public void removeObserver(Observer observer){
        subscribers.remove(observer);
        System.out.println("A subscriber has unsubscribed.");
    }
    public void notifyObservers(){
        for (Observer observer : subscribers){
            observer.update(latestNews);
        }
    }
    public void publishNews(String news){
        this.latestNews = news;
        System.out.println("\nBreaking News Published: "+news);
        notifyObservers();
    }

}