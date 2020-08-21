
public class MailService {
	public void sendEmail() {
		connect(1);
		authenticate();
		//sendEmail
		disconnect();
	}
	private void connect(int timeOut) {
		System.out.println("Connect");
	}
	private void disconnect() {
		System.out.println("Disconnect");
	}
	private void authenticate() {
		System.out.println("Authenticate");
	}
}

