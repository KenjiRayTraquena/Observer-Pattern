public class Main{
    public static void main(String[] args){

        NewsAgency agency = new NewsAgency();

        Observer sub1 = new NewsSubscriber("Kenji");
        Observer sub2 = new NewsSubscriber("Ray");
        Observer sub3 = new NewsSubscriber("Zea");

        agency.registerObserver(sub1);
        agency.registerObserver(sub2);

        agency.publishNews("Major scientific breakthrough announced in renewable energy!");
        agency.registerObserver(sub3);
        agency.publishNews("Global markets reach all-time high amid economic recovery.");
        agency.removeObserver(sub2);
        agency.publishNews("Local championship finals scheduled for next weekend.");
    
    }

}