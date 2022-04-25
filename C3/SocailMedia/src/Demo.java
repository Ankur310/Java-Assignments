
public class Demo {

	public static void main(String[] args) {
		// any social media strategy.
		SocialMediaContext context = new SocialMediaContext();
		 //Setting Facebook strategy.
		SocialMedia sm1 = context.setSocialMediaStrategy(new Facebook());
		//sm1.connect("Lokesh");
		// Setting Twitter strategy.
		SocialMedia sm2 = context.setSocialMediaStrategy(new Twitter());
		sm2.connect("Lokesh");
		// Setting GooglePlus strategy.
		SocialMedia sm3 =context.setSocialMediaStrategy(new GooglePlusStrategy());
		sm3.connect("Lokesh");
		// Setting Orkut strategy.
		SocialMedia sm4 =context.setSocialMediaStrategy(new Orkut());
		sm4.connect("Lokesh");
	}
}
