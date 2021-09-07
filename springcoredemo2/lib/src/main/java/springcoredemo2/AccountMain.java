package springcoredemo2;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.bean.Account;
import com.abc.controller.AccountController;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccno(10);
		account.setName("MyName");
		account.setBalance(50000);
		account.setOpeningDate(LocalDate.of(2020, 10, 10));
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		AccountController accountController = context.getBean(AccountController.class);
		
		accountController.addAccount(account);
		
		System.out.println("account saved");

		context.close();
	}

}
