
public class SocialMediaContext {
	
	SocialMedia socialmedia;

	public SocialMediaContext() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SocialMedia setSocialMediaStrategy(SocialMedia sm) {
		if(sm instanceof Facebook) {
			return new Facebook();
		}
		else if(sm instanceof GooglePlusStrategy) {
			return new GooglePlusStrategy();
		}
		
		else if(sm instanceof Orkut) {
			return new Orkut();
		}
		else if(sm instanceof Twitter) {
			return new Twitter();
		}
		return null;
	}


	public void connect(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
