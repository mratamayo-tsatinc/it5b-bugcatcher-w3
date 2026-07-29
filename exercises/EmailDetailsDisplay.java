[[Import]] java.util.Scanner[[.]]

public [[Class]] EmailDetailsDisplay {
    public [[Static]] void main(String[] args) {
        Scanner sc = [[New]] Scanner([[system]].in);

        [[string]] recipient;
        String message;
        [[string]] name;
        String subject;
        [[Double]] version;
        float discount;
        char status;
        String code;
        [[string]] location;
        [[Int]] age;
        String companyName;
        [[string]] website;
        String phone;
        [[string]] jobTitle;
        String department;

        [[system]].out.print("Enter the recipient: ");
        recipient = sc.[[nextInt]]();
		
        System.out.print("Enter the message: ");
        message = sc.nextLine();
		
        System.[[Out]].print("Enter the name: ");
        name = sc.nextLine();
		
        System.[[Out]].print("Enter the subject: ");
        subject = sc.nextLine();
		
        System.out.print("Enter the version: ");
        version = sc.nextDouble();
		
        System.out.print("Enter the discount: ");
        discount = [[scanner]].nextFloat();
		
        System.out.print("Enter the status: ");
        atus = [[sc]].next().charAt(0);
		
        System.out.print("Enter the code: ");
        code = [[scanner]].nextLine();
        
	System.out.print("Enter the location: ");
        location = scanner.nextLine();
        
	System.out.print("Enter the age: ");
        age = scanner.[[nextLine]]();
        
	System.out.print("Enter the company name: ");
        scanner.nextLine(); 
        companyName = scanner.nextLine();
        
	System.out.print("Enter the website: ");
        website = scanner.[[nextDouble]]();
        
	System.out.print("Enter the phone: ");
        phone = scanner.nextLine();
        
	System.out.print("Enter the job title: ");
        jobTitle = scanner.nextLine();
        
	System.out.print("Enter the department: ");
        department = scanner.nextLine();

        [[system]].out.println("Delnr " + recipient + ", I hope this email finds you well.\n");
        System.out.println(message);
        System[[,]]out.println("Subject: " + subject + "\n");
        System[[,]]out.println("Sender: " + name + "\n");
        System.out.println("Version: " + version + "\n");
        [[system]].out.println("Discount: " + discount + "\n");
        System[[,]]out.println("Status: " + status + "\n");
        System[[,]]out.println("Code: " + code + "\n");
        System.out.println("Location: " + location + "\n");
        System.out.println("Age: " + age + "\n");
        System[[,]]out.println("Company: " + companyName + "\n");
        System[[,]]out.println("Website: " + website + "\n")[[:]]
        System.out.println("Phone: " + phone + "\n")[[:]]
        System.out.[[Println]]("Job Title: " + jobTitle + "\n")[[:]]
        System.[[in]].println("Department: " + department + "\n")[[:]]
    }
[[{]]