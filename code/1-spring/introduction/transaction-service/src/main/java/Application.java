import com.hikex.service.TransactionServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		// 1. Setup configuration 
		TransactionServiceImpl transactionService = new TransactionServiceImpl();
		
		// 2. Use configurations
		transactionService.trasfer(1000, 1L, 2L);
		
		transactionService.trasfer(2000, 1L, 2L);
		
		// 3. Destroy Configurations
	}
}
