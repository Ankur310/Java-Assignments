import java.util.List;
import java.util.Map;

public class Facebook extends SocialMedia {

	List<Person> person;
	Map<OnlineStatus, Person> online_status;

	@Override
	public String connect(String str) {
		if (this.person.contains(str)) {
			return "Connecting with" + str + "throgh Twitter";
		} else {
			return "Connecting with" + str + "throgh Twitter(not availble)";
		}
	}

}
