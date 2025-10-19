# Reflection
### Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?**  
Artemis Financial is a fictional financial consulting company that develops individualized financial plans for its customers. The company has a public web application and is seeking expertise on how to protect its client data and financial information.  

### What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?**  
I believe that I did well identifying how a vulnerability would impact the system and then creating a plan to refactor the system more securely. Writing secure code is extremely important due to the number of threats in the real world looking to exploit the system you are working on. It is not a question of if but when an attack on the system will occur. The best defense to breaches is not responding to the attack but reducing the attack surface by preventing vulnerabilities in each library created for the system.  

### Which part of the vulnerability assessment was challenging or helpful to you?**  
The most helpful part of the vulnerability assessment for myself was getting experience reviewing CVE information in the NVD and using the provided information to identify if and how a vulnerability applied to the software in question. I did not have experience in this area prior to the course and the ability to practice and receive feedback on my analysis has given me the confidence to assess real world software.  

### How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?**  
I increased the layers of security through common defense-in-depth strategies. The first step was to identify the vulnerable dependencies and update them to reduce the attack surface on the application. The next step was to ensure that the connections between the client and server were secure through the use of proper certificates and protocols. After securing the transmission the last step taken was creating checksum hashes so that integrity of the data was ensured this approach touched each point on the CIA triad.  

### How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?**  
To ensure that new dependency vulnerabilities were not introduced I re-ran my dependency checks. After ensuring the dependencies were still valid, I check that the calls made within the methods were still valid and not depreciated for the new version.  

### What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?**  
I believe one of the best resources I learned about on this course was OWASP. I will continue to use their dependency checks in my personal projects, and course work. Additionally, prior to this course security was not something I considered from my initial design point. In the future I will first attempt to identify what threats my applications are likely to encounter and how I can best design my application to reduce the potential attack surface prior to writing any code.  

### Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?  
I would like to show a potential future employer my Practices for Secure Software Report in this repository. I believe that it truly showcases my analytical process and that I can not only identify an issue but work to identify multiple solutions and then select the best solution.  
