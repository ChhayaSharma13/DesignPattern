
public class MailService {
	public void sendEmail() {
		connect();
		authenticate();
		//sendEmail
		disconnect();
	}
	public void connect() {
		System.out.println("Connect");
	}
	public void disconnect() {
		System.out.println("Disconnect");
	}
	public void authenticate() {
		System.out.println("Authenticate");
	}
}

