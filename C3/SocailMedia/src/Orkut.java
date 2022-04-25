import java.util.List;

public class Orkut extends SocialMedia
{
	List<Person> person;
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
