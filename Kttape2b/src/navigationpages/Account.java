package navigationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Account {

	@FindBy(xpath = "(//*[@class=\"action switch\"])[2]")
	WebElement account;
	@FindBy(xpath = "(//*[@href=\"http://kttapeb2b.commercestaging.com/customer/account/\"])[2]")
	WebElement myaccount;
	@FindBy(xpath = "(//*[@class=\"action edit\"])[2]")
	WebElement editname;
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement firsteditname;
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement lasteditname;
	@FindBy(xpath = "//*[@class=\"action save primary\"]")
	WebElement saveaccountnameinfo;
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement infotext;
	@FindBy(xpath = "//*[@id=\"change-email\"]")
	WebElement emailcheckbox;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement emailtextbox;
	@FindBy(xpath = "//*[@id=\"current-password\"]")
	WebElement currentpass;
	@FindBy(xpath = "(//*[@href=\"http://kttapeb2b.commercestaging.com/customer/account/edit/\"])[1]")
	WebElement emailedit;
	@FindBy(xpath = "//*[@class=\"action change-password\"]")
	WebElement changepass;
	@FindBy(xpath = "//*[@id=\"current-password\"]")
	WebElement currentpasstext;
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement newpass;
	@FindBy(xpath = "//*[@id=\"password-confirmation\"]")
	WebElement confirmpass;
	@FindBy(xpath = "(//*[@id=\"pass\"])[1]")
	WebElement pass;
	@FindBy(xpath = "//*[@class=\"action login primary\"]")
	WebElement signin;
	@FindBy(xpath = "(//a[@href=\"http://kttapeb2b.commercestaging.com/requisition_list/requisition/index/\"])[3]")
	WebElement reuisitionlist;
	@FindBy(xpath = "//*[@class=\"nav items\"]/li[12]")
	WebElement companystructure;
	@FindBy(xpath = "//*[@class=\"action add\"]")
	WebElement createnewrequisition;
	@FindBy(xpath = "//*[@id=\"requisition-list-name\"]")
	WebElement requisitionname;
	@FindBy(xpath = "//*[@id=\"requisition-list-description\"]")
	WebElement requisitiondesc;
	@FindBy(xpath = "//*[@class=\"action primary confirm\"]")
	WebElement saverequisition;
	@FindBy(xpath = "(//*[@class=\"action-menu-item\"])[1]")
	WebElement viewrequisition;
	@FindBy(xpath = "//*[@class=\"input-checkbox\"]")
	WebElement requistioncheckbox;
	@FindBy(xpath = "(//*[@title=\"Add to Cart\"])[1]")
	WebElement addtocartrequisition;
	@FindBy(xpath = "(//*[@class=\"action primary confirm\"])[3]")
	WebElement mergetocart;
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement cartreqmsg;
	@FindBy(xpath = "//*[@class=\"input-text qty\"]")
	WebElement requisitinquan;
	@FindBy(xpath = "//*[@title=\"Update List\"]")
	WebElement updatereqlist;
	@FindBy(xpath = "//*[@title=\"Delete Requisition List\"]")
	WebElement deleterequistion;
	@FindBy(xpath = "(//*[@class=\"action primary confirm\"])[3]")
	WebElement deletebypopup;
	@FindBy(xpath = "(//*[@title=\"Remove item\"])[2]")
	WebElement removepdtfrmreq;
	@FindBy(xpath = "(//*[@class=\"action primary confirm\"])[3]")
	WebElement removebypopup;
	@FindBy(xpath = "(//*[@class=\"col product\"])[2]")
	WebElement producttext;
	@FindBy(xpath = "//*[@title=\"Rename\"]")
	WebElement renamerequsition;
	@FindBy(xpath = "//*[@id=\"requisition-list-name\"]")
	WebElement reqname;
	@FindBy(xpath = "(//*[@class=\"action primary confirm\"])[2]")
	WebElement updatesaverequistion;
	@FindBy(xpath = "(//*[@class=\"list-items\"])[1]/li[1]")
	WebElement movedropdown;
	@FindBy(xpath = "(//*[@class=\"action requisition-list-button toggle change\"])[1]")
	WebElement moveclick;
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement movesuccessmsg;
	@FindBy(xpath = "(//*[@class=\"action requisition-list-button toggle change\"])[2]")
	WebElement copyclick;
	@FindBy(xpath = "(//*[@class=\"list-items\"])[2]/li[1]")
	WebElement copydropdown;
	@FindBy(xpath = "//*[@class=\"action remove-selected\"]")
	WebElement removeoption;
	@FindBy(xpath = "//*[@href=\"http://kttapeb2b.commercestaging.com/reward/customer/info/\"]")
	WebElement rewardpoints;
	@FindBy(xpath = "//*[@id=\"subscribe_updates\"]")
	WebElement subscribeupdate;
	@FindBy(xpath = "//*[@title=\"Save Subscription Settings\"]")
	WebElement savesubscription;
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement balancesuccessmsg;
	@FindBy(xpath = "//*[@class=\"jstree-anchor company-admin jstree-clicked\"]")
	WebElement jayantastructure;
	@FindBy(xpath = "(//*[@class=\"action expand\"])[1]")
	WebElement expandlink;
	@FindBy(xpath = "(//*[@class=\"action expand\"])[2]")
	WebElement collapseall;
	@FindBy(xpath = "//*[@id=\"add-customer\"]")
	WebElement adduser;
	@FindBy(xpath = "//*[@id=\"add-team\"]")
	WebElement addteam;
	@FindBy(xpath = "//*[@id=\"edit-selected\"]")
	WebElement editselected;
	@FindBy(xpath = "//*[@id=\"delete-selected\"]")
	WebElement deleteselected;
	@FindBy(xpath = "//*[@href=\"http://kttapeb2b.commercestaging.com/company/users/\"]")
	WebElement companyuser;
	@FindBy(xpath = "//*[@class=\"action primary\"]")
	WebElement addnewuser;
	@FindBy(xpath = "//*[@id=\"jobtitle\"]")
	WebElement jobtitle;
	@FindBy(xpath = "//*[@id=\"role\"]")
	WebElement userrole;
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement firstname;
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement lastname;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"telephone\"]")
	WebElement phonenumber;
	@FindBy(xpath = "//*[@id=\"status\"]")
	WebElement status;
	@FindBy(xpath = "//*[@id=\"status\"]/option[1]")
	WebElement option1;
	@FindBy(xpath = "//*[@class=\"modal-footer\"]/button[1]")
	WebElement save;
	@FindBy(xpath = "//*[@class=\"message-success success message\"]")
	WebElement message;
	@FindBy(xpath = "(//*[@class=\"action\"])[1]")
	WebElement edit;
	@FindBy(xpath = "(//*[@class=\"action\"])[4]")
	WebElement delete;
	@FindBy(xpath = "//*[@class=\"action primary delete\"]")
	WebElement delete1;
	@FindBy(xpath = "//*[@href=\"http://kttapeb2b.commercestaging.com/company/role/\"]")
	WebElement rolesandpermission;
	@FindBy(xpath = "(//*[@class=\"actions\"]/button)[2]")
	WebElement addnewrole;
	@FindBy(xpath = "//*[@id=\"role_name\"]")
	WebElement rolename;
	@FindBy(xpath = "(//*[@class=\"primary\"]/button)[2]")
	WebElement saverole;
	@FindBy(xpath = "(//*[@class=\"action\"])[1]")
	WebElement duplicaterole;
	@FindBy(xpath = "(//*[@class=\"action\"])[2]")
	WebElement editrole;
	@FindBy(xpath = "(//*[@class=\"action\"])[3]")
	WebElement deleterole;
	@FindBy(xpath="//*[@id=\"role_name\"]")
	WebElement rolenameedit;
	@FindBy(xpath="//*[@class=\"action primary delete\"]")
	WebElement delete2role;
  
	public void editname() {
		account.click();
		myaccount.click();
		editname.click();
		firsteditname.clear();
		firsteditname.sendKeys("Lakshay");
		lasteditname.clear();
		lasteditname.sendKeys("Ahuja");
		saveaccountnameinfo.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after editing first name and last name\n" + infotext.getText());
	}

	public void editemail() {

		emailedit.click();
		emailcheckbox.click();
		emailtextbox.clear();
		emailtextbox.sendKeys("jayanta.roy92@gmail.com");
		currentpass.sendKeys("Magento123");
		saveaccountnameinfo.click();
		System.out.println("Message after updating email\n" + infotext.getText());
	}

	public void changepass() {
		changepass.click();
		currentpass.sendKeys("Magento123");
		newpass.sendKeys("Magento123");
		confirmpass.sendKeys("Magento123");
		saveaccountnameinfo.click();
		System.out.println("Meassage after changing the password\n" + infotext.getText());
		/*
		 * emailtextbox.sendKeys("sweety@gmail.com"); pass.sendKeys("lakshay@1234");
		 * signin.click();
		 */

	}

	public void createrequestionlist()

	{
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		createnewrequisition.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		requisitionname.sendKeys("lakshay");
		requisitiondesc.sendKeys("Dummy for testing");
		saverequisition.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Requisition List is created succesfully");
	}

	public void addtocartrequisition() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		viewrequisition.click();
		requistioncheckbox.click();
		addtocartrequisition.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}

		mergetocart.click();
		System.out.println("Message After adding product to cart from requistion list\n" + cartreqmsg.getText());
	}

	public void editrequistion() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		viewrequisition.click();
		requistioncheckbox.click();
		requisitinquan.clear();
		requisitinquan.sendKeys("2");
		updatereqlist.click();
		System.out.println("Quantity is updating succesfully on requisition list");

	}

	public void deleterequistion() {
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		viewrequisition.click();
		requistioncheckbox.click();
		deleterequistion.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		deletebypopup.click();
		System.out.println("Requistion list is deleted succesfully");
	}

	public void removeproductreq() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		viewrequisition.click();
		requistioncheckbox.click();
		removepdtfrmreq.click();
		removebypopup.click();
		System.out.println("Product removed succesfully from requistion list");
	}

	public void viewproductrequistion() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		viewrequisition.click();
		System.out.println("View Products name\n" + producttext.getText());

	}

	public void renameoption() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		viewrequisition.click();
		requistioncheckbox.click();
		renamerequsition.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reqname.sendKeys("lakshay");
		updatesaverequistion.click();
		System.out.println("Rename Requistion list is working succesfully");
	}

	public void moveoption() {

		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		viewrequisition.click();
		requistioncheckbox.click();
		moveclick.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		movedropdown.click();
		System.out.println("Message after moving product from one requisition list to another requistion list\n"
				+ movesuccessmsg.getText());
	}

	public void copyoption() {
		reuisitionlist.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		viewrequisition.click();
		requistioncheckbox.click();
		copyclick.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		copydropdown.click();
		System.out.println(
				"Message after copying one requisition list to another requistion list\n" + movesuccessmsg.getText());

	}

	public void removeoption() {
		{
			reuisitionlist.click();
			try {
				Thread.sleep(4000);
			} catch (Exception e) {

			}
			viewrequisition.click();
			requistioncheckbox.click();
			removeoption.click();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			deletebypopup.click();
			System.out.println("Product is removed succesfully by remove option");
		}
	}

	public void rewardpoint() {
		rewardpoints.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		subscribeupdate.click();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		savesubscription.click();
		System.out.println("Message after subscription for balance update in reward point\n" + balancesuccessmsg.getText());
	}

	public void subscribepoint() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		rewardpoints.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		savesubscription.click();
		System.out.println("Message after subscription for point expiry notifications\n" + balancesuccessmsg.getText());
	}

	public void expandstructure() {
		companystructure.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void collapse() {
		companystructure.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void addnewuser() {

		companyuser.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		addnewuser.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		jobtitle.sendKeys("Manager");
		userrole.click();
		firstname.sendKeys("Lakshay");
		lastname.sendKeys("Sharma");
		email.sendKeys("lakhay@gmail.com");
		phonenumber.sendKeys("8750150133");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		save.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after adding new customer:");
		System.out.println(message.getText());

	}

	public void edituser() {
		companyuser.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		edit.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		jobtitle.sendKeys("Manager");
		phonenumber.sendKeys("8750150133");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		save.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after edit customer:");
		System.out.println(message.getText());
	}

	public void deleteuser() {
		companyuser.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		delete.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		delete1.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Message after delete customer:");
		System.out.println(message.getText());
	}

	public void addnewrole() {

		rolesandpermission.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		addnewrole.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		rolename.sendKeys("Ansh");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		saverole.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		saverole.click();
		/*
		 * System.out.println("Message after adding new customer:");
		 * System.out.println(message.getText());
		 */
	}
	public void duplicaterole()
	{
		
		rolesandpermission.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		duplicaterole.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		saveaccountnameinfo.click();
	}
	
	
	public void editrole()
	{
		rolesandpermission.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		editrole.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		rolenameedit.sendKeys("yadav");
		saveaccountnameinfo.click();
		System.out.println("Edit action is working succesfully in Roles and permissions");
	}
	
	public void deleterole()
	{
		rolesandpermission.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		deleterole.click();
        try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}	
        delete2role.click();
        System.out.println("Message after deleting user\n"+message.getText());
	}
	
	
}
