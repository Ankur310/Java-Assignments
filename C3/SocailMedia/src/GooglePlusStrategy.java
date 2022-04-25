import java.util.List;
import java.util.Map;


public class GooglePlusStrategy extends SocialMedia{
	
	List<Person> person;
	Map<OnlineStatus,Person> online_people;
	
	@Override
	public String connect(String str) {
		   if(this.person.contains(str)) {
			   return "Connecting with"+str+"throgh Twitter";
		   }
		   else {
			   return "Connecting with"+str+"throgh Twitter(not availble)";
		   }
		}
}
